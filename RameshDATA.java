import java.util.Scanner;

public class RameshDATA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double bs, da, hra, gs;
		Scanner in = new Scanner (System.in);
		System.out.print("Enter Basic Pay: ");
		bs = in.nextInt();
		da = (0.40) * bs;
		hra = (0.20) * bs;
		gs = bs + da + hra;
		System.out.print("Ramesh's Total Salary: " + gs);
		

	}

}

