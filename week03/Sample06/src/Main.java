//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Engine engine = new Engine();
        Car car = new Car(engine);
        engine.start();
        car.drive();
        car.stop();
        engine.stop();
    }
}