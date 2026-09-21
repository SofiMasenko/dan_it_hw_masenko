package java_hw_6_part2.task2;

public class ReverseProcessor implements TextProcessor {
    @Override
    public String process(String text) {
        if (text == null) {
            return "";
        }
        return new StringBuilder(text).reverse().toString();
    }
}