import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	@Test
	public void test() {
		assertEquals(1, RomanNumerals.convertToInteger("I"));
		assertEquals(10, RomanNumerals.convertToInteger("X"));
		assertEquals(100, RomanNumerals.convertToInteger("C"));
	}

}
