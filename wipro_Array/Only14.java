package wipro_Array;
import java.util.*;
public class Only14 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 4, 2};
        Only14 obj = new Only14();
        boolean result = obj.only14(arr);

        System.out.println("Result: " + result);
    }

    public boolean only14(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 1 && nums[i] != 4) {
                return false;
            }
        }
        return true;
    }
}
