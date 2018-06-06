package betterCoffeeApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Order {

	public static void getOrder(List<Integer> tables2, List<Client> ourClients, Client certainClient) {
		
		System.out.println("Would you like to order?\nYes \t No");
		
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			String sittingAtTheTable = sc.nextLine().toUpperCase();
			
			
			while(!sittingAtTheTable.equals("NO") && !sittingAtTheTable.equals("YES")) {
				System.out.println("Mistake, please try again\n");
				System.out.println("Would you like to order?\nYes \t No");
				String mistakeCorrection = sc.nextLine().toUpperCase();
				sittingAtTheTable = mistakeCorrection;
				
				
			}
				
			if (sittingAtTheTable.equals("NO")) {
				System.out.println("Thank you, i hope you'll visit us again soon.");
				tables2.add(certainClient.getTableNr()-1, certainClient.getTableNr());
				Application.getMainOptions();
				break;
				
			}

			if (sittingAtTheTable.equals("YES")) {
				
					System.out.println(certainClient);
					for (Integer i : tables2) {
						System.out.print(i + " ");
					}

					System.out.println("\n Would you like order food or drinks ? \n Food \t Drinks");
					String firstChoice = sc.nextLine().toUpperCase();

					while (!firstChoice.equals("FOOD") && !firstChoice.equals("DRINKS")) {
						System.err.println("Mistake, please try again");
						System.out.println("\n Would you like order some food or drinks ? \n Food \t Drinks");
						String mistakeCorrection = sc.nextLine().toUpperCase();
						firstChoice = mistakeCorrection;
						System.out.println(firstChoice);
					}

					// Choosing Food menu:
					if (firstChoice.equals("FOOD")) {
						DishesMenuOrder.serveDishMenu(certainClient);
						reOrderingAndPayingThebill(certainClient,ourClients);
						//System.out.println(certainClient);
					}

					// Choosing Drinks menu:
					if (firstChoice.equals("DRINKS")) {
						DrinksMenuOrder.serveDrinksMenu(certainClient);
						reOrderingAndPayingThebill(certainClient, ourClients);
						//System.out.println(certainClient);
					}
					ourClients.add(certainClient);
			
			}
			break;
			//allClients(ourClients);
		}
	}
	
	
	public static void reOrderingAndPayingThebill(Client client, List<Client> ourClients) {
		System.out.println("\n Would you like to order something else?\n Yes \t No");
		Scanner sc = new Scanner(System.in);
		String choice = sc.nextLine().toUpperCase();
		 //System.out.println(choice);
		if(!choice.equals("NO")) {
		
			System.out.println("\n Would you like order more food or drinks ? \n Food \t Drinks");
			String foodOrDrinks = sc.nextLine().toUpperCase();
			// System.out.println(foodOrDrinks);
			if (foodOrDrinks.equals("FOOD")) {
				DishesMenuOrder.serveDishMenu(client);
				reOrderingAndPayingThebill(client, ourClients);
			}
			if (foodOrDrinks.equals("DRINKS")) {
				DrinksMenuOrder.serveDrinksMenu(client);
				reOrderingAndPayingThebill(client, ourClients);
			} 
		}
		if(choice.equals("NO")) {
			System.out.println("Would you like to get a Bill now? (Choose by entering a number)\n 1: Yes \t 2: No, Later");
			String toPay = sc.nextLine();
			Integer toPayNr = Integer.parseInt(toPay);
			if(toPayNr == 1) {
				Bill.getBillForClient(client);
				ourClients.remove(client);
				
			}
			if(toPayNr == 2) {
				System.out.println("\n\n\n\n");
				Application.getMainOptions();
			}
		}
	}
}
