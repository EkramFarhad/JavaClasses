package Class28;

import Class26.Dog;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericArrayList {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();

        names.add("10");

        // Break till 11:52

        Object a=new String("some value");
        Object b= new Integer(10);
        Object c=new Scanner(System.in);

        // No one now uses the arrays like this.
        ArrayList name=new ArrayList();
        name.add("Ehsan");
        name.add(10);
        name.add('a');
        name.add(new Dog());

        for (Object j:name
        ) {
            ((String)j).trim();
        }



    }
}
