package h08;
import java.util.List;
import java.util.Arrays;
public class T2 { public static int countPairs(List<Integer> nums, int target) { Integer[] arr = nums.toArray(new Integer[0]); Arrays.sort(arr);
    int count = 0;
    int left = 0;
    int right = arr.length - 1;

    while (left < right) {
        if (arr[left] + arr[right] < target) {
            count += (right - left);
            left++;
        } else {
            right--;
        }
    }

    return count;
}

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(-1, 1, 2, 3, 1);
        int target = 2;
        System.out.println("Count pairs: " + countPairs(nums, target));
    }
}