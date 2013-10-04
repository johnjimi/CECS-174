import java.text.*;
public class YearsToSpend {
	public static void main(String[] args) {
		NumberFormat money = NumberFormat.getCurrencyInstance();
		double amountNow=255500.50;
		double takeAwayEachYr=12460.25;
		int year=0;
		System.out.println("Starting with "+money.format(amountNow));
		System.out.println(", it will last, taking away "+ money.format(takeAwayEachYr)+" each year.");
			while (amountNow>=0.0){
				System.out.println("Year#"+year+"\t"+money.format(amountNow));
				year++;
				amountNow=amountNow-takeAwayEachYr;
				}
	}
}
