package wiproAssignment;
public class LarSmallKeySb {
	static int minDigit(int n) {
		int min=9;
		while (n > 0) {
			min = Math.min(min,n % 10);
			n/=10;
		}
		return min;
	}
	static int maxDigit(int n) {
		int max=0;
		while (n > 0) {
			max = Math.max(max,n % 10);
			n/=10;
		}
		return max;
	}
  public static void main(String... args) {
      int a=3521, b=2452, c=1352;
      int key = ( maxDigit(a)+maxDigit(b)+maxDigit(c) ) - ( minDigit(a)+minDigit(b)+minDigit(c));
      System.out.println(key);
  }
}
