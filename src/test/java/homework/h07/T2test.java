package homework.h07;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class T2test {

    @Test
    void testNumberOfSteps() {
        T2 t2 = new T2();

        // 14 -> 7 -> 6 -> 3 -> 2 -> 1 -> 0 (6 шагов)
        assertEquals(6, t2.numberOfSteps(14));

        // 8 -> 4 -> 2 -> 1 -> 0 (4 шага)
        assertEquals(4, t2.numberOfSteps(8));

        // 0 -> 0 шагов
        assertEquals(0, t2.numberOfSteps(0));
    }
}
