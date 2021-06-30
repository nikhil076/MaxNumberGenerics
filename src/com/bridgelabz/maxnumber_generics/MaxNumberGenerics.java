package com.bridgelabz.maxnumber_generics;

public class MaxNumberGenerics 
{
	public static <E extends Comparable<E>> void toPrint(E Value1,E Value2,E Value3)
	{
		E maxValue=Value1;
		if(Value2.compareTo(maxValue)>0)
		{
			maxValue=Value2;
		}
		if(Value3.compareTo(maxValue)>0)
		{
			maxValue=Value3;
		}
		System.out.println("the Max Value number is :"+maxValue);
	}

	public static void main(String[] args) {
		toPrint(10, 50, 20);
		toPrint(10.2f, 102.23f, 10.45f);
		toPrint("Apple", "banana", "Pear");
	}
}
