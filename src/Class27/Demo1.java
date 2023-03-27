package Class27;

public class Demo1 {
    public static void main(String[] args) {

        String name1 ="Zafar";
        String name2 ="Aiperi";
        String name3 ="kabul";

        String[] names={"Hiral","Nima","laura","Nat"};

        displayName(names);

    }




    public static void displayName (String[]names){

        for(String name:names){
            System.out.println(name);
        }
    }
}
