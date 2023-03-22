import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AnimalMain {
    public static void main(String[] args) {
       /*
        Создать класс Animal с полями  String name, int weight, String colour.
        Используя компараторы, в классе AnimalMain  создать и вывести на экран  список животных упорядоченный:
        1. по названию
        2. по весу
        3. список названий животных, упорядоченный по возрастанию последней буквы имени
        [ Wolf, Fox, Anakonda, Bear, Elephant] ->
        Anakonda
        Wolf
        Bear
        Elephant
        Fox
         */
        Animal wolf = new Animal("Wolf",75,"white");
        Animal fox = new Animal("Fox",45,"Red");
        Animal anakonda = new Animal("Anakonda",78,"green");
        Animal bear = new Animal("Bear",240,"white");
        Animal elephant = new Animal("Elephant",1002,"grey");

        List<Animal> zoo = new ArrayList<>();
        zoo.add(wolf);
        zoo.add(fox);
        zoo.add(anakonda);
        zoo.add(bear);
        zoo.add(elephant);
        System.out.println(zoo);
        System.out.println("Sorted by names:");
        Collections.sort(zoo);
        for(Animal animal: zoo){
            System.out.println(animal);
        }
        System.out.println("----------------------------------------");
        System.out.println("Sorted by weight:");
        Collections.sort(zoo,new SortByWeight());
        for(Animal animal: zoo) {
            System.out.println(animal);
        }
        System.out.println("----------------------------------------");
        System.out.println("Sorted by lastLetter:");
        Collections.sort(zoo,new SortByLastLetter());
        for(Animal animal: zoo){
            System.out.println(animal.name);
        }

        /* OUT:
[Animal{Wolf 75 white}, Animal{Fox 45 Red}, Animal{Anakonda 78 green}, Animal{Bear 240 white}, Animal{Elephant 1002 grey}]
Sorted by names:
Animal{Anakonda 78 green}
Animal{Bear 240 white}
Animal{Elephant 1002 grey}
Animal{Fox 45 Red}
Animal{Wolf 75 white}
----------------------------------------
Sorted by weight:
Animal{Fox 45 Red}
Animal{Wolf 75 white}
Animal{Anakonda 78 green}
Animal{Bear 240 white}
Animal{Elephant 1002 grey}
----------------------------------------
Sorted by lastLetter:
Anakonda
Wolf
Bear
Elephant
Fox
         */
    }
}