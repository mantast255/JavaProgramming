package betterCoffeeApp;

import java.util.Scanner;

public class Bill {

	public static void getBillForClient(Client client) {
		
		Double billForDrinks = 0.0;
		Double billForDishes = 0.0;
		Double total=0.0;
		
		System.out.println("Your table Number: " + " " + client.getTableNr()+"\n");
		System.out.println("------------------------------------------------------");
		
		
		for(DrinkMenu.Drink drink: client.getDrinks()) {
			System.out.println(drink.getLabel() + "       Price: " + drink.getPrice() + " Euros");
			billForDrinks += drink.getPrice();
		}
		
		for(DishMenu.Dish dish: client.getDishes()) {
			System.out.println(dish.getLabel() + "       Price: " + dish.getPrice() + " Euros");
			billForDishes += dish.getPrice();
		}
		
		total = billForDrinks + billForDishes;
		
		System.out.println("------------------------------------------------------");
		System.out.println("Amount to pay: \t" + total + " euros");
		
		
	}
}
