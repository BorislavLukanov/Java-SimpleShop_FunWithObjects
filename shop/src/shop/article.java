package shop;

class article {
	int inStock;
	String Type_Of_Article = new String();
	int price;
	
    void PrintLS () {
    	System.out.println(Type_Of_Article + " | Price: " + price +" | In Stock: " + inStock);
    }
    
    void article(){
    	inStock = 0;
    	Type_Of_Article = "";
    	price = 0;
    }

}
