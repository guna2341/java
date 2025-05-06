import java.util.Scanner;

public class numberOfOccurence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = input.nextInt();
        System.out.print("Enter num to find occurences:");
        int occ = input.nextInt();
        int count = 0;
        while (n > 0) {
            if (n%10 == occ) {
                count++;
            }
             n = n/10;
        }
        System.out.print("Total no of occurences:" + count);
    }
}
