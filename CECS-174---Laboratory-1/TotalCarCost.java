import java.text.NumberFormat;
import java.util.Scanner;
public class TotalCarCost 
	{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		NumberFormat money = NumberFormat.getCurrencyInstance();
		double subTotal;
		double total, taxes=0.081, DMVfees=300.75;
		System.out.print("Your dream car costs how much?:");
		subTotal = scan.nextDouble();
		total = subTotal*(1.0+taxes) + DMVfees;
		System.out.println("The Total out the door cost will be: "+money.format(total));
	}
}
