package Class3;

public class ifElse_9 {
    public static void main(String[] args) {
        char c = 'M';
        if(c == 'M'){

            System.out.println("Male");

        }
        // with non primitive data typs such as Stting we cant usse == symbol.
        String name = "Sam";
        if(name.equals("Sam")){
            System.out.println("Amazing Student");

        }

        if(!name .equals("Sam")){
            System.out.println("Super Amazing ");
        }
    }
}
