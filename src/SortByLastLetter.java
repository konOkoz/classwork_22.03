import java.util.Comparator;

public class SortByLastLetter implements Comparator<Animal> {

    public int compare(Animal o1, Animal o2){
        String length1 = o1.name.substring(o1.name.length()-1);
        String length2 = o2.name.substring(o2.name.length()-1);
        return length1.compareTo(length2);
    }
}
