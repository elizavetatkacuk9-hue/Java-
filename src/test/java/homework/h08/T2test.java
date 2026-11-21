package homework.h08;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

class T2test {

    @Test
    void testCountPairs() {
        // [-1, 1, 2, 3, 1], target = 2 -> пары с суммой < 2: (-1,1), (-1,2), (-1,3), (-1,1), (1,1) -> 3 пары?
        // Отсортированный: [-1, 1, 1, 2, 3], target = 2:
        // left=0 (-1), right=4 (3): -1+3=2 (не <2) -> right=3
        // right=2 (1): -1+1=0 (<2) -> count += 2-0 = 2, left=1
        // left=1 (1), right=2 (1): 1+1=2 (не <2) -> right=1 -> стоп. Итого 2 пары.
        assertEquals(2, T2.countPairs(Arrays.asList(-1, 1, 2, 3, 1), 2));

        // [-6, 2, 5, -2, -7, -1, 3], target = -2 -> 10 пар
        assertEquals(10, T2.countPairs(Arrays.asList(-6, 2, 5, -2, -7, -1, 3), -2));
    }
}
