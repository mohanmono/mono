package com.basic;

public class MinMax {
	 
	public static int getMaxValue(int[] array) 				
		{
			int MaxValue=array[0];
			for(int i=0;i<array.length;i++) {		
			
			if(array[i]>MaxValue)
				MaxValue=array[i];
		}
			return MaxValue;
		
	}
	public  static int getMinValue(int[] array) 				
	{
		int MinValue=array[0];
		for(int i=0;i<array.length;i++) {		
		
		if(array[i]<MinValue)
			MinValue=array[i];
	}
		return MinValue;
	
}
	public static void main(String args[]) {
		int array[]= new int[]{3,4,5,2,33,24,2};
		//MinMax max=new MinMax();
		//MinMax min =new MinMax();
		int MaxValue =getMaxValue(array);
		System.out.println("MaxValue:" +MaxValue);
		int MinValue =getMinValue(array);
		System.out.println("MinValue:" +MinValue);	
		
			
}

}
