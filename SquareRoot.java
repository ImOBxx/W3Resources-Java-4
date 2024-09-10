import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		double a, squareRoot;
		System.out.println("Enter Number: ");
		a = in.nextDouble();
		squareRoot = Math.sqrt(a);
		squareRoot = Math.round(squareRoot * 100.0);
		System.out.println(squareRoot);
		
				

	}

}
