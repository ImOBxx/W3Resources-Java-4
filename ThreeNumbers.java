import java.util.Scanner;

public class ThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		Scanner in = new Scanner (System.in);
		System.out.println("Enter A: ");
		a = in.nextInt();
		System.out.println("Enter B: ");
		b = in.nextInt();
		System.out.println("Enter C: ");
		c = in.nextInt();
		if (a == b && a == c && b == c)
		{
			System.out.println("All Are Equal. ");
		}
		else if (a != b && b != c && c != a)
		{
			System.out.println("All Are Different. ");
		}
		else
		{
			System.out.println("All Numbers Are Not Equal.");
		}
		

	}

}
