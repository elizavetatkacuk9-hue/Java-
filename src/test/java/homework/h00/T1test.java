import homework.h00.T1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class T1Test {

    @Test
    void testAverage() {
        T1 t1 = new T1();
        assertEquals(2500.0, t1.average(new int[]{4000, 3000, 1000, 2000}), 1e-6);
        assertEquals(2000.0, t1.average(new int[]{1000, 2000, 3000}), 1e-6);
        assertEquals(1750.0, t1.average(new int[]{1000, 1500, 2000, 3000}), 1e-6);
    }
}
