package java_hw_4.task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        String [] names = {"Petya", "Masha", "Elena", "Fedya", "Sasha", "Anton", "Gleb"} ;
        int [] times = {10, 12, 14, 16, 18, 20};
        String [] places = {"school", "gym", "church", "cinema", "clinics"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers (indexes) separated by a space or Enter.");
        int nameIndex = scanner.nextInt();
        int timeIndex = scanner.nextInt();
        int placeIndex = scanner.nextInt();
        String name = names[nameIndex];
        int time = times[timeIndex];
        String place = places[placeIndex];
        String preposition = "to the";
        System.out.println("Result: ");
        System.out.println(name + " will go " + preposition + " " + place + " at " + time + ":00");
        scanner.close();
    }
}
