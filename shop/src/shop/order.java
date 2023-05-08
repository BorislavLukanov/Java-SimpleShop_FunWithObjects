package shop;
import java.io.IOException;
import java.util.Scanner;
public class order {
	void ConfirmOrder(boolean in) throws IOException{
		if (in) 
		{
		Scanner Input = new Scanner(System.in);
		System.out.println("Do you confirm the order?");
		System.out.println("Type Yes or No.");
		String str = Input.nextLine();
		if (str.contentEquals("Yes")) {
			System.out.println("Insert Payment:");
			payment card = new payment();
			card.TakeCardData(in);
			//void check if the payment is valid
			Create_DB save = new Create_DB();
			lists currentList = new lists();
			save.savePayment(card);
			}
		
		if (str.contentEquals("No" )) {
			System.out.println("\nThank you! Come back soon! :)");
			}
		}
		//else {System.out.println("Type Yes or No.");}
		
	}

}
