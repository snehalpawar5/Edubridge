import java.util.*;
public class AlphabetDigitSpecial 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any character: ");
		char ch = sc.next().charAt(0);
		sc.close();
		if((ch >='a' && ch <='z') || (ch >='A' && ch <= 'Z'))
		{
			System.out.println(ch + "is a Alphabet.");
		}
		if (ch >='0' && ch <= '9')
		{
			System.out.println(ch + "is a Digit.");
		}
		else {
			System.out.println(ch + "is a Special character.");
		}

	}

}
