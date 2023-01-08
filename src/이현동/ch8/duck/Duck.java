package ch8.duck;

public class Duck implements Comparable<Duck>{
    String name;
    int weight;

    public Duck(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + " weighs" + weight;
    }


    @Override
    public int compareTo(Duck o) {
        if(this.weight < o.weight){
            return -1;
        }else if(this.weight == o.weight){
            return 0;
        }else return 1;
    }
}
