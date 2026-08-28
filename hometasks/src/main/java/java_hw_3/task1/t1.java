package java_hw_3.task1;

import java.util.Scanner;

public class t1 {
    public static void main(String[] args) {

        String str = "Я тестую чудово. Що ще потрібно?";

        Scanner scanner = new Scanner (str);

        String string1 = scanner.next();
        String string2 = scanner.next();
        String string3 = scanner.next();
        String string4 = scanner.next() + " " + scanner.next() + " " + scanner.next();

        System.out.println("String1 = " + string1);
        System.out.println("String2 = " + string2);
        System.out.println("String3 = " + string3);
        System.out.println("String4 = " + string4);
    }
}
