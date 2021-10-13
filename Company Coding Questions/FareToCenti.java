import java.util.*;
public class FareToCenti
{
public static void main(String[] args)
{
int f,c;
Scanner sc = new Scanner(System.in);
System.out.println("Enter value: ");
f = sc.nextInt();
if(f<0)
{
System.out.println("Invalid Input.");
}
else
{
c = ((f-32)*5)/9;
float num = c;
System.out.printf("%.2f", Math.abs(num));
}
}
}