import java.util.Scanner;

public class switch4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number;
		System.out.println("Enter Number: ");
		number = in.nextInt();
		switch (number % 2)
		{
		case 0:
			System.out.println("This is a Even Number");
			break;
		case 1:
			System.out.println("This is a Odd Number");
			break;
			
		}
		

	}

}
