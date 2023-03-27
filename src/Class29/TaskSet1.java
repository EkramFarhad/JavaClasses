package Class29;

import java.util.TreeSet;

/*
* Create a Set collection in which you need to add names of the countries.
* In this set we want all objects to be sorted in alphabetical order. Using 2 different ways
*  retrieve all elements from set.*/
public class TaskSet1 {

    public static void main(String[] args) {
        TreeSet<String>treeSet = new TreeSet <>();
        treeSet.add("USA");
        treeSet.add("Iran");
        treeSet.add("Afghanistan");

        System.out.println(treeSet);
        for(String str:treeSet){
            System.out.println(str);
        }

    }


}
