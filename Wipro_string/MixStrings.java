package Wipro_string;
public class MixStrings {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "World";
        StringBuffer result = new StringBuffer();
        int max = Math.max(a.length(), b.length());
        for (int i = 0; i < max; i++) {
            if (i < a.length()) result.append(a.charAt(i));
            if (i < b.length()) result.append(b.charAt(i));
        }
        System.out.println(result.toString());
    }
}

