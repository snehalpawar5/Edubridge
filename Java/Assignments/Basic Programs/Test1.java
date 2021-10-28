import java.util.*;
class Test1
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
public static void main(String[] args)
{
Test1 obj = new Test1();
obj.areacircle();
}
}

