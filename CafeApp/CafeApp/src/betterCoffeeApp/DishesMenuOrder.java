package betterCoffeeApp;

import java.util.Scanner;

import betterCoffeeApp.DrinkMenu.DrinkTypeInterface;

public class DishesMenuOrder {

	public static void serveDishMenu(Client client) {
		System.out.println("Please Choose from the Drinks Menu (Choose by entering number): \n");

		for (DrinkTypeInterface type : DishMenu.DishType.values()) {
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
			for (DishMenu.Dish dish : DishMenu.Dish.values()) {
				if (dish.getDisplayableOrderingNumber() == skaicius) {
					System.out.println(dish.getDishNumber() + "   " + dish.getLabel() + "   Price: " + dish.getPrice());
					}
				}
			
			String naujasSK = sc.nextLine();
			Integer naujas1 = Integer.parseInt(naujasSK);
			//System.out.println(naujas1);
			
			for (DishMenu.Dish dish : DishMenu.Dish.values()) {
				if(dish.getDishNumber() == naujas1 && dish.getDisplayableOrderingNumber() == skaicius) {
					System.out.println("You have chosen: " + dish.getLabel() +  " for " + dish.getPrice() + " euros" );
					client.setCertainDish(dish);
				}
			}
			break;
		}
	}
}
