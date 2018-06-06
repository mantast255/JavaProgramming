package cafe.app;

import java.util.List;

public class Table  {

	private int tableNumber;
	private  List<Client> clientsList;
	private Client client;
	private List<Order> orderList;

	public Table(int tableNumber) {
		if(tableNumber < 0 || tableNumber > 10) {
			throw new IllegalArgumentException("Table value must be between 1 and 10");
		} else {
			this.tableNumber = tableNumber;
		}
	}
	
	public Table(int tableNumber, List<Client> clientsList) {
		this.tableNumber = tableNumber;
		this.clientsList = clientsList;
	}
	
	public Table(int tableNumber, Client client) {
		this.tableNumber = tableNumber;
		this.client = client;
	}
	
	public int getTableNumber() {
		return tableNumber;
	}
	
	public void printTableNumber() {
		System.out.println("\n" + "Table NR.: \t" + tableNumber + "\n------------------------------------------------");
	}
	
	public List<Client> getTableClientList() {
		return clientsList;
	}
	
	public Client getClient() {
		return client;
	}

	public void printOrderAndBillForTable() {
		
		Double bill = 0.0;
		for(Client c: clientsList) {
			c.getOrderList(); //Client class
			bill += c.getBillForOrder(); //
		}
		System.out.println("------------------------------------------------\nBill for the Table NR. " + tableNumber +" : " + bill + " Euros");
	}

	
}
