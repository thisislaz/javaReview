package com.lazaroalvarez.abstractdemo;

public abstract class Payment {
	protected double amount;
	
	public Payment(double amount) {
		this.amount = amount;
	}

	public void paymentDetails() {
		System.out.println("Payment amount: "+this.amount);
	}
		
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
}
