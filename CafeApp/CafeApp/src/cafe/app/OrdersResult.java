package cafe.app;

import java.util.Arrays;
import java.util.List;

public class OrdersResult {

	public static void main(String[] args) {

		List<Table> tables = Arrays.asList(
				new Table(1, 
					Arrays.asList(
						new Client(
								Arrays.asList(
										new Drink("Coca-cola", 2.5, 1),
										new Dish("Club Sandwich", 7.5, 2)
										)
								),
						new Client(
								Arrays.asList(
										new Drink("Tea", 1.5, 1),
										new Dish("Croissant", 5.0, 1)
										)
								)
							)),
				new Table(4,
					Arrays.asList(
						new Client(
							Arrays.asList(
								new Drink("Coca-cola", 2.5, 1),
								new Dish("Club Sandwich", 7.5, 2), 
								new Drink("Coffee", 2.0, 1)
										)
								),
						new Client(
								Arrays.asList(
										new Drink("Sprite", 2.5, 1),
										new Dish("Scrambled Eggs", 9.0, 1), 
										new Drink("Coffee", 2.0, 1))
								),
						new Client(
								Arrays.asList(
										new Dish("English Breakfast", 12.0, 1), 
										new Drink("Tea", 2.0, 1))
								)
						)),
				new Table(2,
					Arrays.asList(
						new Client(
								Arrays.asList(
										new Drink("Coca-cola", 2.5, 1),
										new Dish("Club Sandwich", 7.5, 2), 
										new Drink("Coffee", 2.0, 2)
										)
								)
						)),
				new Table(3, 
					Arrays.asList(
						new Client(
								Arrays.asList(
										new Drink("Coca-cola", 2.5, 1),
										new Dish("Club Sandwich", 7.5, 3), 
										new Drink("Coffee", 2.0, 1)
										)
								)
						)
				));
		
		for(Table table : tables) {
			table.printTableNumber();
			
			table.printOrderAndBillForTable();
			
//			Double bill = 0.0;
//			for(Client c: table.getTableClientList()) {
//				c.getOrderList();
//				bill += c.getBillForOrder();
//			}
//			System.out.println("------------------------------------------------\nBill for the Table: " + bill + " Euros");
			
		}
		
		List<Table> tables2 = Arrays.asList(
				new Table(1, new Client(
									Arrays.asList(
											new Drink("Coca-cola", 2.5, 1),
											new Dish("Club Sandwich", 7.5, 2)
											))),
				new Table(4, new Client(
								Arrays.asList(
									new Drink("Coca-cola", 2.5, 1),
									new Dish("Club Sandwich", 7.5, 2), 
									new Drink("Coffee", 2.0, 1)
											))),
					new Table(2, new Client(
									Arrays.asList(
											new Drink("Coca-cola", 2.5, 1),
											new Dish("Club Sandwich", 7.5, 2), 
											new Drink("Coffee", 2.0, 2)
											))),
					new Table(3, 
							new Client(
									Arrays.asList(
											new Drink("Coca-cola", 2.5, 1),
											new Dish("Club Sandwich", 7.5, 3), 
											new Drink("Coffee", 2.0, 1)
											)))
				);
				
//				for(Table table : tables2) {
//					table.printTableNumber();
//					table.getClient().getOrderList();
//					
//				}
		
		System.out.println(DrinkMenu.Coffees.LATTE + " " +  DrinkMenu.Coffees.LATTE.values());
		
	}

}
