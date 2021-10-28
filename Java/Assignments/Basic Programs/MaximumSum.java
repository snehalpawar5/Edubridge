import java.util.*;
public class MaximumSum
{
public static void main(String[] args)
{
int n,sumE=0, sumO=0;
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number of elements in array:");
n = sc.nextInt();
int[] a = new int[n];
System.out.println("Enter the elements of the array:");
if(n<0)
{
System.out.println("Invalid array size.");
System.exit(0);
}
else
{
for(int i = 0; i < n; i++)
{
a[i] = sc.nextInt();
if(a[i]<0)
{
System.out.println("Invalid input.");
System.exit(0);
}
}
for(int i = 0; i < n; i++)
{
if(a[i] % 2 == 0)
{
sumE = sumE + a[i];
}
else
{
sumO = sumO + a[i];
}
}
}
System.out.println("Sum of Even Numbers:"+sumE);
System.out.println("Sum of Odd Numbers:"+sumO);
if(sumE>sumO)
{
System.out.println("Maximum sum is:"+sumE);
}
else
{
System.out.println("Maximum sum is:"+sumO);
}
}
}