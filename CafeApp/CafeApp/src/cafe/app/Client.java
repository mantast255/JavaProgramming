package cafe.app;

import java.util.List;

public class Client {

	private List<Order> orderList;
	private Table table;
	private List<Client> clientsList;
	
	public Client(List<Order> orderList) {
		this.orderList = orderList;
	}
	
	public void getOrderList() {
		Double suma = 0.0;
		for(Order o : orderList) {
			if(o instanceof Drink) {
				System.out.println("Drink: " + o.getName() + "\tAmount: " + o.getNumber() + "\tPrice: " + o.getPrice() + " Euros"); 
			}
			if (o instanceof Dish) {
				System.out.println("Dish: " + o.getName() + "\tAmount: " + o.getNumber() + "\tPrice: " + o.getPrice() + " Euros"); 
			}
		}
	}
	
	public Double getBillForOrder() {
		Double billOrder = 0.0;
		for(Order o : orderList) {
			billOrder += o.getOrderAmount();
		}
		 return billOrder;
	}
}
	
	
	
	

	
