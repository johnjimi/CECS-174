import java.text.*;
import java.util.Random;// generator
public class OddEvenOrZero {
	public static void main(String args[]){
	int i;//counter for "for" loop
	int num;
Random rand = new Random();//
		for(i=1;i<=20;i++){
		System.out.print(i+".  ");
		num=rand.nextInt(21);//w
		 if(num==0)
		  System.out.println(num+" is Zero");
		 else if (num%2==0)
		 System.out.println(num+" is Even");
		 else
		 System.out.println(num+" is Odd");
		  }}}

