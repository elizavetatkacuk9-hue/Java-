package homework.h03;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class T1test {

    @Test
    void testRomanToInt() {
        T1 t1 = new T1();

        // "III" -> 3
        assertEquals(3, t1.romanToInt("III"));

        // "LVIII" -> 50 + 5 + 1 + 1 + 1 = 58
        assertEquals(58, t1.romanToInt("LVIII"));

        // "MCMXCIV" -> 1000 + (1000 - 100) + (100 - 10) + (5 - 1) = 1994
        assertEquals(1994, t1.romanToInt("MCMXCIV"));
    }
}
