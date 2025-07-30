package Wipro_Numbers;
public class SumLastDigits {   
    public static int addLastDigits(int input1, int input2) {
        input1 = Math.abs(input1);
        input2 = Math.abs(input2);
        int lastDigit1 = input1 % 10;
        int lastDigit2 = input2 % 10;
        return lastDigit1 + lastDigit2;
    }
    public static void main(String[] args) {
        System.out.println(addLastDigits(267, 154));    
        System.out.println(addLastDigits(267, -154));    
        System.out.println(addLastDigits(-267, 154));   
        System.out.println(addLastDigits(-267, -154));   
    }
}
