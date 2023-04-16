public class ToDo02 {
    public static void main(String[] args) {
       //Create 2D array of cars : american, german, korean, italian.
        // Then retrieve all values from that array using 2 different loops
String [][] cars={{"BMW","HONDA","TOYOTA","AUDI"},{"LIMBO","MERCEDES","RENAULT"}};

       for (String[] car:cars) {              //enhanced for loop
            for(String mm:car){
                System.out.print(mm+" ");
            }
        }
        System.out.println();
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length ; j++) {
                System.out.print(cars[i][j]+" ");
            }
        }
    }
}

