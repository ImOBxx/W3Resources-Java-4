import java.util.Scanner;

public class switch6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		char op;
		double n1, n2, res;
		System.out.println("Simple Calculator");
		System.out.println("+, -, *, / or %");
        System.out.println("Choose an Operator: ");
        op = in.next().charAt(0);
        System.out.println("Enter the 1st Number: ");
        n1 = in.nextDouble();
        System.out.println("Enter the 2nd Number: ");
        n2 = in.nextDouble();
        switch(op)
        {
        case '+':
        	res = n1 + n2;
        	System.out.println(n1 + " + " + n2 + " = " + res);
        	break;
        case '-':
        	res = n1 - n2;
        	System.out.println(n1 + " - " + n2 + " = " + res);
        	break;
        case '*':
        	res = n1 * n2;
        	System.out.println(n1 + " * " + n2 + " = " + res);
        	break;
        case '/':
        	res = n1 / n2;
        	System.out.println(n1 + " / " + n2 + " = " + res);
        	break;
        case '%':
        	res = n1 % n2;
        	System.out.println(n1 + " % " + n2 + " = " + res);
        	break;
        	default:
        		System.out.println("Invalid Operator");
        		break;
        		
        }
        
	}

}
