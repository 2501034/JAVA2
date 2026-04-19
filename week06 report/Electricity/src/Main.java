import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Customer[] customers = new Customer[] {
                new Customer("정상진","12345",new Common()),
                new Customer("일본인", "92345", new Support()),
                new Customer("홍길동", "12345", new Common()),
                new Customer("한국인", "12345", new Common()),
                new Customer("고길동", "12345", new Common()),
                new Customer("이대한", "12345", new Common()),
                new Customer("이기동", "92345", new Support()),
                new Customer("박종호", "92345", new Support()),
                new Customer("이니나", "12345", new Common()),
                new Customer("윤상열", "12345", new Common())
        };

        Kepco kepco = new Kepco(customers);
        kepco.inputData();
        kepco.display();

    }
}