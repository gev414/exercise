public class SmartKitchen {
    private CoffeeMaker coffeeMaker;
    private DishWasher jena;
    private Refrigerator fridge;

    public SmartKitchen() {
        coffeeMaker = new CoffeeMaker();
        jena = new DishWasher();
        fridge = new Refrigerator();
    }

    private CoffeeMaker getCoffeeMaker() {
        return coffeeMaker;
    }

    private DishWasher getJena() {
        return jena;
    }

    private Refrigerator getFridge() {
        return fridge;
    }

    private void addWater(){
        coffeeMaker.setHasWorkToDo(true);
    }

    private void pourMilk(){
        fridge.setHasWorkToDo(true);
    }

    private void loadDishwasher(){
        jena.setHasWorkToDo(true);
    }

    public void setKitchenState(boolean coffeeFlag,boolean jenaFlag, boolean fridgeFlag){
        coffeeMaker.setHasWorkToDo(coffeeFlag);
        jena.setHasWorkToDo(jenaFlag);
        fridge.setHasWorkToDo(fridgeFlag);
    }

    public void doKitchenWork(){
        coffeeMaker.brewCoffee();
        jena.doDishes();
        fridge.orderFood();

    }
}
