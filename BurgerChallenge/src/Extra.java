public class Extra implements Item {
    private String type;
    private String size;
    private double price;

    public Extra(String type, String size) {
        this.type = type;
        this.size = size;
        calcPrice();
    }
    public Extra(){
        this.type = "French Fries";
        this.size = "Small";
        calcPrice();
    }

    @Override
    public void calcPrice() {
        switch (type){
            case "French Fries" -> this.price = 0.99;
            case "Chicken Nuggets" -> this.price = 1.69;
            case "Falafel" -> this.price = 1.19;
            default -> this.price = 0.99;
        }
        switch (size) {
            case "Medium" -> this.price*=1.5;
            case "Large" -> this.price*=2;
            default -> this.price*=1;
        }
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
