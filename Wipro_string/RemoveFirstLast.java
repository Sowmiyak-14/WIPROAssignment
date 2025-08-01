package Wipro_string;
public class RemoveFirstLast {
    public static void main(String[] args) {
        String str = "Suman";
        if (str.length() <= 2) {
            System.out.println(""); 
        } else {
            String result = str.substring(1, str.length() - 1);
            System.out.println(result);
        }
    }
}
