package homework.h02;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class T1test {

    @Test
    void testAddDigits() {
        T1 t1 = new T1();

        // num = 38 -> 3 + 8 = 11 -> 1 + 1 = 2
        assertEquals(2, t1.addDigits(38));

        // num = 0 -> 0
        assertEquals(0, t1.addDigits(0));

        // num = 9 -> кратно 9, возвращает 9
        assertEquals(9, t1.addDigits(9));

        // num = 18 -> 1 + 8 = 9
        assertEquals(9, t1.addDigits(18));
    }
}
