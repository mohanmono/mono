package com.basic.String;
import java.util.*;
import java.lang.*;

public class StringWords {
	public static void main(String[] args)
	{
		String input1="";
		int input2 = 0;
		int a=input2/10;
		int b=input2%10;
		String[]  s=input1.split(" ");
		String word[]= {s[a-1],s[b-1]};
		String answer[]=new String[2];
		for(int i=0;i<word.length;i++)
		{
			if(word[i].length()%2==0)
			{
				int size=word[i].length()/2;
				String c="";
				String d="";
				char arr[]=word[i].toCharArray();
				for(int j=size-1;j>=0;j--)
				{
					c=c+arr[j]+"";
				}
				for(int j=size;j<arr.length;j++)
				{
					d=d+arr[j]+"";
				}
			
			answer[i]=c+d+"";
			}
		else
		{
			int size=word[i].length()/2+1;
			String c="";
			String d="";
			char arr[]=word[i].toCharArray();
			for(int j=size-1;j>=0;j--)
			{
				c=c+arr[j]+"";
				System.out.println(c);
			}
			for(int j=size;j<arr.length;j++)
			{
				d=d+arr[j]+"";
				System.out.println(d);
			}
		
		answer[i]=c+d+"";
		}
		}
		
		
	
String output=answer[0]+" "+answer[1]+"";
System.out.println(output);
	}
}


