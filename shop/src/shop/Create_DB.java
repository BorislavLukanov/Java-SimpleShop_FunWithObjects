package shop;
import java.io.*;
public class Create_DB {

	void savePayment(payment Card) throws IOException {
		
		//save the payment data into .txt
		System.out.println("Saving on file the payment");
		FileWriter write1 = new FileWriter("C:\\Users\\usr\\eclipse-workspace1\\shop\\DB\\cards used\\payment1.txt"); 
		write1.write(Card.Card_Holder +"\n"+ Card.CVV +"\n" +Card.exp );
		write1.close();
		//here the number in the name of the file created should increment by 1 on every purchase to create a DB for a production app.
	
	}
	void saveOrder(article[] order) throws IOException {
		
		//save the selected items on .txt
		System.out.println("Saving on file the items.");
		FileWriter write2 = new FileWriter("C:\\Users\\usr\\eclipse-workspace1\\shop\\DB\\items ordered\\ordered1.txt"); 
		write2.write("Item 1: " +order[0].Type_Of_Article);
		write2.write("\nItem 1, in stock: " +order[0].inStock);
		write2.write("\nItem 1, price: " +order[0].price);
		write2.write("\nItem 2: " +order[1].Type_Of_Article);
		write2.write("\nItem 2, in stock: " +order[1].inStock);
		write2.write("\nItem 2, price: " +order[1].price);
		write2.close();
		//here the number in the name of the file created should increment by 1 on every purchase to create a DB for a production app.
	}
	
	
}

