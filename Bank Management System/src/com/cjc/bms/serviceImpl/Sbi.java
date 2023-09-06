package com.cjc.bms.serviceImpl;
import java.util.Scanner;
import com.cjc.bms.model.Account;
import com.cjc.bms.service.Rbi;
public class Sbi implements Rbi{
	Account bank=new Account();
	
	Scanner sc=new Scanner(System.in);
	double balance;
	public void createAccount()
	{
		System.out.println("Create Account");
		
		System.out.println("Enter Account number");
		bank.setAccno(sc.nextInt());
		
		System.out.println("Enter Account Holder Name");
		bank.setName(sc.next());
		
		System.out.println("Enter Account Holder Mob no");
		bank.setMobno(sc.nextLong());
		
		System.out.println("Enter Account Holder Adhar no");
		bank. setAdharno(sc.nextLong());
		
		System.out.println("Enter Account Holder Gender ");
		bank.setGender(sc.next());
		
		System.out.println("Enter Account Holder Age");
		bank.setAge(sc.nextInt());
		
		System.out.println("Enter Account Holder Bank balance");
		bank.setBalance(sc.nextDouble());
	}
	
	public void displayAllDetails()
	{
		System.out.println("Display All Details");
		System.out.println("Account no: "+bank.getAccno());
		System.out.println("Account Holder Name: "+bank.getName());
		System.out.println("Account Holder Mob no: "+bank.getMobno());
		System.out.println("Account Holder Adhar no: "+bank.getAdharno());
		System.out.println("Account Holder Gender: "+bank.getGender());
		System.out.println("Account Holder Age: "+bank.getAge());
		System.out.println("Account Holder Bank balance: "+bank.getBalance());
	}
	
	public void depositeMoney()
	{
		System.out.println("Deposite Money");
		System.out.println("Enter value for deposite");
		double d=sc.nextDouble();
		balance=bank.getBalance()+d;
		bank.setBalance(balance);
		System.out.println("Account balance="+bank.getBalance());
		
		
	}
	public void withdrawal()
	{
		System.out.println("Withdrawal Money");
		double d=sc.nextDouble();
		balance=bank.getBalance()-d;
		bank.setBalance(balance);
		System.out.println("Account balance is"+bank.getBalance());
		
	}
	public void balanceCheck()
	{
		System.out.println("Balance Check");
		System.out.println("Balance is"+bank.getBalance());
	}

}
