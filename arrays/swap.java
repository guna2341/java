package arrays;

import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        swapfun(arr);
        System.out.print(Arrays.toString(arr));
    }

    static void swapfun(int[] arr) {
        int len = arr.length - 1;
        for(int i=0; i<=len/2; i++) {
            int temp = arr[i];
            arr[i] = arr[len - i];
            arr[len-i] = temp;
        }
    }
}
