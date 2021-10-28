import java.util.*;
class TwoNumbers
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter sum and product of two numbers:");
int a = sc.nextInt();
int b = sc.nextInt();
for(int i=1; i<=100; i++)
{
if((i+(i+1)==a) && (i*(i+1)==b))
{
System.out.println(i+ " " +(i+1));
break;
}
}
}
}


