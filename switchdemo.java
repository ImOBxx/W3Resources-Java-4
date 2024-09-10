import java.util.Scanner;

public class switchdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter any month: ");
		int month=kb.nextInt();
		String name;
		
		switch (month) {
		case 1:
			name = "January";
			break;
		case 2:
			name = "Febuary";
			break;
		case 3:
			name = "March";
			break;
		case 4:
			name = "April";
			break;
		case 5:
			name = "May";
			break;
		case 6:
		    name = "June";
		    break;
		case 7:
			name = "July";
			break;
		case 8:
			name = "August";
			break;
		case 9:
			name = "September";
			break;
		case 10:
			name = "October";
			break;
		case 11:
			name = "November";
			break;
		case 12:
		    name = "December";
		    break;
		default:
			name = "invalid Input";
			break;
		}
		System.out.println(name);
    }
  }			



