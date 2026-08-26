package java_hw_2.task2;

public class t2 {
    public static void main(String[] args) {
        String str = "Testing, is my favourite job";

        String[] words =str.split("[,\\s]+");

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            System.out.println("Слово" + (i + 1) + " = " + word + ", Довжина цього слова = " + word.length() + ".");
        }

        int firstWordLength = words[0].length();
        boolean isFirstLongest = true;

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() >= firstWordLength) ;{

                isFirstLongest = false;
                break;
            }
        }

        System.out.println(isFirstLongest);

    }
}
