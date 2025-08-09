public class Rev2D{
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Please enter 4 integer numbers");
            return;
        }

        int[][] arr = {
            {Integer.parseInt(args[0]), Integer.parseInt(args[1])},
            {Integer.parseInt(args[2]), Integer.parseInt(args[3])}
        };

        System.out.println("The given array is:");
        for (int[] row : arr) {
            System.out.println(row[0] + " " + row[1]);
        }

        System.out.println("The reverse of the array is:");
        for (int i = 1; i >= 0; i--) {
            System.out.println(arr[i][1] + " " + arr[i][0]);
        }
    }
}
