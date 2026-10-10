package JavaProgram.ArraylistSheet;

// Write a Java program to increase the size of an array list

import java.util.ArrayList;
import java.util.Arrays;

public class Lecture6 {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(9, 2, -1, 0, 5, 1, 7));

        System.out.println("Before : " + list1.size());

        list1.add(11);
        list1.add(21);
        list1.add(31);
        System.out.println("After : " + list1.size());
    }
}

// An ArrayList dynamically increases its capacity when more elements are added.
// I can increase its size by adding elements using the add() method.
// The size() method returns the current number of elements.