package com.bridgelabz.maxnumber_generics;

public class MaxNumberGenerics 
{
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
	
	public static void toPrintFloat(Float floatVal1,Float floatVal2,Float floatVal3, Float maxFloat)
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
	
	public static void toPrintString(String stringVal1,String stringVal2,String stringVal3, String maxString)
	{
		maxString=stringVal1;
		if(stringVal2.compareTo(maxString)>0)
		{
			maxString=stringVal2;
		}
		if(stringVal3.compareTo(maxString)>0)
		{
			maxString=stringVal3;
		}
		System.out.println("the Max String number is :"+maxString);
	}

	public static void main(String[] args) {
		Integer maxInteger= 0;
		Float maxFloat= 0f;
		toPrintInteger(10, 50, 20, maxInteger);
		toPrintFloat(10.2f, 102.23f, 10.45f, maxFloat);
		toPrintString("Apple", "banana", "Pear", null);
	}
}
