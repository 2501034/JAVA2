import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

        Customer[] customers = new Customer[]{
                new Customer("홍길동", "1234", new Home()),
                new Customer("홍길동", "1234", new Business()),
                new Customer("홍길동", "1234", new Factory()),
                new Customer("홍길동", "1234", new Government()),
                new Customer("홍길동", "1234", new Army()),

        };
        Wateroffice office = new Wateroffice(customers);
        office.inputData();
        office.display();

    }
}