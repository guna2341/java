import java.util.Scanner;
public class switchProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.next();

        switch (n) {
            case "1" -> System.out.println("One");
            case "2" -> System.out.println("Two");
            default -> System.out.println("Invalid input");
        }
    }
}
