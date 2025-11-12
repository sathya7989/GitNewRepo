package com.sathya.main;

import com.sathya.service.Config;

import appConfig.Caluculations;

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

	}
}
