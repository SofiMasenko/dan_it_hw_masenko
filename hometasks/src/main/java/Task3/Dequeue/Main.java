package Task3.Dequeue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Deque <String> pets = new ArrayDeque<>();

        pets.offerLast("Fedya");
        pets.offerLast("Aliska");
        pets.offerFirst("Rizhiy");
        pets.offerLast("Roo");
        pets.offerLast("Rizhiy");
        pets.offerLast("Fedya");

        System.out.println("We bring out the whole dequeue: ");
        System.out.println(pets);

        System.out.println("We get the first element via getFirst(): ");
        System.out.println(pets.getFirst());

        System.out.println("We get the last element via getLast(): ");
        System.out.println(pets.getLast());

        System.out.println("We output the dequeue after the get methods:");
        System.out.println(pets);

        System.out.println("We look at the first element via peekFirst(): ");
        System.out.println(pets.peekFirst());

        System.out.println("We look at the last element via peekLast(): ");
        System.out.println(pets.peekLast());

        System.out.println("We remove and return the first element via pollFirst(): ");
        System.out.println(pets.pollFirst());

        System.out.println("We output the dequeue after pollFirst():");
        System.out.println(pets);

        System.out.println("We remove and return the last element via pollLast(): ");
        System.out.println(pets.pollLast());

        System.out.println("We output the dequeue after pollLast(): ");
        System.out.println(pets);

        System.out.println("We remove the first element from the stack using pop(): ");
        System.out.println(pets.pop());

        System.out.println("We output the dequeue after pop(): ");
        System.out.println(pets);

        System.out.println("We remove the first element using removeFirst(): ");
        System.out.println(pets.removeFirst());

        System.out.println("We output the dequeue after removeFirst(): ");
        System.out.println(pets);

        System.out.println("We remove the last element using removeLast(): ");
        System.out.println(pets.removeLast());

        System.out.println("We output the dequeue after removeLast(): ");
        System.out.println(pets);

        pets.offerLast("Persik");
        pets.offerLast("Kokos");
        pets.offerLast("Persik");

        System.out.println("(Added new elements to demonstrate deleting occurrences): "+ pets);

        System.out.println("We remove the first occurrence of the element 'Persik' via removeFirstOccurrence('Persik'): ");
        System.out.println(pets.removeFirstOccurrence("Persik"));

        System.out.println("We output the dequeue after removeFirstOccurrence(): ");
        System.out.println(pets);

        System.out.println("We remove the last occurrence of the element 'Persik' via removeLastOccurrence('Persik'): ");
        System.out.println(pets.removeLastOccurrence("Persik"));

        System.out.println("We output the dequeue at the end of the program:");
        System.out.println(pets);




    }
}
