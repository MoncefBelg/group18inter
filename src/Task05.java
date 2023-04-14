public class Task05 {
    public static void main(String[] args) {
        //Write a program to swap 2 numbers without a temporary variable?
int x=20;        int y=2;
        System.out.println("before swapping :");
        System.out.println("the value of x is "+x);
        System.out.println("the value of y is "+y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swapping :");
        System.out.println("the value of x is "+x);
        System.out.println("the value of y is "+y);

    }
}

