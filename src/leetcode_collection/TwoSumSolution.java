package leetcode_collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * TwoSumSolution class
 *
 * @author Soarkey
 * @date 2018/12/30
 */
public class TwoSumSolution {

    public static void main(String[] args) {
        int[] a = {2, 7, 11, 15};
        int[] ans = new TwoSumSolution().twoSum(a, 9);
        System.out.println(Arrays.toString(ans));
    }

    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int sub = target - nums[i];
            if (map.containsKey(sub)) {
                ans[0] = map.get(sub);
                ans[1] = i;
            }
            map.put(nums[i], i);
        }
        return ans;
    }
}
