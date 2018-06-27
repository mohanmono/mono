package com.basic.String;
import java.util.*;
import java.lang.*;


public class Possible {
	public void identifyPossibleWords(String input1,String input2)
	{
		input1=input1.toUpperCase();
		input2=input2.toUpperCase();
		String[] s1=input2.split(":");
		String[] s2=new String[s1.length];
		int n=0,c=0;
		for(int i=0;i<s1.length;i++)
		{
			for(int k=65;k<91;k++)
			{
				String s3=input1;
				char a=(char)k;
				s3=s3.replace('_',a);
				if(s3.equals(s1[i]))
				{
					s2[n]=s3;
					n+=1;
					c+=1;
				}
				
			}
		}
		for(int j=0;j<s2.length;j++)
		{
			if(s2[j]!=null)
			{
				System.out.println(s2[j]);
			}
			if((j<s2.length-1)&&(s2[j+1]!=null))
			{
				System.out.println(":");
			}
		}
		if(c==0)
		{
			System.out.println("ERROR");		}
	}
	
	
	
			
	
	public static void main(String[] args)
	{
	Possible obj=new Possible();
	obj.identifyPossibleWords(args[0], args[1]);
	}
}		
		
	


