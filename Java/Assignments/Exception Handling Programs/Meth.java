import java.util.*;
class Meth
{
float a;
System.out.println("Enter the radius: ");
Scanner sc = new Scanner(System.in);
float r = sc.NextFloat();
a = (r*r)*3.14;
System.out.println("Area of circle is:" + area);
}
public static void main(String[] args)
{
Meth m = new Meth();
m.areacircle();
}

