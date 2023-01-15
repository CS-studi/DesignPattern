package ch9.iterator.dinnermergeri;

import java.util.Iterator;
import java.util.function.Consumer;

public class DinerMenuIterator implements Iterator<MenuItem> {
    MenuItem[] list;
    int pos = 0;

    public DinerMenuIterator(MenuItem[] list){
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if(pos >= list.length || list[pos] ==null)
            return false;
        return true;
    }

    public MenuItem next(){
        MenuItem menuItem = list[pos];
        pos = pos+1;
        return menuItem;
    }

    @Override
    public void remove() {
        if (pos <= 0) {
            throw new IllegalStateException
                    ("You can't remove an item until you've done at least one next()");
        }
        if (list[pos-1] != null) {
            for (int i = pos-1; i < (list.length-1); i++) {
                list[i] = list[i+1];
            }
            list[list.length-1] = null;
        }
    }

    @Override
    public void forEachRemaining(Consumer<? super MenuItem> action) {
        Iterator.super.forEachRemaining(action);
    }


}
