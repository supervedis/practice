package com.wycash;

public class Franc {
	private int amount;
	public Franc(int i) {
		this.amount = i;
	}

	public Franc times(int multiplier) {
		return new Franc(amount*multiplier);
	}
	
	@Override
	public boolean equals(Object obj) {
		Franc franc = (Franc)obj;
		return amount==franc.amount;
	}
}
