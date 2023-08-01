package com.cg.day7;

public class SavingsAmount extends Person implements Bank{
	private int accNo;
	private float balance;
	
	public SavingsAmount(String name, String city,int accNo, float balance) {
		super();
		this.accNo = accNo;
		this.balance = balance;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public void deposit(float amount) {
		if(amount >2500)
			System.out.println("Daily limit exceeds");
		else {
			balance+=amount;
			System.out.println("amount deposited.."+amount);
		}
	}
	public void withdraw(float amount) {
		if(amount <=balance-MINBAL) {
			balance -= amount;
			System.out.println("withdrawal successfull....");
		} else
			System.out.println("Insufficient balance...");
	}
	@Override
	public String toString() {
		return "Savingamount [accNo=" + accNo + ", balance=" + balance + "]";
	}
	
	
	
}
/*public class SavingsAmount {
	//

}*/
