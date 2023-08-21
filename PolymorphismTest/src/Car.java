public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("..................");
        System.out.println(getClass().getSimpleName() + " engine started!");
    }

    public void drive() {
        System.out.println("Driving " + getClass().getSimpleName());
        runEngine();
    }

    protected void runEngine() {
        System.out.println(getClass().getSimpleName() + " Engine begins to rev up");
    }

    // ----------------- factory method  ----------------
    public static Car getCar(String type, String model){
        return switch (type.toUpperCase().charAt(0)){
            case 'G' -> new GasPoweredCar(model);
            case 'E' -> new ElectricCar(model);
            case 'H' -> new HybridCar(model);
            default -> new Car(model);
        };
    }
}

// -------------------   GAS   CAR  -----------------------
class GasPoweredCar extends Car{
    private double avbKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avbKmPerLitre, int cylinders) {
        super(description);
        this.avbKmPerLitre = avbKmPerLitre;
        this.cylinders = cylinders;
    }


    public void startEngine() {
        System.out.printf("All %d cylinders are fired up, Ready %n",cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas usage exceeds the average: %.2f %n", avbKmPerLitre);
    }
}
//  --------------------      EV  CAR -------------------
class ElectricCar extends Car{
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description) {
        super(description);
    }

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }


    public void startEngine() {
        System.out.printf("BEV -> switch %d kWh battery on, Ready!%n",batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("BEV -> usage under the average: %.2f %n", avgKmPerCharge);
    }
}
// ---------------------   Hybrid Car --------------------
class HybridCar extends Car{
    private double avbKmPerLitre;
    private int cylinders;
    private int batterySize;

    public HybridCar(String description) {
        super(description);
    }

    public HybridCar(String description, double avbKmPerLitre, int cylinders, int batterySize) {
        super(description);
        this.avbKmPerLitre = avbKmPerLitre;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
    }


    public void startEngine() {
        System.out.printf("Hybrid -> %d cylinders are fired up.%n",cylinders);
        System.out.printf("Hybrid -> switch %d kWh battery on, Ready!.%n",batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Hybrid -> usage below average: %.2f %n", avbKmPerLitre);
    }
}

