public class Array1and2darray {
    public static void main(String[] args) {
        //Declaration + memory allocation
        /*int [] marks = new int [6];
        marks [0] = 32;
        marks [1] = 21;
        marks [2] = 35;
        marks [3] = 28;
        marks [4] = 37;
        marks [5] = 25;

        for (int mark : marks) {
            System.out.println(mark);
        */
        // Decalration
        /*int [] marks;
        marks = new int [3];
        marks [0] = 21;
        marks [1] = 32;
        marks [2] = 36;

        for(int mark :marks ){
            System.out.println(mark);
        }*/
        //Decalration and initialization
        /*int [] marks = {21,32,36,33};
        for (int mark :marks){
            System.out.println(mark);
        }*/
        //reverse order printing
        /*int [] marks = {32,21,38,33};
        for (int i = marks.length - 1; i >= 0; i-- ){
            System.out.println(marks[i]);

        }*/
        int [][] flats; // A 2-D Array
        flats = new int [2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

        // Displaying the 2-D Array (for loop)
        System.out.println("Printing a 2-D array using for loop");
        for(int i=0;i<flats.length;i++){
            for(int j=0;j<flats[i].length;j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }

    }
}