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
		toPrint(this.value1, this.value2, this.value3);
	}

	public MaxNumberGenerics() {
		super();
	}


	public <T extends Comparable<T>> void toPrint(T value1,T value2,T value3)
	{
		T middle,start,end;
		T maxValue=value1;
		if(value2.compareTo(maxValue)>0)
		{
			maxValue=value2;
		}
		if(value3.compareTo(maxValue)>0)
		{
			maxValue=value3;
		}
		if (value1.compareTo(value2)>0)
		{   
			middle=value1;    
			start=value2;   
		 }else 
		 {
			   middle=value2;  
			   start=value1;  
		 } 
		 if (middle.compareTo(value3)>0)
		 { 
			  end=middle;    
			  if(start.compareTo(value3)>0)
			  {         
				  middle=start;                
				  start=value3;
			  }
			  else
			  {
				  middle=value3;      
			  }         
		  }
		  else 
		   end=value3;
		   System.out.println("Sorted Value is ");
		   System.out.println(start);
		   System.out.println(middle);
		   System.out.println(end); 
		   System.out.println("the maximum value is :"+maxValue);
		   System.out.println();
	}

	public static void main(String[] args) {
		Integer integer1 = 20, integer2=50,integer3=10;
		Float float1 = 10.2f, float2=102.23f,float3=10.45f;
		String string1="Fig",string2="banana",string3="Pear";
		
		new MaxNumberGenerics<Integer>(integer1, integer2, integer3);
		new MaxNumberGenerics<Float>(float1, float2, float3);
		new MaxNumberGenerics<String>(string1, string2, string3);
	}
}
