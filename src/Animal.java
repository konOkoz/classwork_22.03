public class Animal implements Comparable<Animal> {
    String name;
    int weight;
    String colour;
    Animal(String name, int weight, String colour){
        this.name=name;
        this.weight=weight;
        this.colour=colour;
    }
    public int compareTo(Animal o){
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Animal{"+ name + " " + weight +" "+ colour + '}';
    }
}
