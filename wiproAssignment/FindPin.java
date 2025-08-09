package wiproAssignment;
public class FindPin {
    public static void main(String[] args) {
        int input1 = 3521, input2 = 2452, input3 = 1352, input4 = 38;
        int pin = (largest(input1) * smallest(input1)+ largest(input2) * smallest(input2) + largest(input3) * smallest(input3)) - input4;
        System.out.println("PIN: " + pin); 
    }
    public static int largest(int n) {
        int max = Integer.MIN_VALUE;
        while (n > 0) {
            int digit = n % 10;
            if (digit > max) {
                max = digit;
            }
            n /= 10;
        }
        return max;
    }
    public static int smallest(int n) {
        int min = Integer.MAX_VALUE;
        while (n > 0) {
            int digit = n % 10;
            if (digit < min) {
                min = digit;
            }
            n /= 10;
        }
        return min;
    }
}
