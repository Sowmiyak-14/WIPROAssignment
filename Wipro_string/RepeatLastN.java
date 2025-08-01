package Wipro_string;
public class RepeatLastN {
    public static void main(String[] args) {
        String str = "Welcome";
        int n = 3;
        String lastPart = str.substring(str.length() - n);
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < n; i++) {
            result.append(lastPart);
        }
        System.out.println(result.toString());
    }
}
