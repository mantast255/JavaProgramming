package cafe.app;

public class Order {

	private String name;
	private Double price;
	private Integer nrP;
	private Double sumForTable;
	
	public Order(String name, Double price, Integer nrP) {
		this.name = name;
		this.price = price;
		this.nrP = nrP;
	}
	
	public String getName() {
		return name;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public  Double getOrderAmount() {
		return price*nrP;
	}
	
	public Double getSumForTable() {
		return sumForTable += price*nrP;
	}
	
	public Integer getNumber() {
		return nrP;
	}
}
