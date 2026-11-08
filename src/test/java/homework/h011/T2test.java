package homework.h011;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class T2Test {

    private final T2 solver = new T2();

    @Test
    void returnsMajorityElementForExample1() {
        int[] nums = {3, 2, 3};
        assertThat(solver.majorityElement(nums)).isEqualTo(3);
    }

    @Test
    void returnsMajorityElementForExample2() {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        assertThat(solver.majorityElement(nums)).isEqualTo(2);
    }
}