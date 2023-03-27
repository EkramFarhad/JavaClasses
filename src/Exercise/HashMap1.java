package Exercise;

import Class30.Entry;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.*;

public class HashMap1<S, I> {

    public static void main(String[] args) {

        HashMap<Integer, String> book = new HashMap<>();
        book.put(1, "book1");
        book.put(2, "book2");
        book.put(3, "book3");
        book.put(4, "book4");
        book.put(5, "book5");


        HashMap<Integer, String> pen = new HashMap<>();
        pen.put(1, "pen1");
        pen.put(2, "pen2");
        pen.put(3, "pen3");
        pen.put(4, "pen4");
        pen.put(5, "pen5");

        HashMap<Integer, String> allKey = new HashMap<>();
        allKey.putAll(book);
        allKey.putAll(pen);
        System.out.println(allKey);

//        Set <Integer>  totalKes = allKey.keySet();
//        System.out.println(totalKes);
//        System.out.println(allKey);



    }
}




