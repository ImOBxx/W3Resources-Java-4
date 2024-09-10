import java.util.Scanner;

public class SumOfDigits3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int n, r, sum = 0;
		System.out.println("Enter Number: ");
		n = in.nextInt();
		while (n > 0)
		{
			r = n % 10;
			sum = sum + r;
			n = n / 10;
		}
		System.out.println("Sum Of Digits: " + sum);

		
		
			
	}

}
