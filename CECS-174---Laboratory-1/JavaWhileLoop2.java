import java.text.*;
 public class JavaWhileLoop2 {
  public static void main(String[] args){
   int count=1;
   int roll=(int)(Math.random()*20);//generate a random int. 0<20
   while(roll!=10){
    System.out.print("Roll = "+roll+"\n");
    roll=(int)(Math.random()*20);//get a new one
    count=count+1;
   }//end while loop
   System.out.println("Finally after "+count+" number of rolls"+ "\n"+"We got a 10!!");
  } // end main
}//end class
