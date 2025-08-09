package Wipro_string;
public class ShortLongShort {
    public static void main(String[] args) {
        String a = "hi";
        String b = "hello";

        String shortStr = a.length() < b.length() ? a : b;
        String longStr = a.length() < b.length() ? b : a;

        StringBuffer result = new StringBuffer();
        result.append(shortStr);
        result.append(longStr);
        result.append(shortStr);

        System.out.println(result.toString());
    }
}

