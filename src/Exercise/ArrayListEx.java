package Exercise;

import java.util.ArrayList;

public class ArrayListEx {

    public static void main(String[] args) {

        ArrayList <String> arrayList = new ArrayList<>();

        arrayList.add("Farid");
        arrayList.add("Walid");
        arrayList.add("Sharif");
        arrayList.add("Karim");
        arrayList.add("Nawid");
        arrayList.add("Latif");


        System.out.println(arrayList.size());

        System.out.println("------------");

        for (String arr:arrayList){
            System.out.println(arr);
        }

        System.out.println("--------------");

        int i = 0;
        while (i<arrayList.size()){
            System.out.println(arrayList);
            i++;
        }

    }
}
