package homework.h06;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class T2test {

    @Test
    void testIsPalindrome() {
        T2 t2 = new T2();

        // палиндром с пробелами и знаками препинания
        assertTrue(t2.isPalindrome("A man, a plan, a canal: Panama"));

        // не палиндром
        assertFalse(t2.isPalindrome("race a car"));

        // пустая строка / только знаки препинания -> true
        assertTrue(t2.isPalindrome(" "));
    }
}
