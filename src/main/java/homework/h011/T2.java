package homework.h011;

// https://leetcode.com/problems/majority-element/

import java.util.Arrays;

public class T2 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
