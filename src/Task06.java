import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
// Write a java program to check whether a given number is prime or not?
        //--------negative numbers & 0,1 are not Prime -----------
int num =50;
boolean isPrime=true;
for (int i=2 ;i<num ;i++){
if(num%i==0){
    isPrime=false;
    break;
}
            }if (isPrime){
            System.out.println(num+" is a Prime number");
        }else{
            System.out.println(num+" is not a Prime number");
        }
        }
    }


