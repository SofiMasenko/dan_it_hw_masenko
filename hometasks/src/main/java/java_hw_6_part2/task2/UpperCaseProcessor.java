package java_hw_6_part2.task2;

public class UpperCaseProcessor implements TextProcessor {
    @Override
    public String process(String text) {
        if (text == null) {
            return "";
        }
        return text.toUpperCase();
    }
}
