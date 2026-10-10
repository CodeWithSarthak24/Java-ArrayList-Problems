package JavaProgram.ArraylistSheet;

import java.util.ArrayList;
import java.util.Arrays;

public class Lecture12 {
    public static void main(String[] args) {

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(9, 2, 0, 5, 1, 7));

        //  Write a Java program to search an element in array list

     /*   int targetElement = 0;

        for(int i = 0; i < list2.size(); i++){
            if(list2.get(i) == targetElement){
                System.out.println("Target Element: " + list2.get(i));
            }
        }
*/
        // Another way without using get()

        int element = 40;
        boolean isFound = false;
        for (Integer i : list2) { // i contain data
            if (i == element) {
                System.out.println("Target Element found: " + i);
                isFound = true;
            }
        }
        if (!isFound) {
            System.out.println("Target Element not found!");
        }

        // Write a Java program to update specific array element by given element

        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(19, 2, 0, 5, 11, 7));

       // list3.set(2, 100);
       // list3.forEach(System.out::println);

        int target = 0;
        int value = 100;
       for(int i = 0; i < list3.size(); i++){
           if(list3.get(i) == target){
               list3.remove(i);
               list3.add(i, value);
           }
       }
        System.out.println(list3);

    }
}
