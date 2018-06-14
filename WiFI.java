package com.java.lang.String;

import java.util.Scanner;

public class Wifi {
public static void main(String[] args)
{	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter name:");
	String str=sc.next();
	char c1=str.charAt(str.length() - 1);
	System.out.println(c1); 
	
		System.out.println("Enter room no:");
	int room=sc.nextInt();
	if((room<=999)&& (room>=100)) {
		int remainder=room/10;
		int second=remainder%10;
	System.out.println(second);
		char a[]= {')','!','@','#','%','^','&','*','('};
		System.out.println(a[second]);
		int n = room % 10;
          int b=room/100;
  int c=b+second+n;
  System.out.println(c);
		
          if(c%2!=0) {
        	  c=c-1;
        	  System.out.println("Wifi password is:");
        	  System.out.print(second+"" +c1+""+a[second]+""+c);
          }else
          { System.out.println("Wifi password is:");
        	  System.out.println(second+""+c1+""+a[second]+""+c);  
          }
   }      
}
}

