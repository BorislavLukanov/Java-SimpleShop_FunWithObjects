package shop;
import java.util.Scanner;
class payment {

	String Card_Holder = new String();
	int CVV;
	int exp;
	
	void TakeCardData(boolean in) {
		if (in) 
		{	
		Scanner Input = new Scanner(System.in);
		System.out.println("Card holder name:");
		Card_Holder = Input.nextLine();
		System.out.println("CVV code:");
		CVV = Input.nextInt();
		System.out.println("Expires:");
		exp = Input.nextInt();
		}
		//else Honeypot.EntersInHoneypot();
	}
}
