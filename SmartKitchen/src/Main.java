public class Main {
    public static void  main(String[] args) {

        SmartKitchen kitchen = new SmartKitchen();
//        kitchen.getJena().setHasWorkToDo(true);
//        kitchen.getFridge().setHasWorkToDo(true);
//        kitchen.getCoffeeMaker().setHasWorkToDo(true);
//
//        kitchen.getJena().doDishes();
//        kitchen.getFridge().orderFood();
//        kitchen.getCoffeeMaker().brewCoffee();

        kitchen.setKitchenState(true,true,true);
        kitchen.doKitchenWork();

    }
}
