package JavaProgram.ArraylistSheet;

import java.util.ArrayList;
import java.util.Arrays;

public class Lecture16 {
    public static void main(String[] args) {

        // Write a Java program to extract a portion of a array list

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(-9, 2, 0, -5, 1,17));

       // System.out.println(list.subList(0, 2));

        int start = 3, end = list.size() - 2;

        for (int i = start; i <= end; i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

    }
}

// Write a Java program to clone an array list to another array list
// Write a Java program to print all the elements of a ArrayList using the position of the elements