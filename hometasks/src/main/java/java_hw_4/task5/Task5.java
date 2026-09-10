package java_hw_4.task5;

import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(20) + 1;
        }
        System.out.println("Generated array: ");
        for (int num : numbers) {
            System.out.println(num + " ");
        }
        System.out.println();
        System.out.print("Enter a number to search for in the array: ");
        int searchNumber = scanner.nextInt();
        boolean isFound = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchNumber) {
                isFound = true;
                break;
            }
        }
        if (isFound) {
            System.out.println("Yes, numeric " + searchNumber + " is in the array!");
        }
        else {
            System.out.println("No, numeric " + searchNumber + " not in the array.");
        }
        scanner.close();
    }
}
