package betterCoffeeApp;

public final class DrinkMenu {

	public interface DrinkTypeInterface {
		String getDisplayableType();
		int getDisplayableOrderingNumber();
	}

	public enum DrinkType implements DrinkTypeInterface {

		COFFEE(1, "Coffee"), TEA(2, "Tea"), SOFT_DRINKS(3, "Soft Drinks");

		private final String type;
		private final int orderingNumber;

		private DrinkType(final int orderingNumber, final String type) {
			this.type = type;
			this.orderingNumber = orderingNumber;
		}
		
		@Override
		public String getDisplayableType() {
			return type;
		}

		@Override
		public int getDisplayableOrderingNumber() {
			return orderingNumber;
		}
	}

	public static enum Drink implements DrinkTypeInterface {

		LATTE(1, "Latte", DrinkType.COFFEE, 3.5), 
		ESPRESSO(2, "Espresso", DrinkType.COFFEE, 2.5), 
		MINT_TEA(1, "Mint Tea", DrinkType.TEA, 1.5), 
		HERBAL_TEA(2, "Herbal Tea", DrinkType.TEA, 2.0), 
		EARL_GREY(3, "Earl Grey Tea", DrinkType.TEA, 2.0), 
		COCA_COLA(1, "Coca-Cola", DrinkType.SOFT_DRINKS, 2.0), 
		FANTA(2, "Fanta", DrinkType.SOFT_DRINKS, 3.0), 
		SPRITE(3, "Sprite", DrinkType.SOFT_DRINKS, 4.0);

		private final String label;
		private final DrinkType type;
		private final Double price;
		private final Integer drinkNumber;

		private Drink(Integer drinkNumber, String label, DrinkType type, Double price) {
			this.drinkNumber = drinkNumber;
			this.label = label;
			this.type = type;
			this.price = price;
		}

		public String getDisplayableType() {
			return type.getDisplayableType();
		}
		
		public int getDrinkNumber() {
			return drinkNumber;
		}
		
		public String getLabel() {
			return label;
		}

		public Double getPrice() {
			return price;
		}

		@Override
		public int getDisplayableOrderingNumber() {
			return type.getDisplayableOrderingNumber();
		}

	}

}
