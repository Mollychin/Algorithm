package array;

import java.util.HashMap;

/**
 * @author lycheMao 2018-10-29
 */
public class DegreeOfAnArray {
    public static void main(String[] args) {
        int shortestLengthOfSubArray = findShortestLengthOfSubArray(new int[]{1, 2, 3, 3, 2, 2, 2, 3, 2});
        System.out.println(shortestLengthOfSubArray);
    }

    /**
     * Given a non-empty array of non-negative integers nums,
     * the degree of this array is defined as the maximum frequency of any one of its elements.
     * Your task is to find the smallest possible length of a (contiguous) subArray of nums,
     * that has the same degree as nums.
     */
    private static int findShortestLengthOfSubArray(int[] inputArray) {
        if (inputArray.length == 0 || inputArray == null) {
            return 0;
        }
        HashMap<Integer, int[]> map = new HashMap<>();
        for (int i = 0;i<inputArray.length;i++){
            if (!map.containsKey(inputArray[i])){
                map.put(inputArray[i],new int[]{1,i,i});
            }else{
                int [] temp = map.get(inputArray[i]);
                temp[0]++;
                temp[2]= i;
             }
        }
        int degree = Integer.MIN_VALUE, result = Integer.MAX_VALUE;
        for (int [] value:map.values()){
            if (value[0]>degree){
                degree = value[0];
                result = value[2] - value[1] +1;
            }else if (value[0] == degree){
                result = Math.min(value[2] -value[1]+1,result);
            }
        }
        return result;
    }
}
