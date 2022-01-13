package record;

import java.util.Scanner;

public class InvioceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		Invoice invoice = new Invoice();

		System.out.print("\nEnter part number :");

		invoice.setPartNumber(sc.nextLine());

		System.out.print("Enter part description :");

		invoice.setPartDescription(sc.nextLine());

		System.out.print("Enter no. of items purchased :");

		invoice.setItemPurchased(sc.nextInt());

		System.out.print("Enter price per item :");

		invoice.setPricePerItem(sc.nextDouble());

		System.out.print("\n\nDetail of items purchasing–>");

		System.out.print("\nPart number :" + invoice.getPartNumber());

		System.out.print("\nPart description :" + invoice.getPartDescription());

		System.out.print("\nTotal Billing Amount :" + invoice.getInvoiceAmount());

	}

}
