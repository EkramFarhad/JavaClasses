package Class28;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {

        ArrayList <String> words = new ArrayList<>();
        words.add("Cat");
        words.add("Java");
        words.add("Computer");
        words.add("Lava");



       /* for(String s : words){

            if(s.endsWith("a")){
                words.remove(s);
            }
        }*/

        // not working loop in arraylist and arraylinked properlay

        for (int i = 0; i <words.size() ; i++) {
            if(words.get(i).endsWith("a")){
                words.remove(i);
            }

        }
        System.out.println(words);

    }
}
