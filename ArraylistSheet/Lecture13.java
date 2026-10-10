package JavaProgram.ArraylistSheet;

import java.util.ArrayList;
import java.util.Arrays;

// Write a Java program to copy one array list into another

public class Lecture13 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(9, 2, 0, 5, 1, 7));

        ArrayList<Integer> list2 = new ArrayList<>(list.size());

       // list2.addAll(list);

       // System.out.println(list2);

      for(Integer i : list){
          list2.add(i);
      }
        System.out.println(list2);
    }
}
