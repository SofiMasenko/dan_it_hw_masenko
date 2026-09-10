package java_hw_4.task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder str = new StringBuilder();
        System.out.println("\n" + "Enter words one at a time. To finish, enter 'Stop': ");
        while (true) {
            String word = scanner.next();
            if (word.equalsIgnoreCase("Stop")) {
                break;
            }
            str.append(word).append(" ");
        }
        System.out.println("Your sentence:");
        System.out.println(str.toString().trim() + ".");
    }
}
