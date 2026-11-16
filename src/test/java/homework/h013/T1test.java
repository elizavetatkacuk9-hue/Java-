package homework.h013;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class T1Test {

    @Test
    void returnsFirstBadVersionWhenMultipleVersions() {
        T1 solution = new T1(4);
        assertThat(solution.firstBadVersion(5)).isEqualTo(4);
    }

    @Test
    void returnsFirstBadVersionWhenOnlyOneVersion() {
        T1 solution = new T1(1);
        assertThat(solution.firstBadVersion(1)).isEqualTo(1);
    }
}