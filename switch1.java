import java.util.Scanner;

public class switch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int daynum = 0;
		
		System.out.println("Enter Day of the Week: ");
		daynum = in.nextInt();
		switch (daynum)
		{
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;	
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Invalid Input, Choose between 0 and 6");
			
			break;	
		}
		

	}

}
