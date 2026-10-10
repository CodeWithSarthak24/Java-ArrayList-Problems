package JavaProgram.ArraylistSheet;

//  Write a Java program to sort a given array list

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Lecture4 {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(9, 2, -1, 0, 5, 1, 7));

       // Collections.sort(list1);
       // list1.forEach(System.out::println);

        for (int i = 0; i < list1.size() - 1; i++) {
            for (int j = i + 1; j < list1.size() - 1; j++) {
                if(list1.get(i) >  list1.get(j)){
                    int temp =  list1.get(i);
                    list1.set(i, list1.get(j));
                    list1.set(j, temp);
                }
            }
        }

        list1.iterator().forEachRemaining(System.out::println);

    }
}

// Ctrl + Alt + L : reformat code
