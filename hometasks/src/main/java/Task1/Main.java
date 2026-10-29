package Task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        Map <String, Person > personMap = new HashMap<>();
        System.out.println("-----People list management program-----");
        System.out.println("Available commands: addPerson, getPerson, exit");

        while (true) {
            System.out.println("Enter the command");
            String command = scanner.nextLine().trim();

            if (command.equalsIgnoreCase("exit")) {
                System.out.println("The program is finished. Goodbye!");
                break;
            } else if (command.equalsIgnoreCase("addPerson")) {
                System.out.println("Enter a surname of person:");
                String surname = scanner.nextLine().trim();
                String key = surname.toUpperCase();
                System.out.println("Enter a name of person");
                String name = scanner.nextLine().trim();

                int age = 0;

                while (true) {
                    System.out.println("Enter the person's age (integer):");
                    String ageInput = scanner.nextLine().trim();
                    try {
                        age = Integer.parseInt(ageInput);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Error! A non-numeric value was entered. Please try again.");
                    }
                }

                if (personMap.containsKey(key)) {
                    System.out.println("A person with this surname already exists on the list.");
                    System.out.println("Do you want to replace the information? Enter \"yes\" or \"no\":");
                    String answer = scanner.nextLine().trim().toLowerCase();

                    if (answer.equals("yes")) {
                        personMap.put(key, new Person(name, surname, age));
                        System.out.println("The person's information has been successfully updated.");
                    } else {
                        System.out.println("The information has not been updated.");
                    }
                } else {
                    personMap.put(key, new Person(name, surname, age));
                    System.out.println("The person has been successfully added to the list.");
                }
            } else if (command.equalsIgnoreCase("getPerson")) {
                if (personMap.isEmpty()) {
                    System.out.println("The list of people is empty.");
                    continue;
                }
                System.out.println("Enter surname to search");
                String searchSurname = scanner.nextLine().trim().toUpperCase();

                if (personMap.containsKey(searchSurname)) {
                    Person person = personMap.get(searchSurname);
                    System.out.println("Person found: " + person);
                } else {
                    System.out.println("The entered last name is not in the list.");
                    System.out.println("Available surnames: " + personMap.keySet());
                }
            } else {
                System.out.println("Unknown operation. Try again (type addPerson, getPerson, or exit).");
            }
        }
        scanner.close();
    }
}