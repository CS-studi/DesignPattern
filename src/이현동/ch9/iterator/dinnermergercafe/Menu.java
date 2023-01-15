package ch9.iterator.dinnermergercafe;

import java.util.Iterator;

public interface Menu {
    public Iterator<MenuItem> createIterator();
}
