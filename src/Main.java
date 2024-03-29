public class Main {


    public static int[][] fillDown(int[][] fillDownArray, int stepsize) {
        int row0 = 0;
        int col0 = 0;
        int stepnum = 1;

        fillDownArray[row0][col0] = stepsize;
        col0 = -1;
        while (col0 < fillDownArray[0].length) {
            row0 = 0;
            col0++;

            if(col0 == fillDownArray[0].length){

                return fillDownArray;
            }


            while (row0 < fillDownArray.length) {
                fillDownArray[row0][col0] = stepsize * stepnum;
                stepnum++;
                row0++;
            }
        }


        return fillDownArray;

    }


    public static int[][] fillRight(int[][] fillRightArray, int stepsize) {

        int row0 = 0;
        int col0 = 0;
        int stepnum = 1;

        fillRightArray[row0][col0] = stepsize;

        row0 = -1;
        while (row0 < fillRightArray.length) {
            col0 = 0;
            row0++;

            if(row0 == fillRightArray.length){
                return fillRightArray;
            }






            while (col0 < fillRightArray[0].length) {
                fillRightArray[row0][col0] = stepsize * stepnum;
                stepnum++;
                col0++;
            }
        }

        return fillRightArray;

    }



    public static int getRowSum(int[][] enteredarray, int row) {

        int sum = 0;
        int col0 = 0;

        while(col0 < enteredarray[0].length) {

            sum = enteredarray[row][col0] + sum;
            col0++;
        }
        return sum;
    }


    public static int getColSum(int[][] enteredarray, int col) {

        int sum = 0;
        int row0 = 0;

        while(row0 < enteredarray.length) {

            sum = enteredarray[row0][col] + sum;
            row0++;
        }

        return sum;
    }

        public static int[][] printArray(int[][] printedarray) {

            int col0 = 0;
            int row0 = 0;
            boolean qwe = true;

            while (row0 < printedarray.length) {
                col0 = 0;
                row0++;
                if (row0 == printedarray.length) {
                    return printedarray;
                }
                while (col0 < printedarray[0].length) {

                    if(qwe) {
                        row0 = 0;
                        qwe = false;
                    }
                    System.out.format("%-10d", printedarray[row0][col0]);
                    col0++;
                }
                System.out.println();

            }
                    return printedarray;
        }

        public static void main(String args[]) {


            int[][] fillRightArray = new int[5][8];
            fillRight(fillRightArray, 2);
            printArray(fillRightArray);
            System.out.println();

            int[][] fillDownArray = new int[5][8];
            fillDown(fillDownArray, -2);
            printArray(fillDownArray);
            System.out.println();

            System.out.println(getRowSum(fillRightArray, 0));
            System.out.println(getColSum(fillDownArray, 0));

    }

}