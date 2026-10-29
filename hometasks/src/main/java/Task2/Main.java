package Task2;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Sofia", "Masenko", 27);
        Person person2 = new Person("Nastya", "Pavlova", 30);
        Person person3 = new Person("Kostya", "Dehnich", 27);
        Person person4 = new Person("Sofia", "Masenko", 27);
        Person person5 = new Person("Mykola", "Masenko", 31);
        Person person6 = new Person("Nastya", "Pavlova", 30);

        Set <Person> personSet = new HashSet<>();

        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);
        personSet.add(person4);
        personSet.add(person5);
        personSet.add(person6);

        System.out.println("Elements in Set after addition: ");

        for (Person person : personSet){
            System.out.println(person);
        }

        System.out.println("Collection size: " + personSet.size());
        System.out.println("Is the collection empty? " + personSet.isEmpty());

        boolean containsKostya = personSet.contains(person3);
        System.out.println("Does the collection contain Kostya Dehnich? " + containsKostya);

        personSet.remove(person1);
        System.out.println("After removing Sofia, the size became: " + personSet.size());

        Set <Person> newPersons = new HashSet<>();
        newPersons.add(new Person ("Oksana", "Boyko", 31));
        newPersons.add(new Person ("Oksana", "Boyko", 31));
        newPersons.add(new Person ("Valeria", "Nikityuk", 31));

        personSet.addAll(newPersons);
        System.out.println("After adding a collection via addAll size: " + personSet.size());

        personSet.clear();
        System.out.println("Is the collection empty? " + personSet.isEmpty());
    }
}
