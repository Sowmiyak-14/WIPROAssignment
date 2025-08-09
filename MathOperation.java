public class MathOperation {
    public static void main(String[] args) {
        try {
            int sum = 0;
            for (int i = 0; i < args.length; i++) {
                int num = Integer.parseInt(args[i]);
                sum += num;
            }
            double avg = sum / (double) args.length;
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + avg);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
