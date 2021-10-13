import java.util.*;
public class GreatestNumber 
{
public static void main(String[] args) 
{
int a,b,c;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the three numbers:");
a= sc.nextInt();
b= sc.nextInt();
c= sc.nextInt();
sc.close();
if(a>=b) 
{
if(a>=c)
{
System.out.println(a + "is greatest number");
} else {
System.out.println(c +"is greatest number");
}  
if(b>=c)
{
System.out.println(b + "is greatest number");
}
else {
System.out.println(c + "is greatest number");
}
}
}