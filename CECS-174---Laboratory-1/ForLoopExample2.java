import java.text.*;
public class ForLoopExample2{
public static void main(String[] args){
  int i;
  int sum=0;
  for(i=1;i<=20;i=i+1){
   System.out.println(i);
   sum=sum+i;
  }
  System.out.println("The sum of all twenty numebers is: "+sum);
  }
 }
