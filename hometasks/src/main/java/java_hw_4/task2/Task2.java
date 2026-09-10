package java_hw_4.task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a whole number: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int reservedNumber = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            reservedNumber = ( reservedNumber*10 ) + lastDigit;
            number = number / 10;
        }
        System.out.println();
        if (originalNumber==reservedNumber) {
            System.out.println("Numeric" + " " + originalNumber + " is a palindrome. ");}
        else {
            System.out.println("Numeric" + " " + originalNumber + " is NOT a palindrome. ");
        }
        scanner.close();
    }
}
