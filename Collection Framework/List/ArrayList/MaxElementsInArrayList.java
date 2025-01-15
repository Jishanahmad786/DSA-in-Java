// find the maximum elements in arraylist 

import java.util.ArrayList;
import java.util.Collections;

public class MaxElementsInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(200);
        list.add(20);
        list.add(50);
        System.out.println(Collections.max(list));

    }

}
