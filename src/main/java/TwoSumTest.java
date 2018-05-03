/**
 * Copyright (C), 2011-2018, 微贷网.
 */

/**
 * @author binglin 2018/5/3.
 */
public class TwoSumTest {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }

        }
        return null;
    }

    public static void main(String[] args) {
        int[] a={2, 7, 11, 15};
        int targer=9;
        int[] ints = twoSum(a, targer);
        System.out.println(ints);
    }

}
