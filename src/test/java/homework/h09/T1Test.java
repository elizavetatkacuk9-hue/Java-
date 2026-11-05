package homework.h09;

import org.junit.jupiter.api.Test;
import homework.h010.T1;
import static org.assertj.core.api.Assertions.assertThat;

class T1Test {

    @Test
    void returnsExpectedForExample1() {
        T1 solver = new T1();
        int[] nums = {1, 2, 3, 1, 1, 3};
        int result = solver.numIdenticalPairs(nums);
        assertThat(result).isEqualTo(4);
    }

    @Test
    void returnsExpectedForExample2() {
        T1 solver = new T1();
        int[] nums = {1, 1, 1, 1};
        int result = solver.numIdenticalPairs(nums);
        assertThat(result).isEqualTo(6);
    }

    @Test
    void returnsZeroForUniqueElements() {
        T1 solver = new T1();
        int[] nums = {1, 2, 3};
        int result = solver.numIdenticalPairs(nums);
        assertThat(result).isEqualTo(0);
    }
}
