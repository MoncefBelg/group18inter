public class Task03 {
    public static void main(String[] args) {
        /*Create a 2D array or integer type where you will store odd and even numbers. Develop a program which will
        identify/print the even numbers only.*/
        int[][] numbers = {{20, 23, 44, 13, 66, 77},
                {10, 34, 53, 62, 40}};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    System.out.print(numbers[i][j]+" ");
                }
            }
            System.out.println();


        }
    }}

