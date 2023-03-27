package Class28;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo3 {
    public static void main(String[] args) {

        LinkedList<String> numbers = new LinkedList<>();

        //Time test method

        long startTime = System.currentTimeMillis();

        for (int i = 0; i <1000000 ; i++) {
            numbers.add(0,"Test Data");

        }

        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);

    }
}
