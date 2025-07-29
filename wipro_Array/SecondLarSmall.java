package wipro_Array;
public class SecondLarSmall {
    public static void main(String[] args) {
        int[] arr = {10, 4, 88, 23, 5};
        int min1 = arr[0], min2 = arr[0];
        int max1 = arr[0], max2 = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min1) min1 = arr[i];
            if (arr[i] > max1) max1 = arr[i];
        }
        min2 = Integer.MAX_VALUE;
        max2 = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > min1 && arr[i] < min2) min2 = arr[i];
            if (arr[i] < max1 && arr[i] > max2) max2 = arr[i];
        }
        System.out.println("Smallest two: " + min1 + ", " + min2);
        System.out.println("Largest two: " + max1 + ", " + max2);
    }
}
