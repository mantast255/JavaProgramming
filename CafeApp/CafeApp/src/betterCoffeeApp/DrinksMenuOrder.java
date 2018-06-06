package betterCoffeeApp;

import java.util.Scanner;

public class DrinksMenuOrder {
	

	public static void serveDrinksMenu(Client client) {
		System.out.println("Please Choose from the Drinks Menu (Choose by entering number): \n");

		for (DrinkMenu.DrinkType type : DrinkMenu.DrinkType.values()) {
			System.out.println(type.getDisplayableOrderingNumber() + "   " +  type.getDisplayableType());
		}

		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			String ivestaReiksme = sc.nextLine();

			if (ivestaReiksme.equals("exit")) {
				break;
			}
			
			Integer skaicius = Integer.parseInt(ivestaReiksme);
			System.out.println("\n");
			System.out.println("Chooose from the list by entering number: ");
			for (DrinkMenu.Drink drink : DrinkMenu.Drink.values()) {
				if (drink.getDisplayableOrderingNumber() == skaicius) {
					System.out.println(drink.getDrinkNumber() + "   " + drink.getLabel() + "   Price: " + drink.getPrice());
					}
				}
			
			String naujasSK = sc.nextLine();
			Integer naujas1 = Integer.parseInt(naujasSK);
			System.out.println(naujas1);
			
			
			for (DrinkMenu.Drink drink : DrinkMenu.Drink.values()) {
				if(drink.getDrinkNumber() == naujas1 && drink.getDisplayableOrderingNumber() == skaicius) {
					System.out.println("You have chosen: " + drink.getLabel() +  " for " + drink.getPrice() + " euros" );
					client.setCertainDrink(drink);
				}
			}
			break;
		}
	}
	
}
