// write a java program in  arraylist to find the index of given elements if not found return -1

import java.util.ArrayList;
public class FindIndex {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
       if(list.contains(10)){
        System.out.println("Elements is preset at Index "+ list.indexOf(10));
       }
       else{
        System.out.println(list.indexOf(list));
       }
        
        

    }

    
}
