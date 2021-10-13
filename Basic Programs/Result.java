import java.util.*;
class Result
{
public static void main(String [] s)
{
Scanner sc= new Scanner(System.in);
System.out.print("Enter the marks");
int marks = sc.nextInt();
if(marks < 40)
{
System.out.print("Student is Fail");
}
else
{
System.out.print("Student is pass");
}
}
}