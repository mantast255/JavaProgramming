package cafe.app;


public enum DrinkMenu {
	
	LABAS;
	
	enum Coffees {
		
		LATTE(2.0),
		ESPRESSO(1.5);
		
		private Double price;
		
		Coffees(Double price) {
			this.price = price;
		}
		
		public Double getCoffeePrice() {
			return price;
		}
	}
	
}
