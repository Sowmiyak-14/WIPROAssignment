package Wipro_string;

public class RepeatSubStr  {
    public static void main(String[] args) {
        String str = "Wipro";
        int n = str.length();

        String sub = str.substring(0, 2);
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < n; i++) {
            result.append(sub);
        }

        System.out.println(result.toString());
    }
}

