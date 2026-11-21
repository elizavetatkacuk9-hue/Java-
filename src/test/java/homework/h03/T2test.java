package homework.h03;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class T2test {

    @Test
    void testReverse() {
        T2 t2 = new T2();

        // 123 -> 321
        assertEquals(321, t2.reverse(123));

        // -123 -> -321
        assertEquals(-321, t2.reverse(-123));

        // 120 -> 21
        assertEquals(21, t2.reverse(120));

        // Переполнение int -> 0
        assertEquals(0, t2.reverse(1534236469));
    }
}