package Class27;

import java.util.ArrayList;

public class Demo6 {

    public static void main(String[] args) {
        ArrayList<Boolean> booleans = new ArrayList();
        booleans.add(false);
        booleans.add(true);
        booleans.add(false);
        booleans.add(false);
        booleans.add(true);

//        System.out.println(booleans.get(4));


//        for (int i = 0; i <booleans.size(); i++) {
//            System.out.println(booleans.get(i));
//        }System.out.println(booleans);
        int i = 0;
        while (i<booleans.size()){
            System.out.println(booleans.get(i));
            i++;
        }
    }
}
