package com.wycash;

public class Franc extends Money{
	public Franc(int i) {
		this.amount = i;
	}

	public Franc times(int multiplier) {
		return new Franc(amount*multiplier);
	}
	
}
