import java.util.*;
class School2
{
void info()
{
System.out.println("Students Details.");
}
}
class Students extends School2
{
void details()
{
super.info();
Scanner sc = new Scanner(System.in);
System.out.println("Enter your name: ");
String name = sc.nextLine();
System.out.println("Enter your branch name: ");
String branch = sc.nextLine();
System.out.println("Enter your year: ");
int year = sc.nextInt();
System.out.println("Enter your roll no: ");
double roolno = sc.nextDouble();
}
}
class Teacher1
{
void details()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter your name: ");
String name = sc.nextLine();
System.out.println("Enter your branch name: ");
String branch = sc.nextLine();
System.out.println("Enter your year: ");
int year = sc.nextInt();
System.out.println("Enter your Subject name: ");
String subject = sc.nextLine();
}
public static void main(String[] args)
{
Students se = new Students();
se.details();
}
}
