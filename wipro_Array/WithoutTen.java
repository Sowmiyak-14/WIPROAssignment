package wipro_Array;
import java.util.Arrays;
public class WithoutTen {
	public static void main(String[] args) {
		int[] arr = {1, 10, 10, 2};
		int[] result = withoutTen(arr);
        System.out.println(Arrays.toString(result));
	}
	public static int[] withoutTen(int[] nums) {
		int[] result = new int[nums.length];
		int index = 0;
		for (int num : nums) {
			if(num != 10) {
				result[index] = num;
				index++;
			}
		}
		return result;
	}

}
