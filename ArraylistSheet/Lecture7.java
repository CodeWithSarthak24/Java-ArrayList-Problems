package JavaProgram.ArraylistSheet;

//  Write a Java program to reverse elements in a array list

import java.util.ArrayList;
import java.util.Arrays;

public class Lecture7 {

    public void reverseList(ArrayList<Integer> list){
        int i = 0, j =  list.size()-1;
        while (i < j){
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(9, 2, -1, 0, 5, 1, 7));

        Lecture7 lecture7 = new Lecture7();
        lecture7.reverseList(list1);

       list1.forEach(System.out::println);

    }
}
