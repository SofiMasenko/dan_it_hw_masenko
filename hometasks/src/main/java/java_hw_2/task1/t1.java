package java_hw_2.task1;

public class t1 {
    public static void main(String[] args) {
        String Str1 = "This line that i want to cut, cause it is too long";

        int wordStart = Str1.indexOf("cause");
        int endIndex = wordStart + "cause".length();

        String Str2 = Str1.substring(0, endIndex);


        String Str = Str2.replace(" i ", " don't ");


        String Str3 = Str + " It is perfect ";


        System.out.println(Str1 + " | Довжина " + Str1.length());
        System.out.println(Str2 + " | Довжина " + Str2.length());
        System.out.println(Str3 + " | Довжина " + Str3.length());
    }
}
