package array;

/**
 * @author LycheeMao 2018-10-27
 */
public class ReshapeMatrixTest {
    public static void main(String[] args) {
        int[][] matrixAfterReshaped = reshapeTheMatrixA(new int[][]{{1, 2}, {3, 4}, {5, 6}, {7, 8}}, 4, 2);
    }

    private static int[][] reshapeTheMatrixA(int[][] A, int rowAfterReshaped, int columnAfterReshaped) {
        int row = A.length;
        int column = A[0].length;
        if (rowAfterReshaped * columnAfterReshaped != row * column) {
            return A;
        }
        int[][] matrixAfterReshaped = new int[rowAfterReshaped][columnAfterReshaped];
        int count = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrixAfterReshaped[count / columnAfterReshaped][count % columnAfterReshaped] = A[i][j];
                count++;
            }
        }

        return matrixAfterReshaped;
    }
}
