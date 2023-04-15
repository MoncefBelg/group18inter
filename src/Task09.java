public class Task09 {
    public static void main(String[] args) {
        //Write a java program to find the second largest number in the array?
        int []  num={20,34,55,4,45,2,44} ;
int highest=num[0];
int secondHighest=num[0];
        for (int i = 0; i < num.length ; i++) {
              if(num[i] > highest){
                  secondHighest=highest;       // ...shift the current highest number to second highest
                  highest=num[i];  }// set the new highest.
              else if (num[i]>secondHighest) {
                  secondHighest=num[i];

              }

              }            System.out.println(secondHighest);

    }
}









