import java.util.Scanner;

public class whileLoop {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			while(n < 1 || n > 10) {
				System.out.print(n + " is not between 1 and 10. try again: ");
				n = sc.nextInt();
			}
			System.out.println(n + " is between 1 and 10.");
		}
		
			
		}

	}


