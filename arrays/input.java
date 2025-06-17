package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        float a = 2.432F;
//        a = Float.parseFloat(String.format("%.2f",a));
        System.out.printf("\n");
        for(int i=0; i<arr.length;i++) {
            arr[i] = in.nextInt();
        }

        for (int num:arr) {
            System.out.print(num);
        }
        String[] str;
        str = new String[]{"aa", "bb", "cc"};
        System.out.println();
        for (String word:str) {
            for (char ch:word.toCharArray() ) {
                System.out.print(ch);
            }
        }
    }
}
