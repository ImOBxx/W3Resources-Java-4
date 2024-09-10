import java.util.Scanner;

public class switch3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner in = new Scanner(System.in);
		char ch;
		System.out.println("Eneter a Character : ");
		ch = in.next().charAt(0);
		if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
{
	switch (ch)
	{
	case 'A' : 
	case 'E' :
	case 'I' :
	case 'O' :
	case 'U' :
	case 'a' :
	case 'e' :
	case 'i' :
	case 'o' :
	case 'u' :
		System.out.println("This is a Vowel");
		break;
		default:
			System.out.println("This is a Consonant");
			break;
	}
}
	else {
		System.out.println("This is not an Alphabet");
	

	}
	
	}
	
}

		

	


