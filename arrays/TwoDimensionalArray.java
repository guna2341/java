package arrays;

import java.util.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4},
                {5,6,7,8}
        };
        for(int i=0;i<arr.length;i++) {
            System.out.print(Arrays.toString(arr[i]) + " ");
        }
        for(int[] a:arr) {
            System.out.print(Arrays.toString(a) + " ");
        }
    }

}
