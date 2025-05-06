import java.util.Scanner;

class Calculator {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter a number:");
        sum = input.nextInt();
        while (true) {
            System.out.println("Choose a operation:");
            System.out.println("1:Add\n2:Subtract\n3:Multiply\n4:Divide\n5:Reset\n6:Exit");
            char op = input.next().charAt(0);
            if (op == '6') {
                break;
            }
            else if (op == '5') {
                sum = 0;
            }
            System.out.print("Enter a number:");
            if (op == '1') {
                sum += input.nextInt();
            }
            else if (op == '2') {
                sum -= input.nextInt();
            }
            else if (op == '3') {
                sum *= input.nextInt();
            }
            else if (op == '4') {
                sum /= input.nextInt();
            }
            else {
            System.out.println("Invalid operation");
            }
            System.out.println("Sum is:" + sum);
        }
    }
}