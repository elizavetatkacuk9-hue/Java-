package homework.h04;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class T1test {

    @Test
    void testHammingDistance() {
        T1 t1 = new T1();

        assertEquals(2, t1.hammingDistance(1, 4));
        assertEquals(1, t1.hammingDistance(3, 1));
        assertEquals(0, t1.hammingDistance(7, 7));
    }
}