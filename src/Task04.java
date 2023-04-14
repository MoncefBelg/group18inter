public class Task04 {
    public static void main(String[] args) {
        /*Create a 2D array of integers. Develop a program which will calculate the sum of even and odd numbers
        for that array.*/
int [][] numbers={  {20,32,42,13,45,55},
                   {33,4,56,77,55,3,22} };
int sum1=0;
int sum2=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if(numbers[i][j]%2==0){
                    sum1+=numbers[i][j];

                }else if (numbers[i][j]%2!=0) {
                    sum2+=numbers[i][j];  }
            }
        }            System.out.println("the sum of Even numbers is "+sum1);
                     System.out.println("the sum of Odd numbers is "+sum2);


    }
}

