import java.text.*;//for println
	import java.util.*;//scanner input
	public class SolveQuadratic {
	 public static void main(String args []){
	  int a, b, c;//They are going to be input
	  double discriminate,solutionX1,solutionX2;
	  Scanner scan = new Scanner(System.in);
System.out.print("Enter the coefficients to solve the equation:             ");
	a=scan.nextInt();//The input is converted to integer here
	b=scan.nextInt();
	c=scan.nextInt();
	discriminate = b*b-4*a*c;
	if (discriminate >= 0.0){
	   System.out.print("There are real solutions");
	   solutionX1 = (-1.0*b-Math.sqrt(discriminate))/(2.0*a);
	   solutionX2 = (-1.0*b+Math.sqrt(discriminate))/(2.0*a);
System.out.println("The solution are: ("+solutionX1+","+solutionX2+")");
	  }
	  else
	  {
	  System.out.println("There is a NO real solution.");
	 } }}

