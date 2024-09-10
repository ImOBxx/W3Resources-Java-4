import java.util.Scanner;

public class SumOfOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int a, i, n, sum = 0;
		System.out.println("Enter The Nth term: ");
		n = in.nextInt();
		System.out.println("\n");
		for (i = 1; i <= n; i++)
		{
			System.out.println(i);
			sum = sum + i;
		}
		System.out.println("\n");
		System.out.println("Sum: " + sum);
		System.out.println("\n");

	}

}
