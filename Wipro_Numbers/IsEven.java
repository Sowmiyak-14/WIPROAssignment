package Wipro_Numbers;
public class IsEven {
    public static int isEven(int num) {
        if (num % 2== 0)
            return 2;
        else
            return 1;
    }
    public static void main(String[] args) {
        System.out.println(isEven(4));   
        System.out.println(isEven(5));  
        System.out.println(isEven(0));  
    }
}
