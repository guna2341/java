import java.util.Scanner;

public class ReturnFunction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(greet());
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int sum = integer(num1 , num2);
        System.out.println(sum);
    }

    static int integer(int a, int b) {
        return a + b ;
    }

    static String greet() {
        return "Hello";
    }
}
