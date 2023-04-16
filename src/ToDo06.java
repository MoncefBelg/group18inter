public class ToDo06 {
    public static void main(String[] args) {
/*Create 2D array of countries: north america countries, south america countries, europe countries, asian countries, african countries.
 Then print all values from that array using 2 different loops and calculate how many total countries been stored.*/
  String[][] countries={{"Morocco","Senegal","Egypt","Algeria"},
          {"Brazil","Argentina","Columbia","Peru"},{"Germany","France","Portugal","Belgium"}};
int total=0;
  for (String [] count:countries){
      for(String bs:count){
            total++;
    }

}        System.out.print("Total of countries stored is : "+total);


    }
}


