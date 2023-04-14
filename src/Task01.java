public class Task01 {
    public static void main(String[] args) {
        /* Create a program that uses an array to store a list of temperatures for a week, and then uses a loop to find
        the highest and lowest temperature for the week*/
        int [] temp={28,-5,20,40,25,32,35};
        int highest=temp[0];
        int lowest =temp[0];

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > highest) {
                highest = temp[i];
            } else if (temp[i] < lowest) {
                lowest = temp[i];
            }
        }
        System.out.println("The highest temperature is "+highest);
        System.out.println("The highest temperature is "+lowest);

        }
      }

