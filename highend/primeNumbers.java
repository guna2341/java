import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=2;i<(int)(n/2)+1;i++) {
            if (n % i == 0) {
                System.out.print("false");
                return;
            }
        }
        System.out.print("true");
    }
}
