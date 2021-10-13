import java.util.*;
public class LoanCalculator 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter an amount: ");
double amount = sc.nextInt();
double temp;
for(int i=1; i<=3; i++)
{
temp = amount;
amount = temp - (temp * 0.1);
}
System.out.println(amount);
}
}