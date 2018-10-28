package array;

/**
 * @author lycheeMao 2018-10-28
 */
public class SortArrayByParity {
    public static void main(String[] args) {
        int[] ints = sortArrayByParityA(new int[]{1, 2, 3, 4, 5, 6});
        for (int i:ints){
            System.out.print(i+"  ");
        }
    }

    /**
     * Given an array A of non-negative integers,
     * return an array consisting of all the even elements of A, followed by all the odd elements of A.
     */
    private static int[] sortArrayByParityA(int[] inputArray) {
        int begin = 0;
        int end = inputArray.length - 1;
        while (begin <= end) {
            if (inputArray[begin] % 2 == 0) {
                begin++;
            } else if (inputArray[end] % 2 != 0) {
                end--;
            } else {
                int temp = inputArray[begin];
                inputArray[begin] = inputArray[end];
                inputArray[end] = temp;
            }
        }
        return inputArray;
    }
}
