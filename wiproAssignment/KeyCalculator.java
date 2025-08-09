package wiproAssignment;

public class KeyCalculator {
    public static int findKey(int input1, int input2, int input3) {
        int thousandDigit = input1/1000;
        int hundredDigit = (input2/100) % 10;
        int smallDigit = 9;
        int temp = input3;
        while (temp > 0) {
            int digit = temp % 10;
            if (digit < smallDigit) {
                smallDigit = digit;
            }
            temp /= 10;
        }
        int key = (thousandDigit*hundredDigit) + smallDigit;
        return key;
    }
    public static void main(String... args) {
        int input1 = 3521;
        int input2 = 2452;
        int input3 = 1352;
        int key = findKey(input1, input2, input3);
        System.out.println(key); 
     }
}
