import java.io.IOException;

public class Kepco {
    private Customer[] customers;

    public Kepco(Customer[] customers) {
        this.customers = customers;
    }

    protected void inputData() throws IOException {
        for (int i = 0; i < customers.length; i++){
            customers[i].inputUsage();
        }
    }

    protected void display() {
        line();
        System.out.printf("%-5s %-3s %3s %7s %5s %9s %4s \n", "번호", "이름",
                "사용량", "사용요금", "세금", "납부금액", "비고");
        line();
        for (int i = 0; i < customers.length; i++) {
            System.out.println(customers[i]);
        }
        line();
    }

    private void line() {
        for (int i = 0; i < 56; i++)
            System.out.print("-");
        System.out.println();
    }
}
