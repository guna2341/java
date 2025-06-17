package arrays;

public class intro {
    public static void main(String[] args) {
        int[] arr; // ros is declared as array object in stack , happens at compile time
        arr = new int[5]; // memory space is declared for ros object in heap, happens at runtime
        //heap is not contiguous because of jvm
        // dynamic memory allocation
        System.out.println(arr[0]); // default values of arr is zero
        // for string, it is null
    }
}
