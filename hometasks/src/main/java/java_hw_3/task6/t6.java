package java_hw_3.task6;


import java.util.Scanner;

public class t6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Яка програма вас цікавить? (IntelliJ IDEA, Git, Java): ");
        String program = scanner.nextLine().trim().toLowerCase();

        switch (program) {
            case "IntelliJ IDEA":
                System.out.print("Яку ОС ви використовуєте? (Linux, MacOS, Windows): ");
                String osIdea = scanner.nextLine().trim().toLowerCase();

                switch (osIdea) {
                    case "windows":
                        System.out.println("Посилання для Windows: https://www.jetbrains.com/idea/download/?section=windows");
                        break;
                    case "macos":
                        System.out.println("Посилання для MacOS: https://www.jetbrains.com/idea/download/?section=mac ");
                        break;
                    case "linux":
                        System.out.println("Посилання для Linux: https://www.jetbrains.com/idea/download/?section=linux");
                        break;
                    default:
                        System.out.println("Помилка: такої ОС немає.");
                        break;
                }
                break;

            case "git":
                System.out.print("Яку ОС ви використовуєте? (Linux, MacOS, Windows): ");
                String osGit = scanner.nextLine().trim().toLowerCase();

                switch (osGit) {
                    case "windows":
                        System.out.println("Посилання для Windows: https://git-scm.com/install/windows ");
                        break;
                    case "macos":
                        System.out.println("Посилання для MacOS: https://git-scm.com/install/mac ");
                        break;
                    case "linux":
                        System.out.println("Посилання для Linux: https://git-scm.com/install/linux");
                        break;
                    default:
                        System.out.println("Помилка: такої ОС немає.");
                        break;
                }
                break;
            case "java":
                System.out.print("Яку ОС ви використовуєте? (Linux, MacOS, Windows): ");
                String osJava = scanner.nextLine().trim().toLowerCase();

                switch (osJava) {
                    case "windows":
                        System.out.println("Посилання для Windows: https://www.oracle.com/java/technologies/downloads/#java17-windows ");
                        break;
                    case "macos":
                        System.out.println("Посилання для MacOS: https://www.oracle.com/java/technologies/downloads/#java17-mac ");
                        break;
                    case "linux":
                        System.out.println("Посилання для Linux: https://www.oracle.com/java/technologies/downloads/#java17-linux");
                        break;
                    default:
                        System.out.println("Помилка: такої ОС немає.");
                        break;
                }
                break;
            default:
                System.out.println("Такої програми не існує.");
                break;
        }

        scanner.close();
    }
}




