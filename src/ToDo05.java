public class ToDo05 {
    public static void main(String[] args) {

      //  Create a 2D array of integer type where you will store odd and even numbers in 3 rows and 4 columns.
        //  Develop a program which will identify/print the even numbers only.
        int [][] numbers={{3,34,5,22},{3,45,6,7},{2,33,22,19}};
        for(int [] bs:numbers){
            for (int Even:bs){
                if (Even%2==0){
                    System.out.println(Even);

                }
            }
        }
    }
}


