package com.sathya.main;

import com.sathya.newbranch.AddUpiPayment;
import com.sathya.service.Config;

import appConfig.Caluculations;
import netBanking.NetBanking;

public class Main 
{
	public static void main(String[] args)
	{
		Config cf=new Config();

		Caluculations cal=new Caluculations();
		
		System.out.println(cf.message());
		System.out.println(cal.add(34, 35));	
		System.out.println(cal.sub(32, 234));
		System.out.println(cal.multiply(34, 04));
		
		AddUpiPayment ap=new AddUpiPayment();
		
		 String msg=ap.Transaction(7989245527d, 470000d, " sadhiya");
		
		System.out.println(msg);
		NetBanking nb=new NetBanking();
		System.out.println(nb.netbanking(300000d, 3000));
		

	}
}
