public class Task10 {
    public static void main(String[] args) {
//Write a program to print out duplicate elements from an Array of Strings?
        String[] my_array = {"Moncef", "Jamal", "Amine","Moncef","Amine","Asmaa"};

for (int i = 0; i < my_array.length-1; i++)
        {
            for (int j = i+1; j < my_array.length; j++)
            {
                if ((my_array[i].equals(my_array[j])) && (i != j))
                {
                    System.out.println(my_array[j]);
                }
            }
        }


    }}







