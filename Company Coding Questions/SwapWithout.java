import java.util.*;
class SwapWithout
{
public static void main(String s[])
{
int x,y;
Scanner sc = new Scanner(System.in);
System.out.println("enter the value of x and y: ");
x= sc.nextInt();
y= sc.nextInt();
System.out.println("Before swaping numbers:"+x +"  "+ y);
x = x ^ y; 
y = x ^ y; 
x = x ^ y;
System.out.println("After swaping:" +x +"   " + y);
}
}