package java_hw_3.task3;

import java.util.Scanner;

public class t3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть перше число: ");
        int first = scanner.nextInt();

        System.out.print("Введіть друге число: ");
        int second = scanner.nextInt();

        int difference = (first > second)? (first - second) : (second - first);

        System.out.println("Різниця (від більшого менше): " + difference);



    }
}
