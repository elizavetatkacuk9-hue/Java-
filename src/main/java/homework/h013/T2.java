package homework.h013;

// https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/
public class T2 {

    public int maximumCount(int[] nums) {
        int negCount = 0;
        int posCount = 0;

        for (int num : nums) {
            if (num < 0) {
                negCount++;
            } else if (num > 0) {
                posCount++;
            }
        }

        return Math.max(negCount, posCount);
    }
}
