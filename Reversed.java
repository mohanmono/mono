public class Reverse{
public static void main(String args[]){
String str="Welcome to java";
String reversed=reversedString(str);
System.out.println("The reversed String: "+ reversed);
}
public static string reversestring(String str){
if(str.isEmpty())
return str;
return reversestring(str.substring(1))+str.chatAt(0);
}
}