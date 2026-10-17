package homework.h04;

public class T2 {
    public int findComplement(int num) {
        int mask = Integer.highestOneBit(num);
        mask = (mask << 1) - 1;
        return num ^ mask;
    }
}