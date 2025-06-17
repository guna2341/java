package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class arraylist {
    public static void main(String[] args) {
         // Syntax
        // can add as many values as needed
        ArrayList<Integer> list = new ArrayList<>(10);

//        add a value
        list.add(10);
        list.add(20);
        list.add(30);

//        checks a value
        System.out.print(list.contains(10));
//        update a value
        list.set(1,40);

//        remove value
        list.remove(1);

//        get item
       int val =  list.get(1);
        System.out.print(list);

//        2d array
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

//        initialisation
        for(int i=0;i<3;i++) {
            arr.add(new ArrayList<>());
        }
    }
}
