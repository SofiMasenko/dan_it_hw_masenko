package java_hw_4.task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the maximum warehouse capacity (weight): ");
        double capacity = scanner.nextDouble();
        System.out.println("Warehouse is ready for work. Free space: " + capacity);
        while (capacity > 0) {
            System.out.println("Enter the weight of metal to be delivered: ");
            double weight = scanner.nextDouble();
            if (weight < 5) {
                System.out.println("Error! The warehouse does not accept such a small weight (minimum 5 kg). ");
                continue;
            }
            if (weight > capacity) {
                System.out.println("Error! There is not enough space in the warehouse. Only: " + capacity);
                continue;
            }
            capacity = capacity - weight;
            if (capacity > 0 ) {
                System.out.println("Metal accepted! Space left in stock: " + capacity);
            }
        }
        System.out.println("The warehouse is full! The program is complete..");
        scanner.close();
    }
}
