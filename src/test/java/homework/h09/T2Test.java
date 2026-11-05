package homework.h09;

import org.junit.jupiter.api.Test;
import java.util.List;
import homework.h010.T2;
import static org.assertj.core.api.Assertions.assertThat;

class T2Test {

    @Test
    void returnsExpectedForExample1() {
        T2 solver = new T2();
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        List<Boolean> result = solver.kidsWithCandies(candies, extraCandies);
        assertThat(result).containsExactly(true, true, true, false, true);
    }

    @Test
    void returnsExpectedForExample2() {
        T2 solver = new T2();
        int[] candies = {4, 2, 1, 1, 2};
        int extraCandies = 1;
        List<Boolean> result = solver.kidsWithCandies(candies, extraCandies);
        assertThat(result).containsExactly(true, false, false, false, false);
    }

    @Test
    void returnsExpectedForExample3() {
        T2 solver = new T2();
        int[] candies = {12, 1, 12};
        int extraCandies = 10;
        List<Boolean> result = solver.kidsWithCandies(candies, extraCandies);
        assertThat(result).containsExactly(true, false, true);
    }
}
