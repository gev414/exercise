public class Banana extends ProductsForSale{
    public Banana(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("This "+type+" is just amazing!");
        System.out.printf("The price of one is $%6.2f %n",price);
        System.out.printf(description);
    }
}
