package Exercise;

import java.util.ArrayList;

public class Remove {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("Cat");
        words.add("Java");
        words.add("Computer");
        words.add("Lava");
        // it does not work in java 9 and below
        var name="kdbsfnjksdf";
        var c='s';
        var f=12.5;

        // it works from java 6 to java 19
        /*
        Iterator<String> iterator=words.iterator();
        while (iterator.hasNext()){
            String s= iterator.next();
            if(s.endsWith("a")){
                iterator.remove();
            }
        }
         */
        // does not work in java 7
        words.removeIf(x -> x.endsWith("a"));

        words.add("Ekram");
        words.add("Farhad");

        System.out.println(words);
        words.removeIf(w->w.endsWith("r"));

        System.out.println(words);

        words.remove(2);
        System.out.println(words);
        words.size();
        System.out.println(words);
        words.forEach(z->z.indexOf(0) );
        System.out.println(words);
    }
}
