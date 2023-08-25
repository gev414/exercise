public class Orange extends ProductsForSale{
    public Orange(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Ah, an "+type+" for the gods!");
        System.out.printf("The price of one is $%6.2f %n",price);
        System.out.println(description);
    }
}
