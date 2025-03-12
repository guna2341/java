import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for (int i = 1;i <= num;i++) {
            System.out.println(i);
        }
        int n = 1;
        while (n<=num) {
            System.out.print(n + " ");
            n++;
        }
    }
}
