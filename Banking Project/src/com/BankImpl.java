package com;
public class BankImpl implements Bank {
	int balance;
	BankImpl(int balance){
		this.balance=balance;
	}
	@Override
	public void deposit(int amt) {
		System.out.println("Depositing Rs:"+amt);
		balance+=amt;
		System.out.println("Amount deposited successfully!");

	}
	@Override
	public void withDraw(int amt) {
		if(amt<=balance) {
			System.out.println("Withdrawing Rs:"+amt);
			balance-=amt;
			System.out.println("Amount withdrawn successfully!");
		}
		else try {
			throw new InsufficientBalanceException("Insufficient balance");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	@Override
	public void checkBalance() {
		System.out.println("Available balance is Rs:"+balance);

	}
}
