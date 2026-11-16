package homework.h012;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class T2Test {

    @Test
    void sortsArrayAccordingToRelativeOrderFromExample1() {
        T2 solver = new T2();
        int[] arr1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] arr2 = {2, 1, 4, 3, 9, 6};
        int[] expected = {2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19};

        int[] result = solver.relativeSortArray(arr1, arr2);
        assertThat(result).containsExactly(expected);
    }
}

