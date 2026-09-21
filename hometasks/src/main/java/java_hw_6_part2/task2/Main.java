package java_hw_6_part2.task2;

public class Main {
    public static void main(String[] args) {
        TextProcessor upperProcessor = new UpperCaseProcessor();
        TextProcessor reverseProcessor = new ReverseProcessor();
        TextProcessor trimProcessor = new TrimProcessor();

        String inputText = "My. Name. Is. Sofiia. ";

        System.out.println("Initial line: \"" + inputText + "\"\n");

        System.out.println("-----UpperCaseProcessor-----");
        String upperResult = upperProcessor.process(inputText);
        System.out.println("Result process(): \"" + upperResult + "\"");
        System.out.println("Result removeDigits(): \"" + upperProcessor.removeDigits(inputText) + "\"\n");

        System.out.println("-----ReverseProcessor------");
        String reverseResult = reverseProcessor.process(inputText);
        System.out.println("Result process(): \"" + reverseResult + "\"");
        System.out.println("Result removeDigits(): \"" + reverseProcessor.removeDigits(inputText) + "\"\n");

        System.out.println("------TrimProcessor------");
        String trimResult = trimProcessor.process(inputText);
        System.out.println("Result process(): \"" + trimResult + "\"");
        System.out.println("Result removeDigits(): \"" + trimProcessor.removeDigits(inputText) + "\"");
    }
}
