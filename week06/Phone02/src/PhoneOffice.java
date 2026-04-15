import java.io.IOException;

public class PhoneOffice {
private Customer[] customers;

    public PhoneOffice(Customer[] customers) {
        this.customers = customers;
    }

    protected void inputData() throws IOException {
        for (int i = 0; i < customers.length; i++) {
            customers[i].inputUsageTime();
            customers[i].inputMessage();
        }
    }

    protected void display() {
        line();
        System.out.println("    이름(생일) 나이   전화번호    통화시간    " +
                "문자건수   요금제     사용요금    세금     납부금액");
        line();
        for (int i = 0; i < customers.length; i++)
            System.out.println(customers[i]);
        line();
    }

    private void line() {
        for (int i = 0; i < 100; i++)
            System.out.print("=");
        System.out.println();
    }
}
