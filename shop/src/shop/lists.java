package shop;
import java.io.IOException;
/*
 * Here could be defined BList for List2 etc to be populated with bList data or other type of data etc.
 */
import java.util.Scanner;

class lists {
	int n=3, i;
	article[] AList = new article[n];{
	for (i=0; i<n; i++){
		AList[i] = new article();
	}{
	Populate_List List1 = new Populate_List();
	List1.PopList(AList);

}}

void printList(boolean in) {
	Honeypot honey = new Honeypot();
	if (in) {
		for(i=0; i<n; i++)
			AList[i].PrintLS();	
	}
	else honey.EntersInHoneypot();}


void AskSelection(boolean in) throws IOException {
		if (in) {
		int first, second;
		Scanner sc = new Scanner(System.in);
		System.out.print("Select fists using 0 1 or 2 : ");
		first = sc.nextInt();
		System.out.print("Select second using 0 1 or 2 : ");
		second = sc.nextInt();
		System.out.print("You selected " +first);
		System.out.println( " and " +second);
		selectedList saveList = new selectedList();
		saveList.list1(first, second); 
		Create_DB saveOrder = new Create_DB();
		saveOrder.saveOrder(saveList.selectedList);; //so far so good
		}
	}	

}
