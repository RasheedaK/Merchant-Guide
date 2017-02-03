import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumberTest {
    @Test
    public void shouldReturnEqualIfTwoRomanNumbersAreEqual() {
        RomanNumber romanNumberOne = new RomanNumber('L', 50);
        RomanNumber romanNumberTwo = new RomanNumber('L', 50);
        assertEquals(romanNumberOne, romanNumberTwo);
    }

    @Test
    public void shouldReturnNotEqualIfTwoRomanNumbersAreNotEqual() {
        RomanNumber romanNumberOne = new RomanNumber('L', 50);
        RomanNumber romanNumberTwo = new RomanNumber('V', 5);
        assertNotEquals(romanNumberOne, romanNumberTwo);
    }
}