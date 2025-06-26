import java.util.Scanner;

class Main {
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int temp = n;
        int res = 0;
        while (n > 0) {
            res += Math.pow(n%10,3);
            n /= 10;
        }
        System.out.print(res == temp);
    }
}
