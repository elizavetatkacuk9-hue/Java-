package homework.h010;

import java.util.List;

// https://leetcode.com/problems/reverse-string/
public class T2 {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        return null;
    }
}