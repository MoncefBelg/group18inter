public class Task08 {
    public static void main(String[] args) {
//8. Maximum and minimum number in the array?

        int [][] num={{32,4,53,23,2,3},
                         {23,4,3,2,2}};
        int max=num[0][0];
        int min=num[0][0];

        for (int i = 0; i < num.length ; i++) {
            for (int j = i; j < num[i].length; j++) {
                if(num[i][j]>max){
                    max=num[i][j];
                } else if (num[i][j]<min) {
                    min=num[i][j];

                }
            }


        }            System.out.println("Maximum number in the Array is "+max);
         System.out.println("Minimum number in the Array is "+min);

    }

}





