package lesson34;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lin {
    public static void main(String[] args) {

    //LinkedList<Person> list = new LinkedList<>();
   List<Person> list = new ArrayList<>();

    Person person1 = new Person("White");
    Person person2 = new Person("Rabbit");

    list.add(person1);
    list.add(person2);

        /*System.out.println(list.getFirst());
        System.out.println(list.getLast());*/

        Iterator<Person> iterator = list.iterator();

        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
    }
}
