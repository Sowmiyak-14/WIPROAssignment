public class OddEvencountarrange {

    public static void main(String[] args) {
        String input = "361589";
        String result = arrangeOddEvenWithCount(input); // calling the method
        System.out.println("Output: " + result); // prints: 31594682
    }

    // Method that returns the arranged string
    public static String arrangeOddEvenWithCount(String input) {
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();
        int oddCount = 0, evenCount = 0;

        for (char ch : input.toCharArray()) {
            int digit = ch - '0';
            if (digit % 2 != 0) { // odd
                odd.append(digit);
                oddCount++;
            } else { // even
                even.append(digit);
                evenCount++;
            }
        }

        // Return the final combined result
        return odd.toString() + oddCount + even.toString() + evenCount;
    }
}
    
