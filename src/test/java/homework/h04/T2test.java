package homework.h04;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class T2test {

    @Test
    void testFindComplement() {
        Solution solution = new Solution();

        // 5 (101) -> 2 (010)
        assertEquals(2, solution.findComplement(5));

        // 1 (1) -> 0 (0)
        assertEquals(0, solution.findComplement(1));

        // 7 (111) -> 0 (000)
        assertEquals(0, solution.findComplement(7));
    }
}
