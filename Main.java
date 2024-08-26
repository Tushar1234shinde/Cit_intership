package pizza_billing;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(".............................Welcome to pizzamania......................");
		System.out.println("Which pizza: (1.Veg Pizza   2.Non Veg Pizza   3.Delux Veg Pizza   4.Delux Non-Veg Pizza)");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		
		switch(ch)
		{
		case 1:
			pizza vegPizza = new pizza(true);
			vegPizza.addExtraToppings();
			vegPizza.addExtraCheese();
			vegPizza.takeAway();
			vegPizza.getBill();
			break;
			
		case 2:
			pizza nonvegPizza = new pizza(true);
			nonvegPizza.addExtraToppings();
			nonvegPizza.addExtraCheese();
			nonvegPizza.takeAway();
			nonvegPizza.getBill();
			break;
			
		case 3:
			DeluxPizza veg = new DeluxPizza(true);
			veg.basePizzaPrice =550;
			veg.addExtraToppings();
			veg.addExtraCheese();
			veg.takeAway();
			veg.getBill();
			break;
		}
	}

}
