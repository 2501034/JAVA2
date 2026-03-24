//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Nevigation nevigation = new Nevigation("아이나비");
        Car car = new Car();

        car.drive(nevigation,"경복대","서울역");
    }
}