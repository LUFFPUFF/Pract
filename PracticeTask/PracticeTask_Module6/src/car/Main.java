package car;

public class Main {

    private static final Engine ENGINE = new Engine(EngineType.DIESEL,
            3.5, 500);

    public static void main(String[] args) {
        Car car = createCar();
        Car.printCharacteristicsCar(car);
    }

    private static Car createCar() {
        return new Car(ENGINE, CarType.PICKUP, 3000);
    }
}
