package homework.h011;

// https://leetcode.com/problems/missing-number/

import java.util.Arrays;

public class T1 {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = Arrays.stream(nums).sum();
        return expectedSum - actualSum;
    }
}
