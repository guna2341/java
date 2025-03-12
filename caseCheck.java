    import java.util.Scanner;

    class caseCheck {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            char ch = input.next().trim().charAt(0);
            if (ch >='a' && ch <='b') {
                System.out.print("LowerCase");
            }
            else {
                System.out.print("UpperCase");
            }
        }
    }
