package array;

public class ReshapeMatrixTest {
    public static void main(String[] args) {

    }

    private int[][] reshapeTheMatrixA(int[][] A, int rowAfterReshaped, int columnAfterReshaped) {
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
