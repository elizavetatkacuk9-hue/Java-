package homework.h06;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class T1test {

    @Test
    void testIsAnagram() {
        T1 t1 = new T1();

        // "anagram" и "nagaram" -> анаграммы
        assertTrue(t1.isAnagram("anagram", "nagaram"));

        // "rat" и "car" -> не анаграммы
        assertFalse(t1.isAnagram("rat", "car"));

        // разная длина -> false
        assertFalse(t1.isAnagram("ab", "a"));
    }
}
