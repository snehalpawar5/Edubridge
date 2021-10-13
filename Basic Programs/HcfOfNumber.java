import java.util.Scanner;
public class HcfOfNumber
{
public static void main(String[] args) 
{
int i,a,b,hcf=0 ;
Scanner sc = new Scanner(System.in);
System.out.print("Enter the first number:");
a = sc.nextInt();
System.out.print("Enter the second number:");
b = sc.nextInt();

for(i = 1; i <= a || i<=b; i++)
{
if(a % i == 0 && b % i==0)
{
hcf=i;
}
}
System.out.print("The hcf of "+a + " and " +b + "is: "+ hcf);
}
}    

