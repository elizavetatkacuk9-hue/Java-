package homework.h013;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class T2Test {

    @Test
    void returnsMaximumCountWhenMixedNumbers() {
        T2 solution = new T2();
        assertThat(solution.maximumCount(new int[]{-2, -1, -1, 1, 2, 3})).isEqualTo(3);
    }

    @Test
    void returnsMaximumCountWithZeros() {
        T2 solution = new T2();
        assertThat(solution.maximumCount(new int[]{-3, -2, -1, 0, 0, 1, 2})).isEqualTo(3);
    }

    @Test
    void returnsZeroWhenAllZeros() {
        T2 solution = new T2();
        assertThat(solution.maximumCount(new int[]{0, 0, 0})).isEqualTo(0);
    }
}