package shop;
import java.io.IOException;
import java.util.Scanner;

class authenticate {
	void askCredentials() throws IOException {
		boolean Auth;
		Scanner Input = new Scanner(System.in);
		String Username, Password;
		System.out.println("Insert Username:");
		Username = Input.nextLine();
		System.out.println("Insert password:");
		Password = Input.nextLine();
		if(Username.contentEquals("user1")&&Password.contentEquals("123"))
		{
			System.out.println("Authenticated.");
			Auth = true;
			
			lists mainList = new lists();
			mainList.printList(Auth);
			mainList.AskSelection(Auth);
		
			order PlaceOrder = new order();
			PlaceOrder.ConfirmOrder(Auth);
		}
		
	}

}
