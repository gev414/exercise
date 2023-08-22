public class Drink implements Item {
    private String size;
    private String type;
    private boolean cold;
    private double price;

    public Drink() {
        this.type = "Water";
        this.size = "Small";
        this.cold = false;
        calcPrice();
    }

    public Drink(String size, String type, boolean cold) {
        this.size = size;
        this.type = type;
        this.cold = cold;
        calcPrice();
        }


    @Override
    public void calcPrice() {
        switch(type){
            case "Water" -> this.price= 0.99;
            case "Carbonated Drink" -> this.price = 1.49;
            case "Juice" -> this.price = 1.79;
            default -> this.price = 0;
        }
        switch (size) {
            default -> this.price*=1;
            case "Medium" -> this.price*=1.5;
            case "Large" -> this.price*=2;
        }

    }

    @Override
    public double getPrice() {
        return this.price;
    }
}

