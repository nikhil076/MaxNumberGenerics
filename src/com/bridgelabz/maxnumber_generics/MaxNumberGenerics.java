package com.bridgelabz.maxnumber_generics;

import java.util.Scanner;

public class MaxNumberGenerics {

	public static void toPrintInteger(Integer integerVal1,Integer integerVal2,Integer integerVal3, Integer maxInteger)
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
		System.out.println("the Max Integer number is :"+maxInteger);
	}
	
	public static void toPrintFloat(float floatVal1,float floatVal2,float floatVal3, float maxFloat)
	{
		maxFloat=floatVal1;
		if(Float.compare(floatVal2, maxFloat)>0)
		{
			maxFloat=floatVal2;
		}
		if(Float.compare(floatVal3, maxFloat)>0)
		{
			maxFloat=floatVal3;
		}
		System.out.println("the Max Float number is :"+maxFloat);
	}

	public static void main(String[] args) {
		Integer maxInteger= 0;
		Integer maxFloat= 0;
		Scanner scanner = new Scanner(System.in);
		toPrintInteger(10, 50, 20, maxInteger);
		toPrintFloat(10.2f, 102.23f, 10.45f, maxInteger);
	}
}
