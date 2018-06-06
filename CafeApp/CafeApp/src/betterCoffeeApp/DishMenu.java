package betterCoffeeApp;

import betterCoffeeApp.DrinkMenu.DrinkTypeInterface;

public final class DishMenu {

	public interface DishTypeInterface {
        String getDisplayableType();
        int getDisplayableOrderingNumber();
    }
	
	public enum DishType implements DrinkTypeInterface {

	        HOTFOOD(1, "HotFood"), DESSERTS(2, "Desserts");
		
	        private final String type;
	        private final int orderingNumber;

	        private DishType(int orderingNumber, final String type) {
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
	
	public static enum Dish implements DishTypeInterface {

		ENGLISH_BREAKFAST(1, "English Breakfast", DishType.HOTFOOD, 7.5),
        SCRAMBLED_EGGS(2, "Scrambled Eggs", DishType.HOTFOOD, 5.0),
        CLUB_SANDWICH(3, "Club Sandwich", DishType.HOTFOOD, 4.0),
        ICE_CREAM(1, "Ice Cream", DishType.DESSERTS, 3.0),
        APPLE_PIE(2, "Apple Pie", DishType.DESSERTS, 4.0);
		
        private final String label;
        private final DishType type;
        private final Double price;
        private final int dishNumber;

        private Dish(int dishNumber, String label, DishType type, Double price) {
        	this.dishNumber = dishNumber;
            this.label = label;
            this.type = type;
            this.price = price;
        }

        @Override
        public String getDisplayableType() {
            return type.getDisplayableType();
        }
        
        public int getDishNumber() {
			return dishNumber;
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
