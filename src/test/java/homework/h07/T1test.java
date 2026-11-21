package homework.h07;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;
import static org.junit.jupiter.api.Assertions.assertEquals;

class T1test {

    @Test
    void testFizzBuzz() {
        T1 t1 = new T1();

        // n = 3 -> ["1", "2", "Fizz"]
        assertEquals(Arrays.asList("1", "2", "Fizz"), t1.fizzBuzz(3));

        // n = 5 -> ["1", "2", "Fizz", "4", "Buzz"]
        assertEquals(Arrays.asList("1", "2", "Fizz", "4", "Buzz"), t1.fizzBuzz(5));

        // n = 15
        assertEquals(
                Arrays.asList(
                        "1", "2", "Fizz", "4", "Buzz",
                        "Fizz", "7", "8", "Fizz", "Buzz",
                        "11", "Fizz", "13", "14", "FizzBuzz"
                ),
                t1.fizzBuzz(15)
        );
    }
}
