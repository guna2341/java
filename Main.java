import java.util.Scanner;

class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        switch(a) {
            case 1:
                System.out.print("One");
                break;
            default:
                System.out.print("Not One");
        }
    }
}