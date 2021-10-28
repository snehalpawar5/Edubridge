import java.util.*;
class Swap
{
public static void main(String s[])
{
int x,y,z;
Scanner sc = new Scanner(System.in);
System.out.println("enter the value of x and y: ");
x= sc.nextInt();
y= sc.nextInt();
System.out.println("Before swaping numbers:"+x +"  "+ y);
z=x;
x=y;
y=z;
System.out.println("After swaping:" +x +"   " + y);
}
}