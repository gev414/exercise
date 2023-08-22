
import java.util.Scanner;

public class Meal {
    private Burger burger;
    private Drink drink;
    private Extra extra;

    //        private boolean deluxe; May add later
    Scanner scan = new Scanner(System.in);
    public Meal() {
        System.out.print("What kind of burger do you want?(Hamburger,Cheeseburger,Gigaburger): ");
        String tempBurger = scan.nextLine();
        this.burger = new Burger(tempBurger);
        System.out.print("Any toppings?(Ketchup,Mayo,Mustard,BBQ,Liutenitza): ");
        String topping = scan.nextLine();
        burger.addTopping(topping);
        System.out.print("What's the drink?:(Water,Carbonated Drink, Juice): ");
        String tempDrink = scan.nextLine();
        System.out.print("Size?:(Small,Medium,Large) ");
        String tempDrinkSize = scan.nextLine();
        System.out.println("Cold?(Yes/No): ");
        boolean tempDrinkCold = (scan.nextLine().equals("Yes"));
        this.drink = new Drink(tempDrink, tempDrinkSize, tempDrinkCold);
        System.out.println("Any extras?(French Fries, Chicken Nuggets, Falafel): ");
        String tempExtra = scan.nextLine();
        System.out.println(tempExtra + " size?: ");
        String tempExtraSize = scan.nextLine();
        this.extra = new Extra(tempExtra, tempExtraSize);
    }

    public Burger getBurger() {
        return burger;
    }

    public Drink getDrink() {
        return drink;
    }

    public Extra getExtra() {
        return extra;
    }

    public void cost() {
        double total = getBurger().getPrice() +
                getDrink().getPrice() +
                getExtra().getPrice();
        System.out.println("Total Cost:");
        System.out.printf("%.2f$",total);
    }
}
