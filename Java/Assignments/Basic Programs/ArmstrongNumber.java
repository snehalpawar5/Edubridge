// Program for any digit Armstrong numbers.

import java.util.Scanner;
public class ArmstrongNumber
{
public static void main(String[] args) 
{
int num,rem,temp,sum=0;
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number:");
num = sc.nextInt();
temp = num;
while(temp !=0)
{
rem =temp % 10;
sum=sum +( rem * rem * rem);
temp = temp/10;
}
if(sum == num)
{
System.out.print(num + " is an armstromg number.");
}
else
{
System.out.print(num + " is an armstromg number.");
}
}
}


