package lesson34;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Java SE. Урок 34. Коллекции ArrayList & LinkedList
public class Main {

    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();

        Person person1 = new Person("White");
        Person person2 = new Person("Rabbit");

        list.add(person1);
        list.add(person2);

        /*Person person1FromCollection = list.get(0);
        Person person2FromCollection = list.get(1);
*/

        boolean remove = list.remove(person1);
        System.out.println(remove);

        /*System.out.println(person1FromCollection);
        System.out.println(person2FromCollection);*/

        Person person = list.get(0);
        System.out.println("person = " + person);

        //list.add(500,person2);
        System.out.println(list.size());  //сколько элементов в коллекции

        System.out.println(list.isEmpty());  //пустая ли?

        // list.clear();  //чистит коллекцию
        System.out.println(list.isEmpty());


        System.out.println(list.contains(person1));

        //list.indexOf();  //возвращает индекс под каким находится элемент

        //  Object[] objects = list.toArray();

        Iterator<Person> iterator = list.iterator();

        while (iterator.hasNext()) {   //если есть этот элемент
            //Person iterPerson = iterator.next();
            iterator.remove();  //удаляем
        }
    }
}
