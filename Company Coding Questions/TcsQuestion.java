import java.util.*;
class TcsQuestion
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter sum and product of two numbers:");
int a = sc.nextInt();
int b = sc.nextInt();
for(int i=1; i<=100; i++)
for(int j=i; j<=100; j++)
{
if((i+j==a) && (i*j==b))
{
System.out.println(i+ " " +j);
break;
}
}
}
}
