package homework.h05;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class T2test {

    @Test
    void testSortedSquares() {
        T2 t2 = new T2();

        // [-4, -1, 0, 3, 10] -> [0, 1, 9, 16, 100]
        assertArrayEquals(
                new int[]{0, 1, 9, 16, 100},
                t2.sortedSquares(new int[]{-4, -1, 0, 3, 10})
        );

        // [-7, -3, 2, 3, 11] -> [4, 9, 9, 49, 121]
        assertArrayEquals(
                new int[]{4, 9, 9, 49, 121},
                t2.sortedSquares(new int[]{-7, -3, 2, 3, 11})
        );
    }
}
