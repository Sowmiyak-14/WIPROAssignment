public class FloydTri {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please enter an integer number");
            return;
        }

        int rows = 0;
        try {
            rows = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Please enter an integer number");
            return;
        }

        int i = 1;
        while (i <= rows) {
            int j = 1;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
