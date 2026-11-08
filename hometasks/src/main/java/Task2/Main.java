package Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List <Person> persons = new ArrayList<>();
        persons.add(new Person("Vasil", "Simoneneko", 25, 2000));
        persons.add(new Person("Simon", "Petlura", 35, 3000));
        persons.add(new Person("Mykola", "Hvilyoviy", 35, 3500));
        persons.add(new Person("Mihaylo", "Hrushevskiy", 80, 4000));
        persons.add(new Person("Ivan", "Bagryaniy", 90, 2000));

        System.out.println("-----initial list of people-----");
        for (Person p :persons) {
            System.out.println(p);
        }

        List <String> youngPersonNames = persons.stream()
                .filter(person -> person.getAge() < 70)
                .map(Person::getName)
                .collect(Collectors.toList());

        System.out.println("-----Names of people under 70 years old----");
        System.out.println(youngPersonNames);
    }
}
