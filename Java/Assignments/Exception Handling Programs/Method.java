import java.util.*;
public class Test
{
void areacircle()
{
System.out.println("Enter the radius: ");
Scanner sc = new Scanner(System.in);
float r = sc.nextFloat();
float a;
a = (r*r) * 22/7;
System.out.println("Area of circle is:" + a + "sq units");
}
}
class MethodDemo
{
public static void main(String[] args)
{
Test s = new Test();
s.areacircle();
}
}
