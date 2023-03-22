import java.util.Comparator;

public class SortByWeight implements Comparator<Animal> {

    public int compare (Animal o1, Animal o2){
     return Integer.compare(o1.weight,o2.weight);
    }
}
