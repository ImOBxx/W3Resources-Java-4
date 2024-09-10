import java.util.Scanner;

public class SwapVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n");
        Scanner in = new Scanner (System.in);
        int a, b, temp;
        System.out.println("Enter A: ");
        a = in.nextInt();
        System.out.println("Enter B: ");
        b = in.nextInt();
        temp = a;
        a = b;
        b = temp;
        System.out.println("A: " + a);
        System.out.println("B: " + b);
	}

}
