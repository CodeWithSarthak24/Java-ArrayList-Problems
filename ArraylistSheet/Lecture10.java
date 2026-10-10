package JavaProgram.ArraylistSheet;

// Write a Java program to join two array lists

import java.util.ArrayList;
import java.util.Arrays;

public class Lecture10 {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,4,5,0,3));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(11,14,15,10,13));

        // list1.addAll(list2);
        // list1.forEach(System.out::println);

        // if I want to add the element of list2 in list1 then I want to traverse through the list2
      // for(Integer i : list2){ // i is value not index
         //   list1.add(list2.get(i));}

        for(Integer i : list2){
            list1.add(i);
        }

        list1.forEach(System.out::println);

    }
}
