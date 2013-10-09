import java.util.Scanner;
import java.util.Scanner.*;
import java.text.*;
public class Triangle {
	public static void main(String[] args) {
		double a,b,c,x1,y1,x2,y2,x3,y3;
		double cosA,cosB,cosC;
		double A,B,C;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter three points, i.e., six values: ");
		x1=scan.nextDouble();
		y1=scan.nextDouble();
		x2=scan.nextDouble();
		y2=scan.nextDouble();
		x3=scan.nextDouble();
		y3=scan.nextDouble();
		DecimalFormat DeciFor = new DecimalFormat("0.0000");
		a = distance(x1,y1,x2,y2);
		b = distance(x2,y2,x3,y3);
		c = distance(x1,y2,x3,y3);
		cosA=(-a*a+b*b+c*c)/(2.0*b*c);
		cosB=(-b*b+a*a+c*c)/(2.0*a*c);
		cosC=(-c*c+b*b+a*a)/(2.0*a*b);
		A=Math.acos(cosA)*180.0/Math.PI;
		B=Math.acos(cosB)*180.0/Math.PI;
		C=Math.acos(cosC)*180.0/Math.PI;
		System.out.println("The angles are: "+DeciFor.format(A)+"\t"+DeciFor.format(B)+"\t"+DeciFor.format(C));
	}
	public static double distance(double x1, double y1, double x2, double y2)
	{
		return Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
	}
}

