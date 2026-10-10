package JavaProgram.ArraylistSheet;

import java.util.ArrayList;
import java.util.Arrays;

// Write a Java program to swap two elements in an arraylist

public class Lecture9 {

    public void swap(ArrayList<Integer> list) {

        int start = 0, end = list.size() - 1;

        while (start < end) {
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }

    }

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,4,5,0,3));

        Lecture9 obj = new Lecture9();
        obj.swap(list1);

        list1.forEach(System.out::println);
    }
}
