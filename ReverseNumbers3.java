import java.util.Scanner;

public class ReverseNumbers3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			float r = 0, sum = 0, x;
			try (Scanner in = new Scanner (System.in)) {
				System.out.println("Enter Number: ");
				x = in.nextFloat();
			}
			while (x > 0);
			{
				r = x % 10;
				sum = (sum * 10) + r;
				x = x / 10;
			
			
			System.out.println("Reversed Digits: " + sum);
			}

		}

	


	}


