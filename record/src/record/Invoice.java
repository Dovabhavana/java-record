package record;

public class Invoice {
	String partNumber;

	String partDescription;

	int itemPurchased;

	double pricePerItem;

	Invoice(){

	partNumber = "";

	partDescription = "";

	itemPurchased = 0;

	pricePerItem = 0.0;

	}

	String getPartNumber(){

	return partNumber;

	}

	String getPartDescription(){

	return partDescription;

	}

	int getItemPurchased(){

	return itemPurchased;

	}

	double getPricePerItem(){

	return pricePerItem;

	}

	double getInvoiceAmount(){

	return (itemPurchased * pricePerItem);

	}

	void setPartNumber(String pn){

	partNumber = pn;

	}

	void setPartDescription(String pd){

	partDescription = pd;

	}

	void setItemPurchased(int ip){

	itemPurchased = ip;

	}

	void setPricePerItem(double ppi){

	pricePerItem = ppi;

	}

}
