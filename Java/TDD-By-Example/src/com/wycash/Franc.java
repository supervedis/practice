package com.wycash;

public class Franc extends Money{
	
	public Franc(int i, String currency) {
		super(i, currency);
	}

	public Money times(int multiplier) {
		return Money.franc(amount*multiplier);
	}
	
}
