public class Task07 {
    public static void main(String[] args) {
//. Write a Java Program to print the first 10 numbers of Fibonacci series.
        int n = 10, t1 = 0, t2 = 1;

        System.out.print("First " + n + " terms: ");

        for (int i = 1; i <= n; ++i)

        { System.out.print(t1 + " + ");

            int sum = t1 + t2;

            t1 = t2;

            t2 = sum;

        }

    }

}





