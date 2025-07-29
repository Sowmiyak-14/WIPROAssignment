package wipro_ifelse;
public class CharacterCheck {

    public static String classifyChar(char ch) {
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            return "Alphabet";
        } else if (ch >= '0' && ch <= '9') {
            return "Digit";
        } else {
            return "Special Character";
        }
    }
    public static void main(String[] args) {
        char ch = '$'; 
        String result = classifyChar(ch);
        System.out.println(result);
    }
}
