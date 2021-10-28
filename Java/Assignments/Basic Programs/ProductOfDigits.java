import java.util.*;
class ProductOfDigits
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number: ");
int num = sc.nextInt();
int d,product=1;
if(num<0 || num >32767)
{
System.out.println("Invalid input");
}
else
{
while(num>0)
{
d = num%10;
product= product * d;
num = num /10;
}
System.out.println(product);
}
}
}
