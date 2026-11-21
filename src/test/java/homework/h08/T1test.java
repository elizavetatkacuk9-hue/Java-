package homework.h08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class T1test {

    @Test
    void testFindMaxConsecutiveOnes() {
        // [1, 1, 0, 1, 1, 1] -> максимум 3 единицы подряд
        assertEquals(3, T1.findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1}));

        // [1, 0, 1, 1, 0, 1] -> максимум 2 единицы подряд
        assertEquals(2, T1.findMaxConsecutiveOnes(new int[]{1, 0, 1, 1, 0, 1}));

        // нет единиц -> 0
        assertEquals(0, T1.findMaxConsecutiveOnes(new int[]{0, 0}));
    }
}