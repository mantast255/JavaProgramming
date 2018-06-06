package betterCoffeeApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class Application {

	public static void main(String[] args) {
		
		List<Client> ourClients = new ArrayList<>();
		List<Integer> tables2 = new CopyOnWriteArrayList<>(); // pakeisti
		for (int i = 1; i < 4; i++) {
			tables2.add(i);
		}

		System.out.println("All the tables:");

		for (Integer t : tables2) {
			System.out.print(t + " ");
		}

		//Main choices
		System.out.println("\n\nPlease choose the options: \n\n" + "1 \tWould you like to sit at a table ?\n"
				+ "2 \tWould you like to get a receipt?\n" + "3 \tSee all Clients");
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			Integer decision = Integer.parseInt(sc.nextLine());
			
			if (decision == 1) {
				if (tables2.size() == 0) {
					System.out.println("Sorry, all tables are occupied right now. You will have to wait");
					getMainOptions();
					
				} else {
				//int rnb = new Random().nextInt(tables2.size());
				System.out.println("Choose Table:\n");
				for (Integer t : tables2) {
					System.out.println("Nr. " + t);
				}
				Integer rnb = Integer.parseInt(sc.nextLine());
				Client certainClient = new Client(rnb, new ArrayList<>(), new ArrayList<>());
				
				System.out.println("Your Table Number is : " + certainClient.getTableNr());
				
				for(Integer t : tables2) {
					if(t == certainClient.getTableNr()) {
						tables2.remove(t);
					}
				}
				
				for(Integer t : tables2) {
					System.out.println(t + " ");
				}
				
				Order.getOrder(tables2, ourClients, certainClient);
				}
			}

			if (decision == 2) {
				ClientsWhoDidntPayYet(ourClients);
				//Bill.getBillForClient(certainClient);
				System.out.println("\nPlease choose the table, which you sit at: ");
				for(Client client: ourClients) {
					System.out.println(client.getTableNr() + " ");
				}
				Integer tableSelection = Integer.parseInt(sc.nextLine());
				
				for(Client client: ourClients) {
					if(client.getTableNr() == tableSelection) {
						Bill.getBillForClient(client);
					//	tables2.add(client.getTableNr()-1, client.getTableNr());
					}
				}
				getMainOptions();
			}
			
			if(decision == 3) {
				ClientsWhoDidntPayYet(ourClients);
				System.out.println("\n\n");
				getMainOptions();
			}
		}
	}
	
	//helper methods
	public static void ClientsWhoDidntPayYet(List<Client> ourClients) {
		for(Client client: ourClients) {
			System.out.println(client);
		}
	}
	
	public static void incorrectInputString(String input,Scanner sc) {
		System.err.println("Mistake, please try again");
		String mistakeCorrection = sc.nextLine().toUpperCase();
		input = mistakeCorrection;
		System.out.println(input);
	}
	
	public static void getMainOptions() {
		System.out.println("\nPlease choose the options: \n\n" + "1 \tWould you like to sit at a table ?\n"
				+ "2 \tWould you like to get a receipt?\n" + "3 \tSee all Clients");
	}
	
}
