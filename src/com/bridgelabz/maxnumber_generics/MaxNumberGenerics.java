package com.bridgelabz.maxnumber_generics;

import java.util.Scanner;

public class MaxNumberGenerics {

	public static void toPrint(Integer integerVal1,Integer integerVal2,Integer integerVal3, Integer maxInteger)
	{
		maxInteger=integerVal1;
		if(integerVal2.compareTo(maxInteger)>0)
		{
			maxInteger=integerVal2;
		}
		if(integerVal3.compareTo(maxInteger)>0)
		{
			maxInteger=integerVal3;
		}
		System.out.println("the Max integer number is :"+maxInteger);
	}

	public static void main(String[] args) {
		Integer maxInteger= 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First integer value :");
		int integerVal1 = scanner.nextInt();
		System.out.println("Enter Second integer value :");
		int integerVal2 = scanner.nextInt();
		System.out.println("Enter Third integer value :");
		int integerVal3 = scanner.nextInt();
		
		toPrint(integerVal1, integerVal2, integerVal3, maxInteger);
	}
}
