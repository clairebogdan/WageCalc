
//Calculate your wage before taxes by month, day, hour, etc!

import java.util.Scanner;

public class WageCalc {
	

	public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Hello! Enter your yearly income before taxes");
	double income = scan.nextDouble();
	
	 
	
	System.out.println("Assuming you work 5 days a week for 40 hours a week for 52 weeks a year...");
	System.out.println("You make " + (income / 12) + " each month");
	System.out.println("You make " + (income / 26) + " biweekly");
	System.out.println("You make $" + (income / 52) + " each week");
	System.out.println("You make $" + (income / 260) + " each day");
	System.out.println("You make $" + (income / 2080) + " each hour");
	System.out.println("You make $" + (income / 124800) + " each minute");
	System.out.println("You make $" + (income / 7488000) + " each second"); 
	
}
}
