package com.basic.String;
import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String  str=sc.next();
		String reverse="";
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
}
			System.out.println("Reversed string");
			System.out.println(reverse);
			
		
		
		
		
	}

}
