package com;
import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Welcome to ICICI Bank");
		System.out.println("--------------------");
		Bank bank=new BankImpl(2000);
		while(true) {
			System.out.println("1:Deposit\n2:Withdraw\n3:Check Balance\n4:Exit");
			System.out.println("Enter Choice");
			int choice=s.nextInt();
			switch(choice) {
			case 1:System.out.println("enter amount to be deposited");
			bank.deposit(s.nextInt());
			break;
			case 2:System.out.println("Enter amount to be withdrawn");
			int amounttowithdraw=s.nextInt();
			bank.withDraw(amounttowithdraw);
			break;
			case 3:System.out.println("Checking balance amount");
			bank.checkBalance();
			break;
			case 4:System.out.println("Thank you visit again!!");
			System.exit(0);
			break;
			default:try {
				throw new InvalidChoice("invalid choice");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			}
		}
	}
}

