package JavaProgram.ArraylistSheet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

// Write a Java program to shuffle elements in a array list
public class Lecture5 {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(9, 2, -1, 0, 5, 1, 7));

//        Collections.shuffle(list1);
//        System.out.println(list1);

        Random rand = new Random();
        // Java class used to generate random values.

        for (int i = 0; i < list1.size() - 1; i++) {
            int j = rand.nextInt(list1.size()); // generates a random index from 0 to 6.

            int temp = list1.get(i);
            list1.set(i, list1.get(j));
            list1.set(j, temp);

        }

        list1.iterator().forEachRemaining(System.out::println);

    }
}
