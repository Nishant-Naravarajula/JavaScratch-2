/**
 * Write a program that reads a positive integer, n, from the user and then displays the sum 
of all of the integers from 1 to n. The sum of the first n positive integers can be computed 
using the formula: sum = (n)(n + 1)/2
 */

package HelloWorld;
import java.util.*;

public class NpositiveIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Integer :");
		int num = sc.nextInt();
		double sum = ((num)*(num + 1)) /2;
		System.out.println("The sum of first n integers are : " + sum);
	}
}
