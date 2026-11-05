package homework.h010;

// https://leetcode.com/problems/find-the-k-th-character-in-string-game-i/
public class T1 {
    public char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder("a");
        while (sb.length() < k) {
            int len = sb.length();
            for (int i = 0; i < len; i++) {
                char nextChar = (char) (sb.charAt(i) + 1);
                sb.append(nextChar);
            }
        }
        return sb.charAt(k - 1);
    }

    public int numIdenticalPairs(int[] nums) {
        return 0;
    }
}