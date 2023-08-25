public class Apple extends ProductsForSale{
    public Apple(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("This "+type+" is pretty gud ngl");
        System.out.printf("The price of one is $%6.2f %n",price);
        System.out.println(description);
    }
}
