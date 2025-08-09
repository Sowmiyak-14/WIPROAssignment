package Wipro_string;
public class FirstHalfEven {
    public static void main(String[] args) {
        String str = "TomCat";
        if (str.length() % 2 != 0) {
            System.out.println("null");
        } else {
            String result = str.substring(0, str.length() / 2);
            System.out.println(result);
        }
    }
}
