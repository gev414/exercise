public class Bedroom {

    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;

    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    public Bedroom() {
        wall1 = new Wall("West");
         wall2 = new Wall("East");
         wall3 = new Wall("South");
         wall4 = new Wall("North");
         ceiling = new Ceiling(12, 55);
         bed = new Bed("Modern", 4, 3, 2, 1);
         lamp = new Lamp("Classic", false, 75);
    }

    public Lamp getLamp() {
        return lamp;
    }

    public void makeBed(){
        bed.make();
    }
}
