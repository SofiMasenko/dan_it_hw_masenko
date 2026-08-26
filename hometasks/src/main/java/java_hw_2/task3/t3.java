package java_hw_2.task3;

public class t3 {
    public static void main(String[] args) {
        String string1 = "Completely random text in English. In it, we just need to determine how man times the character 'a' occurs there. And we can use the split method and the length method.";

        String lowerText = string1.toLowerCase();

        String[] pieces = lowerText.split("a");

        int piecesCount = pieces.length;

        int countOfA = piecesCount - 1;

        System.out.println("Символ 'a' (разом із 'A') зустрічається: " + countOfA + " разів.");

    }
}
