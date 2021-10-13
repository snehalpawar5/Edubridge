import java.util.*;
public class PercentageGrade 
{
	public static void main(String[] args) {
		float physics,chem,bio,maths,comp;
		Scanner sc = new Scanner(System.in);
		double total,percentage;
                System.out.println("Enter the marks of physics: ");
		physics = sc.nextInt();
                System.out.println("Enter the marks of chem: ");
		chem = sc.nextInt();
                System.out.println("Enter the marks of bio: ");
		bio = sc.nextInt();
                System.out.println("Enter the marks of maths: ");
		maths = sc.nextInt();
                System.out.println("Enter the marks of comp: ");
		comp = sc.nextInt();
		sc.close();
		total = physics + chem + bio + maths + comp;
		percentage = (total/500) * 100;
		System.out.println(percentage);
		if(percentage >= 90)
		{
			System.out.println("Grade A");
		}
		else if(percentage >= 80)
		{
			System.out.println("Grade B");
		}
		else if(percentage >= 70)
		{
			System.out.println("Grade C");
		}
		else if(percentage >= 60)
		{
			System.out.println("Grade D");
		}
		else if(percentage >= 40)
		{
			System.out.println("Grade E");
		}
		else
		{
			System.out.println("Grade F");
		}
	}
}