package com.cjc.bms.client;
import com.cjc.bms.service.Rbi;
import com.cjc.bms.serviceImpl.Sbi;
import java.util.Scanner;
public class Test {
	public static void main(String args [])
	{
	

		Rbi bank1=new Sbi();
	while(true) {
		System.out.println("1.createAccount");
		System.out.println("2.viewAccountDetails\n"
				+"3.Deposit\n"
				+"4.Withdrawal money\n"
				+"5.Check Account Balance\n"
				+"6.Exit");
		
		

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter ur choice");
		
		int i=sc.nextInt();{
		

		if(i==1)
		{
			//System.out.println("Create Account");
              bank1.createAccount();
		}

		
		else if(i==2)
		{
			
		bank1.displayAllDetails();
		}
		
		else if(i==3)
		{
		//System.out.println("Deposite Money");
		bank1.depositeMoney();
		}

		
		else if(i==4)
		{
		//System.out.println("Withdrawal your Money");
		bank1.withdrawal();
		
		}

		
		else if(i==5)
		{
		//System.out.println("Check your Balance");
		bank1.balanceCheck();
		}

		else if(i==6)
		{
		break;
		
		}
		else
		{
			System.out.println("Exit");
			
		}
		}
		
		}
	}

}
