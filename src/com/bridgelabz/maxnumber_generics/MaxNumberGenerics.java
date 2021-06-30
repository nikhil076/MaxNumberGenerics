package com.bridgelabz.maxnumber_generics;

public class MaxNumberGenerics<T extends Comparable<T>>
{
	T value1;
	T value2;
	T value3;
	
	public MaxNumberGenerics(T value1, T value2, T value3) 
	{
		super();
		this.value1 = value1;
		this.value2 = value2;
		this.value3 = value3;
	}

	public MaxNumberGenerics() {
		super();
	}


	public <T extends Comparable<T>> void toPrint(T value1,T value2,T value3)
	{
		T maxValue=value1;
		if(value2.compareTo(maxValue)>0)
		{
			maxValue=value2;
		}
		if(value3.compareTo(maxValue)>0)
		{
			maxValue=value3;
		}
		System.out.println("the maximum value is :"+maxValue);
	}

	public static void main(String[] args) {
		Integer integer1 = 20, integer2=50,integer3=10;
		Float float1 = 10.2f, float2=102.23f,float3=10.45f;
		String string1="Apple",string2="banana",string3="Pear";
		
		new MaxNumberGenerics<Integer>().toPrint(integer1, integer2, integer3);
		new MaxNumberGenerics<Float>().toPrint(float1, float2, float3);
		new MaxNumberGenerics<String>().toPrint(string1, string2, string3);
	}
}
