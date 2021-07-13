import java.util.Arrays;

class Solution
{
    // In-place rotate it by 90 degrees in a clockwise direction
    public static void rotate(int[][] matrix, int times) {
        while (times-- > 0) {
            int startRow = 0;
            int startColumn = 0;
            int finishRow = matrix.length - 1;
            int finishColumn = matrix[0].length - 1;
            while (startRow < finishRow) {
                rotateEdge(matrix, startRow++, startColumn++, finishRow--, finishColumn--);
            }
        }
    }

    public static void rotateEdge(int[][] m, int startRow, int startColumn, int finishRow, int finishColumn) {
        int times = finishColumn - startColumn;
        int tmp = 0;

        for (int i = 0; i != times; i++) {
            tmp = m[startRow][startColumn + i];
            m[startRow][startColumn + i] = m[finishRow - i][startColumn];
            m[finishRow - i][startColumn] = m[finishRow][finishColumn - i];
            m[finishRow][finishColumn - i] = m[startRow + i][finishColumn];
            m[startRow + i][finishColumn] = tmp;
        }
    }





    public static void main(String[] args)
    {
        int[][] matrix =
                {
                        { 1, 2, 3},
                        { 4, 5, 6 },
                        { 7, 8, 9 }
                };

//        rotateMatrix(matrix, 2);
        rotate(matrix, 2);

        for (int[] r: matrix) {
            System.out.println(Arrays.toString(r));
        }
    }
}
