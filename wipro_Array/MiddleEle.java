package wipro_Array;
import java.util.Arrays;
public class MiddleEle {
	public static void main(String[] args) {
		int[] a = {1, 4, 4};
        int[] b = {7, 8, 9};
        int[] result = middleWay(a,b);
	    System.out.println("Result: " + Arrays.toString(result));
	}
public static int[] middleWay(int[] a, int[] b) {
	int[] arr = new int[2];
	arr[0] = a[a.length / 2];
    arr[1] = b[b.length / 2];
	return arr;
	
}
}
