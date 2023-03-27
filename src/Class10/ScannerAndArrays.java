package Class10;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerAndArrays {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("please enter 5 numbers");

        int[] arr = new int[5];
//        arr[0]=40;
//        arr[1]=50;
//        arr[3]=60;
//        arr[2]=70;
//        arr[4]=80;

//        arr[0]=scanner.nextInt();
//        arr[1]=scanner.nextInt();
//        arr[3]=scanner.nextInt();
//        arr[2]=scanner.nextInt();
//        arr[4]=scanner.nextInt();

        for (int i =0; i < arr.length;i++){
            arr[i]=scanner.nextInt();
        }

        System.out.println(Arrays.toString(arr));




    }
}