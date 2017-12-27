/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author OST-HuyNguyen
 */
public class LeetCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LeetCode leetCode = new LeetCode();
        int[] nums = {2, 7, 11, 15};
        try {
            int[] hihi = leetCode.twoSum(nums, 11);
            System.out.println("leetcode.LeetCode.main() " + hihi[0] + " and " + hihi[1]);
        } catch (IllegalArgumentException argumentException) {
            System.err.println(argumentException);
        }
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}
