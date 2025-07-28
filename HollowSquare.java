public class HollowSquare {
    public static void main(String[] args) {
        int n = 5; // Size of the square

        for (int i = 0; i < n; i++) {  // Rows
            for (int j = 0; j < n; j++) {  // Columns
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) 
                    System.out.print("* ");
                else
                    System.out.print("  "); // Spaces for the hollow part
            }
            System.out.println();
        }
    }
}
