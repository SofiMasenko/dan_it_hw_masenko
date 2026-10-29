package Task3.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<String> fruit = new LinkedList<>();

        fruit.offer("Apple");
        fruit.offer("Banana");
        fruit.offer("Peach");
        fruit.offer("Strawberry");
        fruit.offer("Cherry");

        System.out.println("We print the entire queue using System.out.println(queue): ");
        System.out.println(fruit);

        System.out.println("We get the head element of the queue via element() without removing it: ");
        System.out.println(fruit.element());

        System.out.println("We output the entire queue after element(): ");
        System.out.println(fruit);

        System.out.println("We get the head element of the queue via peek(): ");
        System.out.println(fruit.peek());

        System.out.println("We output the entire queue after peek(): ");
        System.out.println(fruit);

        System.out.println("We remove and return the head element of the queue via poll(): ");
        System.out.println(fruit.poll());

        System.out.println("We output the entire queue after poll(): ");
        System.out.println(fruit);

        System.out.println("We remove and return the head element of the queue via remove(): ");
        System.out.println(fruit.remove());

        System.out.println("We output the entire queue after remove(): ");
        System.out.println(fruit);

        fruit.offer("Lemon");
        fruit.offer("Melon");

        System.out.println("We output the current queue size via size(): ");
        System.out.println(fruit.size());

        System.out.println("We iterate over and output the queue elements using a for-each loop: ");
        for (String val : fruit) {
            System.out.println(val);
        }
    }
}
