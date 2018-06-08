public class Factorial{
static int factorial(int n){
if(n==0)
return 1;
else
return (n*factorial(n-1));
}
public static void main(String args[]){
fact=1;
int num=4,i;
for(int i=0;i<num;i++){
fact=factorial(num);
System.out.println("Factorial of "+number+"is:" +fact);
}
}
}