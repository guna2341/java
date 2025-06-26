import java.util.Scanner;

class Main {
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int res = 0;
        for(int i=1;i<(int)(n/2)+1;i++) {
            if (n % i == 0) {
                res += i;
            }
        }
        System.out.print(res == n);
    }
}
