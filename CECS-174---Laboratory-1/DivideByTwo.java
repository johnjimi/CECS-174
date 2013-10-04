import java.text.DecimalFormat;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Scanner;
public class DivideByTwo {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	DecimalFormat dc = new DecimalFormat("######.000000");
	double number;
	int numberOfDivisions, i;
	System.out.print("Enter a number to divide by 2: ");
	number=scan.nextInt();
	System.out.print("How many divisions do you want to perform?: ");
	numberOfDivisions=scan.nextInt();
		for (i=0; i<=numberOfDivisions;i++)
		{
		System.out.println("Division#"+i+"\t"+dc.format(number));
		number=number/2.0;
		}
	}
}
