public class Topping implements Item{
    private String type;
    private double price;

    public Topping(String type) {
        this.type = type;
        calcPrice();
    }
    public String getType() {
        return type;
    }

    @Override
    public void calcPrice() {
        price = switch (type){
            case "Ketchup" -> price=1;
            case "Mustard" -> price=1;
            case "Mayo" -> price=1;
            case "BBQ" -> price=2;
            case "Liutenitza" -> price=5;
            default-> price=0;
        };

    }

    @Override
    public double getPrice() {
        return price;
    }
}
