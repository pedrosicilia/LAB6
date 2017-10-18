public class Main {


    public static int[][] filldown(int[][] filldownarray, int stepsize) {
        int row0 = 0;
        int col0 = 0;
        int stepnum = 0;


        filldownarray[row0][col0] = stepsize;


        System.out.println( "FIRST: " + filldownarray[row0][col0] + "ROW LENGTH: " + filldownarray.length + " COL LENGTH: " +  filldownarray[0].length);
        col0 = -1;
        while(col0 < filldownarray[0].length) {
            row0 = 0;
            col0++;
            while(row0 < filldownarray.length) {
                stepnum++;
                filldownarray[row0][col0] = 2 * stepnum;
                System.out.println("STEP:" + stepnum + " NUm: " + filldownarray[row0][col0] + " Row: " +row0);
                row0++;

            }
        }





        return filldownarray;

    }




    public static void printarray(int[][] printedarray) {

        int col = 0;
        int row = 0;

        while(col <= printedarray[0].length) {

            System.out.println("TEST");
            System.out.format("%-10d",	printedarray[row][col]);
            row++;


            if(printedarray.length == row){
                row = 0;
                col++;
            }

        }

        return;
    }




    public static void main(String args[]) {
         System.out.println("TEST");
        int[][] filldownarray = new int[5][8];
        filldown(filldownarray,2);
            System.out.println("TEST");
      // printarray(filldownarray);

    }


}


 /*


         int row = 0;
        int col = 0;
        boolean qwe = true;
        int rowminus = 1;

        filldownarray[row][col] = stepsize;
        System.out.println("ROW LENGTH: " + filldownarray.length + " COL LENGTH: " + filldownarray[0].length);

       // for(int count = 0; count < filldownarray.length; count++) {
        System.out.println( " TEST: " + filldownarray[0][0]);

        /*
        for(int col = 0; col < filldownarray[0].length; col++) {
            for(int row = 1; row < filldownarray.length; row++) {

                filldownarray[row][col] = filldownarray[row][col] + stepsize;

            }


            while(col < filldownarray.length) {

        filldownarray[row][col] = filldownarray[row][col] + 2;
        System.out.println( "ROW: " + row + " Col: " + col + " is " + filldownarray[row][col]);
        row++;


        if (row == filldownarray.length) {
        // count = 0;
        row = 0;
        col++;

        if(col == filldownarray[0].length) {
        break;
        }

        }

        }





  */