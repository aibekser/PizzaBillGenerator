
public class Pizza {
	private int price;
	private boolean veg;
	
	private int extraCheesePrice = 3;
	private int extraToppingsPrice = 2;
	private int takeAwayBagPrice = 1;
	
	private int basePizzaPrice;
	
	private boolean isExtraCheeseAdded = false;
	private boolean isExtraToppingsAdded = false;
	private boolean isOptedForTakeAway = false;
	
	public Pizza(boolean veg) {
		this.veg = veg;
		
		if (veg) {
			this.price = 15;
		} else {
			this.price = 18;
		}
		
		basePizzaPrice = this.price;
	}
	
	public void addExtraCheese() {
		isExtraCheeseAdded = true;
		this.price += extraCheesePrice;
	}
	
	public void addExtraToppings() {
		isExtraToppingsAdded = true;
		this.price += extraToppingsPrice;
	}
	
	public void takeAway() {
		isOptedForTakeAway = true;
		this.price += takeAwayBagPrice;
	}
	
	public void getBill() {
		System.out.println("Pizza type: " + (veg ? "Vegetarian" : "Non-Vegetarian"));
		System.out.println("Pizza: " + basePizzaPrice);
		
		if (isExtraCheeseAdded) {
			System.out.println("Extra cheese added: " + extraCheesePrice);
		}
		
		if (isExtraToppingsAdded) {
			System.out.println("Extra toppings added: " + extraToppingsPrice);
		}
		
		if (isOptedForTakeAway) {
			System.out.println("Take away: " + takeAwayBagPrice);
		}
		
		System.out.println("Bill: " + this.price);
	}
}
