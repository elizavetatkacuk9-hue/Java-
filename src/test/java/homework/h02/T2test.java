package homework.h02;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class T2test {

    @Test
    void testIsSameAfterReversals() {
        T2 t2 = new T2();

        // num = 526 -> 526 -> 625 -> 526 (true)
        assertTrue(t2.isSameAfterReversals(526));

        // num = 1800 -> 1800 -> 81 -> 18 (false)
        assertFalse(t2.isSameAfterReversals(1800));

        // num = 0 -> 0 -> 0 -> 0 (true)
        assertTrue(t2.isSameAfterReversals(0));
    }
}
