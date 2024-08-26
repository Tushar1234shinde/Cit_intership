package pizza_billing;

public class DeluxPizza extends pizza{

	public DeluxPizza(Boolean veg)
	{
		super(veg);
	}
	
	@Override
public void addExtraCheese() {
	this.price += extraCheesePrice;
}

	@Override
public void addExtraToppings() {
	this.price += extraToppingsPrice;
}

}
