import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to reverse:11");
        int n = input.nextInt();
        int rev = 0;
        while (n>0) {
            rev = (rev * 10) + n%10;
            n /= 10;
        }
        System.out.print("Reversed Number:" + rev);
    }
}
