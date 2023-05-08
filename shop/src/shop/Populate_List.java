package shop;
/*
 * This can be modified to querying relational DB on local directory or server and pass the
 * data into the variables.
 * See Interfaces.
 */
class Populate_List {
	void PopList(article[] aList) {
		aList[0].Type_Of_Article = "n.0 Food - chicken";
		aList[0].price = 5;
		aList[0].inStock = 2;
		aList[1].Type_Of_Article = "n.1 Kitchen - oven";
		aList[1].price = 7;
		aList[1].inStock = 3;	
		aList[2].Type_Of_Article = "n.2 Car - Pickup";
		aList[2].price = 9;
		aList[2].inStock = 4;
	}
	/*
	 * void PopList2(article[] bList) {
		bList[0].Type_Of_Article = "n.0 Food - chicken";
		bList[0].price = 2.5;
		bList[0].inStock = 2;
		bList[1].Type_Of_Article = "n.1 Kitchen - oven";
		bList[1].price = 1.5;
		bList[1].inStock = 3;	
		bList[2].Type_Of_Article = "n.2 Car - Pickup";
		bList[2].price = 3.5;
		bList[2].inStock = 4;
	}
	 */ //option to populate 2nd list - check in main.java

}
