package Interface;
@FunctionalInterface
interface LambdaExample {
    int myFunction(int a, int b, int c);
}

 class Test {
    public static void main(String[] args) {
        LambdaExample t1 = (a, b, c) -> a + b + c;
        LambdaExample t2 = (a, b, c) -> a * b * c;
        System.out.println("Addition: " + t1.myFunction(2, 3, 4));      // 9
        System.out.println("Multiplication: " + t2.myFunction(2, 3, 4)); // 24
    }
}
