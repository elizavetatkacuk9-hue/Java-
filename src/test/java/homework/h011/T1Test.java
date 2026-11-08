package homework.h011;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class T1Test {

    private final T1 solver = new T1();

    @Test
    void returnsMissingNumberForExample1() {
        int[] nums = {3, 0, 1};
        assertThat(solver.missingNumber(nums)).isEqualTo(2);
    }

    @Test
    void returnsMissingNumberForExample2() {
        int[] nums = {0, 1};
        assertThat(solver.missingNumber(nums)).isEqualTo(2);
    }

    @Test
    void returnsMissingNumberForExample3() {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        assertThat(solver.missingNumber(nums)).isEqualTo(8);
    }
}