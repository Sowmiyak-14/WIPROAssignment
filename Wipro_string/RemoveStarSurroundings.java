package Wipro_string;
public class RemoveStarSurroundings {
    public static void main(String[] args) {
        String str = "ab*cd";
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < str.length(); i++) {
            if ((i > 0 && str.charAt(i - 1) == '*') || 
                str.charAt(i) == '*' || 
                (i < str.length() - 1 && str.charAt(i + 1) == '*')) {
                continue;
            }
            result.append(str.charAt(i));
        }

        System.out.println(result.toString());
    }
}
