package JavaProgram.ArraylistSheet;

// Write a Java program to remove the fifth element from array list

import java.util.ArrayList;
import java.util.Arrays;

public class Lecture3 {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));

        list1.remove(5);

        list1.iterator().forEachRemaining(System.out::println);
    }
}