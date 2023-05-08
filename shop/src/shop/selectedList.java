package shop;

class selectedList extends lists{
	article[] selectedList = new article[2];{
	for (int i = 0; i<2; i++) {
		selectedList[i] = new article();}
	}
	void list1 (int a, int b){
	
		selectedList[0] = AList[a];
		selectedList[1] = AList[b];
	}

}
