
public class Array {
 
	public static void main(String args[]) {
		int N=78945,t=N,remainder;
		int i=0;
   int array[] =new int[10];
   while(t>0){
   
	  remainder =t % 10;
	  array[i]=remainder;
	  i++;
	  t=t/10;
   }
   for( i=0;i<10;i++)
   System.out.println(array[i]);	
	}	 
	 
 }
	
 
 

