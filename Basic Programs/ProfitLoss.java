import java.util.*;
public class ProfitLoss {

	public static void main(String[] args) {
		double cp,sp;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the cost price: ");
		cp= sc.nextDouble();
		System.out.println("Enter the selling price: ");
		sp= sc.nextDouble();
		sc.close();
		if(cp-sp > 0) {
			System.out.println("Loss:" + (cp-sp));
		}
		else {
			System.out.println("Profit:" + (sp-cp));
		}

	}

}