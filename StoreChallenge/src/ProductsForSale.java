public abstract class ProductsForSale {
    protected String type;
    protected double price;
    protected String description;

    public ProductsForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double getSalesPrice(int quantity){
        return this.price*quantity;
    }

    public void printPricedItem(int quantity){
        System.out.printf("%2d quantity at %5.2f$ each, %-7s %-5s %n",
                quantity,price,type,description);
    }
    public abstract void showDetails();
}
