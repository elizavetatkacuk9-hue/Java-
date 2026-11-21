package homework.h00;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class T2Test {

    @Test
    void testDifferenceOfSums() {
        T2 t2 = new T2();

        // n = 10, m = 3 -> (1+2+4+5+7+8+10) - (3+6+9) = 37 - 18 = 19
        assertEquals(19, t2.differenceOfSums(10, 3));

        // n = 5, m = 6 -> ни одно число не делится на 6 -> (1+2+3+4+5) - 0 = 15
        assertEquals(15, t2.differenceOfSums(5, 6));

        // n = 5, m = 1 -> все числа делятся на 1 -> 0 - (1+2+3+4+5) = -15
        assertEquals(-15, t2.differenceOfSums(5, 1));
    }
}