package JavaProgram.ArraylistSheet;

import java.util.ArrayList;
import java.util.Arrays;

public class Lecture15 {
    public static void main(String[] args) {

        // Write a Java program to test an array list is empty or not

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(-9, 2, 0, -5, 1,17));

        if(list.isEmpty()){
            System.out.println("Empty List!");
        }else {
            System.out.println(list);
        }
    }
}
