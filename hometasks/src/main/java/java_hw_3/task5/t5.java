package java_hw_3.task5;

import java.util.Scanner;

public class t5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть перше число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введіть друге число: ");
        double num2 = scanner.nextDouble();

        System.out.print("Оберіть необхідну операцію (+, -, *, /, %): ");
        char operation = scanner.next() .charAt(0);

        double result = (operation == '+' ) ? (num1+num2) :
                (operation == '-') ? (num1-num2) :
                        (operation == '*') ? (num1*num2) :
                                (operation == '/') ? (num1/num2) :
                                        (operation == '%') ? (num1%num2) : 0;

        System.out.println( "Результат= " + result);


    }
}
