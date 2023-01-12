package Class4;

public class NestifDemo6 {
    public static void main(String[] args) {
        int money = 1000;
        String day = "Sunday";
        boolean mood = true;


        if (money > 700) {
            if (mood) {
                System.out.println("Lets go to shopping");
            }
        }else{
            System.out.println("Lets save some money first");
        }
    }
}
