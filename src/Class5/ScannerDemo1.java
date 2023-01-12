package Class5;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*System.out.println("Please Enter your age");
        int age = input .nextInt();
        System.out.println("you are" + age +"Years old");

        System.out.println("Please Enter your weight");
        double weight = input. nextDouble();
        System.out.println("Your weight is" + weight + "Lbs");

        System.out.println("Are you hungry ?");
        boolean  hungry = input.nextBoolean();
        System.out.println("Hungry" + hungry);*/


        /*System.out.println("Please Enter you gender");
        char gender =input.next().charAt(0);
        System.out.println("Human" + gender);
*/

        System.out.println(" Please Enter your full name");
        String name = input.nextLine();
        System.out.println("Your full name is " + name);

    }
}
