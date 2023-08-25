import java.util.ArrayList;

record OrderItem(int quantity,ProductsForSale product){}

public class Store {
    private ProductsForSale products;
    private static ArrayList<ProductsForSale> storeProducts = new ArrayList<>();


    public static void main(String[] args) {
        storeProducts.add(new Apple("Green Apple",0.50,"more sour, less sweet"));
        storeProducts.add(new Apple("Yellow Apple",1,"bit sour, bit sweet"));
        storeProducts.add(new Apple("Red Apple",0.70,"less sour, more sweet"));
        storeProducts.add(new Banana("Ripe Banana",1251,"diabetes"));
        storeProducts.add(new Orange("Ripe Orange",1.25,"fresh-ready"));
        storeProducts.add(new Mango("Green Mango",2,"Not so Ripe"));

        listProducts();

        System.out.println("\nOrder1");
        var order1 = new ArrayList<OrderItem>();
        addItemtoOrder(order1,1,2);
        addItemtoOrder(order1,0,1);
        printOrder(order1);

        System.out.println("\nOrder2");
        var order2 = new ArrayList<OrderItem>();
        addItemtoOrder(order2,4,4);
        addItemtoOrder(order2,3,2);
        printOrder(order2);
    }

    public static void listProducts(){
        for(var item : storeProducts){
            System.out.println("-".repeat(20));
            item.showDetails();
        }
    }

    public static void addItemtoOrder(ArrayList<OrderItem> order, int orderIndex, int quantity){
        order.add(new OrderItem(quantity, storeProducts.get(orderIndex)));
    }

    public static void printOrder(ArrayList<OrderItem> order){
        double salesTotal =0;
        for(var item : order){
            item.product().printPricedItem(item.quantity());
            salesTotal+=item.product().getSalesPrice(item.quantity());
        }
        System.out.printf("Total = $%6.2f %n",salesTotal);
    }
}
