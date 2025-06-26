import java.util.Scanner;

class Main {
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int t = a < b ? a : b;
        for(int i = t;i>=1;i--) {
            if (a % i == 0 && b % i == 0) {
                System.out.print(i);
                return;
            }
        }
    }
}
