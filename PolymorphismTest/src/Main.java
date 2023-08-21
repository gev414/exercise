public class Main {
     public static void main(String[] args) {

//        Car car = new Car("Generic Car");
//        runRace(car);
//
//        Car ferrari = new GasPoweredCar("2022 blue ferrari 296 gts",15.4,6);
//        runRace(ferrari);
//
//        Car tesla = new ElectricCar("2022 red Tesla Model 3",568,76);
//        runRace(tesla);
//
//        Car ferrariHybrid = new HybridCar("2022 black ferrari",16,8,8);
//        runRace(ferrariHybrid);

         Car tesla = Car.getCar("Electric","Tesla Model 3");
         runRace(tesla);
    }

    public static void runRace(Car car){
        car.startEngine();
        car.drive();
    }
}
