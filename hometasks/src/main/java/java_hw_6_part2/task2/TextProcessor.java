package java_hw_6_part2.task2;

public interface TextProcessor {
    String process(String text);
    default String removeDigits(String text) {
        if (text == null ) {
            return "";
        }
        return text.replace( ".", "");
    }
}
