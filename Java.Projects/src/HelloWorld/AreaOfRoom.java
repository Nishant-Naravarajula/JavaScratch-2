package HelloWorld;
import java.util.*;

public class AreaOfRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first dimension : ");
		Float a = sc.nextFloat();
		System.out.println("Enter second dimension : ");
		Float b = sc.nextFloat();
		Float res = a*b;
		System.out.println("Area of the room is : " +res+ " metres");
	}

}
