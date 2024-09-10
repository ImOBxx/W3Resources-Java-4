import java.util.Scanner;

public class switch5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int mon = 0;
		int days;
		System.out.println("Enter The Month Number: ");
		mon = in.nextInt();
		switch(mon)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31 days");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30 days");
			break;
		case 2:
			days = 28;
		default:
			System.out.println("Invalid Input");
			break;
			
			
			
		
		}

	}

}
