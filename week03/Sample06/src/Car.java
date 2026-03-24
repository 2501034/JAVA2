public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        System.out.println("Car is driving....");
    }

    public void stop() {
        System.out.println("Car has stopped.");
    }
}
