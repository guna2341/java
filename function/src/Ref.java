import java.util.Arrays;

public class Ref {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        Change(arr);
        System.out.println(Arrays.toString(arr));
        int x;
    }

    static void Change(int[] nums) {
     nums[0] = 5;
    }
}
