package Class8;

public class Task {
    public static void main(String[] args) {
        boolean summer =true;
        int temp = 75;

//        while (summer){
//            if(temp<=100){
//                System.out.println("I love summer becuase Temprature is " + temp);
//            }else{
//                System.out.println("Its very hot "+ temp);
//                break;
//            }temp+=5;

        while (summer){
            if (temp<=100){
                System.out.println("I love summer because temperature is "+temp);
            }else {
                System.out.println("It's very hot"+temp);
                summer=false;
            }
            temp+=5;
        }



    }
}
