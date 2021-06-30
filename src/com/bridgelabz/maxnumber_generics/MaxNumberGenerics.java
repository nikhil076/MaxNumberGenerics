package com.bridgelabz.maxnumber_generics;

public class MaxNumberGenerics 
{
	public static <E extends Comparable<E>> void toPrint(E integerVal1,E integerVal2,E integerVal3)
	{
		E maxInteger=integerVal1;
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

	public static void main(String[] args) {
		toPrint(10, 50, 20);
		toPrint(10.2f, 102.23f, 10.45f);
		toPrint("Apple", "banana", "Pear");
	}
}
