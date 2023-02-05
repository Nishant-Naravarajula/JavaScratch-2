/*
 *  The program that you create for this exercise will begin by reading the cost of a meal
ordered at a restaurant from the user. 
Then your program will compute the tax and tip for 
the meal.
 Use your local tax rate when computing the amount of tax owing. Compute the 
tip as 18 percent of the meal amount (without the tax). The output from your program 
should include the tax amount, the tip amount, and the grand total for the meal including 
both the tax and the tip. Format the output so that all of the values are displayed using 
two decimal places.
*/

package HelloWorld;
import java.util.*;

public class TaxAndTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double totalbill;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the bill amount : ");
		double bill = sc.nextFloat();
		double tax;
		tax = 0.18 * bill ;
		double tip = 0.18 * bill ;
		totalbill = bill + tax + tip ;
		System.out.println("The total bill of the food (Including tax & tip) is : " + totalbill + " Rs.");
	}

}