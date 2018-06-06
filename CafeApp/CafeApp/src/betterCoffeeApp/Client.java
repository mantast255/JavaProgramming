package betterCoffeeApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import betterCoffeeApp.DishMenu.Dish;
import betterCoffeeApp.DrinkMenu.Drink;


public class Client {

	
	private List<Drink> drinks;
	private List<Dish> dishes;
	private Drink certainDrink;
	private int tableNr;
	
	
	public Client(int tableNr, List<Drink>  drinks, List<Dish> dishes) {
		this.tableNr = tableNr;
		this.drinks = drinks;
		this.dishes = dishes;
	}
	
	
	public int getTableNr() {
		return tableNr;
	}
	

	@Override
	public String toString() {
		return "Client [drinks=" + drinks + ", dishes=" + dishes + ", table=" + tableNr + "]";
	}


	public List<Drink> getDrinks() {
		return drinks;
	}

	public void setDrinks(List<Drink> drinks) {
		this.drinks = drinks;
	}

	public List<Dish> getDishes() {
		return dishes;
	}

	public void setDishes(List<Dish> dishes) {
		this.dishes = dishes;
	}
	
	public void setCertainDrink(Drink drink) {
		drinks.add(drink);
	}
	
	public void setCertainDish(Dish dish) {
		dishes.add(dish);
	}
	
	

	
	
	
	
}
