package java_hw_5.task1;

import java.util.Random;
import java.util.Scanner;

public class NumbersApplication {
    private String name;
    private int gameNumber;

    public NumbersApplication(String name) {
        this.name = name;
        Random random = new Random();
        this.gameNumber = random.nextInt(101);
    }

    public void startGame(Scanner scanner) {
        System.out.println("Let the game begin!");

        while (true) {
            System.out.print("Please, enter your number: ");
            int userNumber = scanner.nextInt();
            if (userNumber < this.gameNumber) {
                System.out.println("Your number is too small. Please, try again.");
            } else if (userNumber > this.gameNumber) {
                System.out.println("Your number is too big. Please, try again.");
            } else {
                System.out.println("Congratulations, " + this.name + "!");
                break;
            }
        }
    }
}
