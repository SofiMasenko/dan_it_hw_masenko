package java_hw_4.task6;

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        int[] array = new int[45];
        Random random = new Random();
        for (int i = 0; i < array.length; i++ ) {
            array [i] = random.nextInt(101) -50;
        }
        System.out.println("Generated array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        int min = array [0];
        int max = array[0];
        for( int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Minimum element in an array: " + min);
        System.out.println("Maximum element in an array: " + max);
    }
}
