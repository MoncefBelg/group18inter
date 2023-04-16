public class ToDo01 {
    public static void main(String[] args) {
        //Create a 2D array(shorter way) in which first array will consist of 4 names and second array will contain grades.
        // Then your program should print name of the students that has A and B grade
        String[][] arr = { {"Moncef","Amine","Mohammed","Yassine"}, {"A","B","C","D"} };
        for (int i=0;i<arr[1].length;i++){ //for i=0 i<4
            if (arr[1][i]=="A" || arr[1][i]=="B"){ // if second array one of the element = A or B
                System.out.println(arr[0][i]);// we print the element of the first array that have same index
                // so if for example we found A in index 0 we will display the 1st element in  1st array
            }

        }

        }
}

