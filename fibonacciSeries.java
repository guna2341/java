import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int num = input.nextInt();

        for (int i=2; i<=num; i++) {
            b = a + b;
            a = b - a;
        }

        System.out.printf("%d Fibonacci number is:%d",num,b);
    }
}
