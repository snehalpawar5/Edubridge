import java.util.*;
public class NumberOfDigit 
{
public static void main(String[] args) 
{
int num;
Scanner sc = new Scanner(System.in);
int count = 0;
System.out.println("Enter a number :");
num = sc.nextInt();
while(num!=0)
{
num = num/10;
count++;
}
System.out.println("Number of digits in the entered num are : "+count);
sc.close();
}
}
