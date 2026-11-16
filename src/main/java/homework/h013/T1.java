package homework.h013;

// https://leetcode.com/problems/first-bad-version/
public class T1 {

    // API, яке імітує перевірку від LeetCode (у реальній задачі воно задається середовищем)
    boolean isBadVersion(int version) {
        return version >= badVersion;
    }

    private int badVersion;

    public T1(int badVersion) {
        this.badVersion = badVersion;
    }

    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
