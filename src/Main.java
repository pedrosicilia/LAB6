public class Main {


    public static int[][] filldown(int[][] filldownarray, int stepsize) {
        int row0 = 0;
        int col0 = 0;
        int stepnum = 1;


        filldownarray[row0][col0] = stepsize;


        // System.out.println( "FIRST: " + filldownarray[row0][col0] + "ROW LENGTH: " + filldownarray.length + " COL LENGTH: " +  filldownarray[0].length);
        col0 = -1;
        while (col0 < filldownarray[0].length) {
            row0 = 0;
            col0++;
            System.out.println("NEW COL: " +col0);

            if(col0 == filldownarray[0].length){
                return filldownarray;
            }


            while (row0 < filldownarray.length) {
                filldownarray[row0][col0] = stepsize * stepnum;
                System.out.println("STEP:" + stepnum + " NUm: " + filldownarray[row0][col0] + " Row: " + row0);
                stepnum++;
                row0++;
            }
        }


        return filldownarray;

    }


    public static int[][] fillright(int[][] fillrightarray, int stepsize) {

        int row0 = 0;
        int col0 = 0;
        int stepnum = 1;

        fillrightarray[row0][col0] = stepsize;

        System.out.println( "STEPSIZE: " +stepsize+ " NUM: " +fillrightarray[row0][col0]);

        row0 = -1;
        while (row0 < fillrightarray.length) {
            col0 = 0;
            row0++;


            System.out.println("NEW ROW: " +row0);

            if(row0 == fillrightarray.length){
                return fillrightarray;
            }






            while (col0 < fillrightarray[0].length) {
                fillrightarray[row0][col0] = stepsize * stepnum;
                System.out.println("STEP:" + stepnum + " NUm: " + fillrightarray[row0][col0] + " Col: " +col0);
                stepnum++;
                col0++;
            }
        }


        return fillrightarray;

    }

















/*

        public static void printarray(int[][] printedarray) {

        int col = 0;
        int row = 0;

        for (int i = 0; i < printedarray.length; i++) {
            for (int j = 0; j < printedarray[i].length; j++) {
                System.out.format("%-10d",	printedarray[i][j]);
            }
            System.out.println();
        }


        /*

        System.out.println(" COL length: " +printedarray[0].length);

        while(col <= printedarray[0].length) {

            System.out.println("TESTes");
            System.out.format("%-10d",	printedarray[row][col]);
            row++;


            if(printedarray.length == row){
                row = 0;
                col++;
            }

        }


        return;

    }

                */


    public static void main(String args[]) {
        System.out.println("TEST");
        int[][] filldownarray = new int[5][8];

        System.out.println("TEST 120");


        filldown(filldownarray, -2);

        int[][] fillrightarray = new int[5][8];

        System.out.println("TEST 124");


        fillright(fillrightarray, 2);

        System.out.println("TEST 126");
        //  printarray(filldownarray);
        System.out.println();
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