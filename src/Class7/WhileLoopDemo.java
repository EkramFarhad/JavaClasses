package Class7;

import java.util.Scanner;

public class WhileLoopDemo {
    public static void main(String[] args) {
        boolean condition =true;

        Scanner input = new Scanner(System.in);
        int number = 15;
        while(condition){
            System.out.println("Please Enter a Number between 10 to 20");
            int userInput=input.nextInt();
            if(userInput>number){
                System.out.println("Your enterd number is greater");
            } else if (userInput<number) {
                System.out.println("you enterd number smaller");

            }else{
                System.out.println("You won!!!");
                condition = false;
            }

        }
    }
}
