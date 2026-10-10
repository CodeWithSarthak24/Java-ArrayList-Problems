package JavaProgram.ArraylistSheet;

import java.util.ArrayList;
import java.util.Arrays;

public class Lecture14 {
    public static void main(String[] args) {

        // Write a Java program to Find maximum/minimum element in ArrayList

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(-9, 2, 0, -5, 1,17));

        int max = 0;
        for(Integer i : list){
            if(i > max){
                max = i;
            }
        }
        // not work when all the element is negative and in all case it will return 0
        System.out.println(max);

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(-9, -12, -5, -1));

        int maxElement = list2.get(0);
        for(Integer i : list2){
            if(i > maxElement){
                maxElement = i;
            }
        }
        System.out.println(maxElement);
    }
}
