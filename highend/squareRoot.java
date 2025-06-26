import java.util.Scanner;

class Main {
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 1;
        while (i * i <= n) {
            if (i*i == n) {
                System.out.print(i);
                return;
            }
            i++;
        }
        System.out.print(i-1);
    }
}
