import java.util.Scanner;

public class switch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		char gender;
		System.out.println("Enter Sex (M/F): ");
		gender = in.next().charAt(0);
		switch (gender)
		{
		case 'M':
		case 'm':
			System.out.println("Male");
			break;
		case 'F':
		case 'f':
			System.out.println("Female");
			break;
		default: 
			System.out.println("Invalid Input. Try again");
			break;
		}
			
			
			

	}

}
