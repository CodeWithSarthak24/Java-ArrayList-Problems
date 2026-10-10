package JavaProgram.ArraylistSheet;

// Write a Java program to insert an element into the array list at the first position

import java.util.ArrayList;
import java.util.Arrays;

public class Lecture2 {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        list1.add(0,100);

        list1.iterator().forEachRemaining(System.out::println);
    }
}
