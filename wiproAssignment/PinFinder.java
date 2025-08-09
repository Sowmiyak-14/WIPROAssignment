package wiproAssignment;
public class PinFinder {
    public static int findPIN(int a, int b, int c, int d) {
        int pin = 0;
        for (int n : new int[]{a, b, c}) {
            while (n > 0) {
                int digit = n % 10;
                if (d % 2 == 0 && digit % 2 == 0) pin += digit;
                if (d % 2 != 0 && digit % 2 != 0) pin += digit;
                n /= 10;
            }
        }
        return pin;
    }
    public static void main(String[] args) {
        System.out.println(findPIN(3521, 2452, 1352, 38)); 
        System.out.println(findPIN(3521, 2452, 1352, 37)); 
    }
}
//Output: 12
//Output: 23
