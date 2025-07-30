package Wipro_Numbers;
public class IsOdd {
    public static int isOdd(int num) {
        if (num == 0 || num % 2 == 0)
            return 1;
        else
            return 2;
    }
    public static void main(String[] args) {
        System.out.println(isOdd(3));   
        System.out.println(isOdd(4));   
        System.out.println(isOdd(0));   
    }
}
