import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
    sum();
    }
//    creating a function
    static void sum() {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.print("Sum = "+sum);
    }
}
