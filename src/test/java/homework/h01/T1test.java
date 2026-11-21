package homework.h01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class T1Test {

    @Test
    void testCountOdds() {
        T2 t2 = new T2();

        // low = 3, high = 7 -> нечётные числа: 3, 5, 7 (всего 3)
        assertEquals(3, t2.countOdds(3, 7));

        // low = 8, high = 10 -> нечётное число: 9 (всего 1)
        assertEquals(1, t2.countOdds(8, 10));

        // low = 2, high = 6 -> нечётные числа: 3, 5 (всего 2)
        assertEquals(2, t2.countOdds(2, 6));

        // low = 4, high = 4 -> чётное число (нечётных 0)
        assertEquals(0, t2.countOdds(4, 4));
    }
}
