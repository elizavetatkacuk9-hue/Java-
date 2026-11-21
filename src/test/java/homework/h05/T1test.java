package homework.h05;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class T1test {

    @Test
    void testMaxProductDifference() {
        T1 t1 = new T1();

        // [5, 6, 2, 7, 4] -> (7 * 6) - (2 * 4) = 42 - 8 = 34
        assertEquals(34, t1.maxProductDifference(new int[]{5, 6, 2, 7, 4}));

        // [4, 2, 5, 9, 7, 4, 8] -> (9 * 8) - (2 * 4) = 72 - 8 = 64
        assertEquals(64, t1.maxProductDifference(new int[]{4, 2, 5, 9, 7, 4, 8}));
    }
}