package homework.h012;

import homework.h012.T1;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class T1Test {

    @Test
    void returnsCorrectMismatchCountForExample1() {
        T1 solver = new T1();
        int[] heights = {1, 1, 4, 2, 1, 3};
        int result = solver.heightChecker(heights);
        assertThat(result).isEqualTo(3);
    }

    @Test
    void returnsZeroForAlreadySortedArray() {
        T1 solver = new T1();
        int[] heights = {1, 2, 3, 4, 5};
        assertThat(solver.heightChecker(heights)).isEqualTo(0);
    }
}