package array;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author lycheeMao 2018-10-22
 * No:766
 */
public class ToeplitzMatrixTest {
    public static void main(String[] args) {
        boolean isToeplitzMatrix = isToeplitzMatrixB(new int[][]{{2, 3, 1, 0}, {3, 2, 3, 1}, {4, 3, 2, 3}, {5, 4, 3, 2}});
        System.out.println(isToeplitzMatrix);
    }

    /**
     * 判断是否是托普利兹矩阵
     */
    private static boolean isToeplitzMatrixA(int[][] A) {
        int column = A.length;
        int row = A[0].length;
        boolean flag = true;
        if ((column <= 1) || (row <= 1)) {
            return flag;
        }

        for (int i = 0; i < row - 1; i++) {
            for (int j = 0; j < column - 1; j++) {
                if (A[i][j] != A[i + 1][j + 1]) {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }

    public static boolean isToeplitzMatrixB(int[][] matrix) {
        if (matrix.length <= 1 || matrix[0].length <= 1) {
            return true;
        }
        Queue<Integer> q = new LinkedList<>();
        //set criteria
        for (int i = matrix[0].length - 1; i >= 0; i--) {
            q.add(matrix[0][i]);
        }
        for (int j = 1; j < matrix.length; j++) {
            q.poll();
            for (int k = matrix[j].length - 1; k > 0; k--) {
                // compare
                if (matrix[j][k] == q.poll()) {
                    q.add(matrix[j][k]);
                } else {
                    return false;
                }
            }
            q.add(matrix[j][0]);
        }
        return true;
    }

}
