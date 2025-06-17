package arrays;
import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int len = in.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter the array:");
        for(int i=0; i<len; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("The max is:" + maxVal(arr));
    }

    static int maxVal(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i=1; i<arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
