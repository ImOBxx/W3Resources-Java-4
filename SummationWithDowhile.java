
public class SummationWithDowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 21;
		int sum = 0;
		do {
			sum += x;
			x--;
		}
		while (x > 10);
		System.out.println("Summation: " + sum);

	}

}
