import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int a, r = 0, sum = 0;
		System.out.println("Enter Five Digit Number: ");
		a = in.nextInt();
		while (a > 0)
		{
			r = a % 10;
			sum = (sum * 10) + r;
			a = a / 10;
        }
		System.out.println("Reversed Figure: " + sum);

	}

}
