package Class11;

public class Example1 {
    public static void main(String[] args) {
        int[][] matrix = {{10, 20, 30},
                {45, 55, 66},
                {30, 40, 20, 10, 25}
        };

        for (int[] arr : matrix) {
            for (int numbers : arr) {
                System.out.print(numbers + " ");
            }
            System.out.println();


        }


    }
}

