public class MagicSquare {

    /**
     *
     * @param array2d
     * @return the sum of the first row in array2d.
     */
    public static int calculateCheckSum(int[][] array2d) {
        int sum = 0;
        for (int x: array2d[0]){
            sum+=x;
        }
        return sum;
    }

    /**
     *
     * @param array2d
     * @param checkSum
     * @return whether the sum of each row in array2d is equal to checkSum or not.
     *         Because we have already determined the sum of the first row
     *         via the method 'calculateCheckSum', this method can begin
     *         iterating from the second row.
     */
    public static boolean magicRows(int[][] array2d, int checkSum) {
        boolean equals = true;
        for (int[] row: array2d){
            int row_sum= 0;
            for (int x: row){
                row_sum+=x;
            }
            if (row_sum!=checkSum){
                equals=false;
                break;
            }
        }
        return equals;
    }

    /**
     *
     * @param array2d
     * @param checkSum
     * @return whether the sum of each column in array2d is equal to checkSum or not.
     */
    public static boolean magicColumns(int[][] array2d, int checkSum) {
        boolean equals = true;
        for (int i=0; i<array2d.length; i++){
            int col_sum = 0;
            for (int j=0; j<array2d.length; j++){
                col_sum += array2d[j][i];
            }
            if (col_sum!=checkSum){
                equals=false;
                break;
            }
        }
        return equals;
    }

    /**
     *
     * @param array2d
     * @param checkSum
     * @return whether the sum of each of the two main diagonals is equal to checkSum or not.
     */
    public static boolean magicDiagonals(int[][] array2d, int checkSum) {
        int diag_one_sum = 0;
        for (int i=0; i<array2d.length; i++){
            for (int j=0; j<array2d.length; j++){
                if (i==j) diag_one_sum += array2d[i][j];
            }
        }
        int diag_two_sum = 0;
        int j=0;
        for (int k=array2d.length-1; k>=0; k--){
            diag_two_sum += array2d[j][k];
            j++;
        }
        if (diag_one_sum == checkSum && diag_two_sum == checkSum) return true;
        return false;
    }

    /**
     *
     * @param array2d
     * @return whether array2d is magic or not.
     */
    public static boolean isMagic(int[][] array2d) {
        int rows = calculateCheckSum(array2d);
        if (magicRows(array2d, rows) && magicColumns(array2d, rows) && magicDiagonals(array2d, rows)) return true;
        return false;


    }

}
