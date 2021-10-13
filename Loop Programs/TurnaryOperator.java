import java.util.*;
public class TurnaryOperator
{
public static void main(String[] args) 
{
int number1, number2, largest;
Scanner sc = new Scanner(System.in);
		
System.out.print(" Please Enter the First Number : ");
number1 = sc.nextInt();	
		
System.out.print(" Please Enter the Second Number : ");
number2 = sc.nextInt();	
		
if(number1 == number2) 
{
System.out.println("\n Both are Equal");     
}
else
{
largest = (number1 > number2)? number1: number2;
System.out.println("\n The Largest Number = " + largest);   
}
}	
}