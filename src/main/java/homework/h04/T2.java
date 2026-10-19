package homework.h04;

public class T2 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.findComplement(5)); // Пример проверки (выведет 2)
    }
}

class Solution {
    public int findComplement(int num) {
        int mask = 1;
        while (mask < num) {
            mask = (mask << 1) | 1;
        }
        return num ^ mask;
    }
}