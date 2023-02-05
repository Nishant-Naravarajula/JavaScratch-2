package HelloWorld;
import java.util.*;

public class BottleDeposits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float refund = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of bottles : ");
		int count = sc.nextInt();
		int [] arr = new int[count];
		for(int i = 0 ; i < count ; i++) {
			arr[i]=sc.nextInt();
		}
		for(int i:arr) {
			if( i <= 1) {
				refund += 0.10;
			}
			else{
				refund += 0.25;
			}
		}
		System.out.println("The remaining change is : " + refund + "$");		
	}
}