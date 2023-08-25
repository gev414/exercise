public class Mango extends ProductsForSale{
    public Mango(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println(type+" is "+type+"!!!");
        System.out.printf("The price of one is $%6.2f %n",price);
        System.out.println(description);
    }
}
