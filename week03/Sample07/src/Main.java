//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ElectricCar electricCar = new ElectricCar();
        electricCar.charge();
        electricCar.drive();
        electricCar.stop();

        SportsCar sportsCar = new SportsCar();
        sportsCar.drive();
        sportsCar.turboBoost();
        sportsCar.stop();
    }
}