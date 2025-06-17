public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9,10};
        int target = 4;
        int left = 0;
        int right = arr.length-1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                System.out.print(mid);
                return;
            }
            else if (arr[mid] > target) {
                right = mid-1;
            }
            else {
                left = mid+1;
            }
        }
        System.out.print("Not found");
    }
}
