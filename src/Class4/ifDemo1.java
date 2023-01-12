package Class4;

public class ifDemo1 {
    public static void main(String[] args) {

        int money = 15000;

        if (money > 1000) {
            System.out.println("lets buy an iphone");
        }
        if (money > 2000) {
            System.out.println("lets also buy a Mackbook");
        }

        boolean mothersDay = true;

        if (mothersDay) {
            System.out.println("happy mothers day");
        }

        // equals method is only used for non-primitives
        String name = "Sardar";

        if (name.equals("Sardar")) {

            System.out.println("Sardar is equal to others");

        }
    }
}


