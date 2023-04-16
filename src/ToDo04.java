public class ToDo04 {
    public static void main(String[] args) {

       /* Create a 2D array or integer type and store numbers in 3 rows and 3 columns. Print the sum of all numbers.*/

        int [][] num={{34,34,55},  {4,3,52},   {5,8,6}};
int sum=0;
        for (int[] list:num){
            for (int mm:list){
                sum+=mm;
            }

        }System.out.print(sum);



    }
}


