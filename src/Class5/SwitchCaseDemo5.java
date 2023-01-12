package Class5;

public class SwitchCaseDemo5 {
    public static void main(String[] args) {

        char gender = 'F';

        switch (gender) {

            case 'F':
                System.out.println("Female");
                break;
            case 'M':
                System.out.println("Male");
                break;
            default:
                System.out.println("not specified");


                switch (gender) {

                    case 'f':
                        System.out.println("Female");
                        break;
                    case 'F':
                        System.out.println("Female");
                        break;
                    case 'm':
                        System.out.println("Male");
                        break;
                    case 'M':
                        System.out.println("Male");
                        break;
                    default:
                        System.out.println("not specified");
                }
        }


    }


}

