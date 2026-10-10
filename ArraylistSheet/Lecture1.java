package JavaProgram.ArraylistSheet;

// 1. Write a Java program to create a new array list, add some elements and print out the collection

import java.util.ArrayList;
import java.util.Arrays;

public class Lecture1 {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        list1.iterator().forEachRemaining(System.out::println);
    }
}
