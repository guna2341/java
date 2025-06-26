import java.util.Scanner;

class Main {
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = 0;
        char[] s = (n + "").toCharArray();
        for(char i:s) {
            if (n%(i-'0') == 0) {
                c++;
            }
        }
        System.out.print(c);
    }
}
