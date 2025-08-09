package wiproAssignment;

public class LargeOf3 {
   public static void main(String... args) {
	   int input1 = 3521;
	   int input2 = 2452;
	   int input3 = 1352;
	   int input4 = 38;
	   int pin = (Largest(input1) * Largest(input2) * Largest(input3)) +input4;
	   System.out.println(pin);
   }

   public static int Largest(int n) {
	int max = Integer.MIN_VALUE;
	while(n > 0) {
		int digit = n % 10;
		if(digit > max) {
			max = digit;
		}
		n/=10;
	}
	return max;
   }
}
