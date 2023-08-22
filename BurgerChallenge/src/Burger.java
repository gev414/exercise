//   1.  done -   Excluding the deluxe, burgers are 3 types: hamburger, cheeseburger, gigaburger.
//   2.  x    -  Burgers should have up to 3 toppings
//   3.  x    - Deluxe burger should be with a fixed size and increased maximum toppings ( Up to 5),
//              with 2 of them being free
public class Burger implements Item {
    private String type;
    private double price;
    private Topping topping;

    public Burger(){
        this.type="Hamburger";
        calcPrice();
    }
    public Burger(String type) {
        this.type = type;
        calcPrice();
    }

//    -------------- factory  method   -----------
//    no checks, might add later
    public void addTopping(String topping){
        Topping topping1 = new Topping(topping);
        price+=topping1.getPrice();
    }

    @Override
    public void calcPrice(){
        switch (type){
            case "Hamburger" ->this.price =  3;
            case "Cheeseburger" ->this.price =  2;
            case "Gigaburger" ->this.price =  5;
            default ->this.price =  0;
        }
    }
    @Override
    public double getPrice() {
        return this.price;
    }
}
