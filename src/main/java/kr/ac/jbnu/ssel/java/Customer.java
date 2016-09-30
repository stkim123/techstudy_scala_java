package kr.ac.jbnu.ssel.java;

public class Customer {
	private int customerId;
	public Customer() {
		customerId = 0;
	}
	public Customer(int customerId) 
	{
		this.customerId = customerId;
	}
	
	public int getCustomerId()
	{
		return customerId;
	}
}
