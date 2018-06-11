package com.basic;

public class Password {
	public int findPassword(int input1,int input2,int input3,int input4,int input5) {
		int p1=show(input1);
		int p2=show(input2);
		int p3=show(input3);
		int p4=show(input4);
		int p5=show(input5);
		int p=input1+input2+input3+input4+input5;
		return p;				
	}
public static int show(int x){
	String s=String.valueOf(x);
	String a="";
	int password=0;
	int count=0;
	for(int i=0;i<a.length();i++)
	{
		for(int j=0;j<a.length();j++)
		{
			if(s.charAt(i)==s.charAt(i))
			{
				if(i!=j)
				{
					count=1;
					a+=s.charAt(i);
				}
			}
		}
	}
	if(count==0)
	{
		return password;
	}
	else
	{
	}
	if(s.equals(s)==true){
		return password;
	}
	else
	{
		password=Integer.parseInt(s);
		return password;
		
	}
}
	public static void main(String[] args) {
		Password stable=new Password();
		System.out.println(stable.findPassword(12,13,22,68,898));
		
	}
		
	
	
	
	
}
 
	


