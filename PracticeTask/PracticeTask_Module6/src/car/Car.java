package car;

public class Car {
    private final Engine engine;
    private final CarType carType;
    private final int weight;

    public Car(Engine engine, CarType carType, int weight) {
        this.engine = engine;
        this.carType = carType;
        this.weight = weight;
    }
    public CarType getCarType() {
        return carType;
    }

    public int getWeight() {
        return weight;
    }
    public static void printCharacteristicsCar(Car car) {
        System.out.println("Тип автомобиля: " + car.getCarType() + "\n" +
                "Масса автомобиля: " + car.getWeight() + "\n" +
                "Тип двигателя: " + car.engine.type() + "\n" +
                "Oбъем двигателя: " + car.engine.weightEngine() + "\n" +
                "Мощность двигателя: " + car.engine.powerEngine());
    }
}
