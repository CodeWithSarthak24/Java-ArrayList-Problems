package JavaProgram.ArraylistSheet;

//  Write a Java program to compare two array lists

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Lecture8 {

    public void compareTwoArrayLists(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        //   Collections.sort(list1);
        //  Collections.sort(list2);

        if (list1.size() != list2.size()) {
            System.out.println("Size not equal");
            return;
        }
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) != list2.get(i)) {
                System.out.println("Element not equal");
                return;
            }
        }
        System.out.println("Lists are equal");
    }

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(9, 2, -1, 0, 5, 1, 7));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(9, 2, -1, 0, 5, 1, 7));

        Lecture8 obj = new Lecture8();
        obj.compareTwoArrayLists(list1, list2);

        //  list1.equals(list2);

    }
}
