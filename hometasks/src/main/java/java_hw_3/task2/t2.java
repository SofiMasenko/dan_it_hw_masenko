package java_hw_3.task2;

import java.util.Scanner;

public class t2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Введіть першу сторону (а): ");
        int a = scanner.nextInt();

        System.out.print("Введіть другу сторону (b): ");
        int b = scanner.nextInt();

        System.out.print("Введіть третю сторону (c): ");
        int c = scanner.nextInt();

        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("Так, трикутник із такими сторонами існує.");
        } else {
            System.out.println("Ні, з цих сторін неможливо побудувати трикутник.");
        }


    }
}
