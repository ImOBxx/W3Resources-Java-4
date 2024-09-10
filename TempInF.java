import java.util.Scanner;

public class TempInF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f, c;
		Scanner in = new Scanner (System.in);
		System.out.print("Enter Farenheit: ");
		f = in.nextInt();
		c = ((f - 32) * 5) / 9;
		System.out.println("Tempeature In Centigrade: " + c);
		
		

	}

}
