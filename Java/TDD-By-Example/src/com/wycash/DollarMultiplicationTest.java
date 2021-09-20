package com.wycash;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DollarMultiplicationTest {

	@Test
	void testMultiplication() {
		Money five = Money.dollar(5);
		assertEquals(new Dollar(10), five.times(2));
		assertEquals(new Dollar(15), five.times(3));
	}

	@Test
	public void testEquality() {
		assertTrue(Money.dollar(5).equals(Money.dollar(5)));
		assertFalse(Money.dollar(5).equals(Money.dollar(6)));
		assertTrue(Money.franc(5).equals(Money.franc(5)));
		assertFalse(Money.franc(5).equals(Money.franc(6)));
		assertFalse(Money.franc(5).equals(Money.dollar(5)));
	}
	
	@Test
	void testFrancMultiplication() {
		Money five = Money.franc(5);
		assertEquals(Money.franc(10), five.times(2));
		assertEquals(Money.franc(15), five.times(3));
	}
}
