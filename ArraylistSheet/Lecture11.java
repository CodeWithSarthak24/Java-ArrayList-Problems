package JavaProgram.ArraylistSheet;

import java.util.ArrayList;
import java.util.Arrays;

public class Lecture11 {
    public static void main(String[] args) {

        // Write a Java program to empty an array list

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(9, 2, 0, 5, 1, 7));

       // list1.clear();
       // list1.forEach(System.out::println);

        while(!list1.isEmpty()){
            list1.remove(list1.size()-1);
        }
        list1.forEach(System.out::println);

        // Write a Java program to retrieve an element from a given array list

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(9, 2, 0, 5, 1, 7));

        // Integer value = list2.get(0);
        // System.out.println(value);

        int targetIndex = 4;
        for(int i = 0; i < list2.size(); i++){
            if(list2.get(i).equals(list2.get(targetIndex))){
                System.out.println(list2.get(i));
            }
        }
    }
}
