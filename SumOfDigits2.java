import java.util.Scanner;

public class SumOfDigits2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int a, r, sum = 0;
		System.out.println("Enter Five Digit Number: ");
		a = in.nextInt();
		while (a > 0)
		{
			r = a % 10;
			sum = sum + r;
			a = a / 10;
        }
		System.out.println("Sum of Digits: " + sum);
		


	}

}
