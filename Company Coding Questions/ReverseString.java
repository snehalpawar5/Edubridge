import java.util.*;  
class ReverseString  
{  
public static void main(String parvez[])  
{  
  
String original, reverse= " ";  
Scanner in=new Scanner(System.in);  
System.out.println("Enter the string: ");  
original= in.nextLine();  
int length=original.length();  
for(int i=length-1;i>=0;i--)  
reverse=reverse+original.charAt(i);  
System.out.println("Reversed string: " +reverse);  
}  
}  