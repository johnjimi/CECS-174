//Assignment Problem 6, with functions version 2 bby
import java.util.Arrays.*;//for length
public class StatsV2 
{
	public static void main(String[] args)
	{
		double mean,variance,std;
		int[] score = new int[1000];
		int sum = 0;
		double sum2 = 0.0;
		fillArray(score);
		sum =sumArray(score);
		mean = sum/(score.length*1.0);
		sum2= sum2array(score, mean);
		variance =sum2/(score.length-1.0);
				std=Math.sqrt(variance);
	}//end main
public static void fillArray(int[] score)
{
	for (int i= 0; i < score.length; i++)
		score[i]=60+(int)(Math.random()*40);
}
public static int sumArray(int[]score)
{
int result = 0;	
	for(int i = 0; i<score.length; i++)
		result =result+score[i];
	return result;
}
public static double sum2array(int[]score, double mean)
{
double result = 0.0;
for(int i = 0; i<score.length; i++)
	result=result+Math.pow(score[i]-mean,2);
	return result;
}
}
