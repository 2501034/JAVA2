import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

        Customer[] customers = new Customer[]{

                new Customer("홍길동", new Date(1999, 4, 8),
                        "010-1234-5678", new DiscountPlan()),
                new Customer("박길동", new Date(2016, 4, 8),
                        "010-1234-5678", new DiscountPlan()),
                new Customer("이노인", new Date(1940, 4, 8),
                        "010-1234-5678", new BasicPlan()),
                new Customer("박길동", new Date(2016, 4, 8),
                        "010-1234-5678", new DiscountPlan())
        };

        PhoneOffice office =new PhoneOffice(customers);
        office.inputData();
        office.display();
    }
}