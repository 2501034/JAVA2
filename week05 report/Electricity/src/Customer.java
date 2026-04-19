import java.io.IOException;
import java.util.Scanner;

public class Customer extends Person {
    private String userNo;
    protected Type type;
    protected int usage;
    protected final int BASIC;

    public Customer(String name, String userNo, Type type) {
        super(name);
        this.userNo = userNo;
        this.type = type;
        this.usage = 0;
        this.BASIC = 1660;
    }

    protected void inputUsage() throws IOException {
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.printf("%s님의 전기 사용량 입력 : ", super.getName());
            usage = keyboard.nextInt();
            if (usage >= 0 && usage <= 9999)
                break;
            else {
                System.err.print("ERROR : 사용량 오류");
                System.in.read();
            }
        }
    }

    private int tax() {
        int tax = (int) (type.usageFee(this) * 0.07);
        return tax;
    }

    private int pay() {
        return type.usageFee(this) + tax();
    }

    @Override
    public String toString() {
        return String.format("%-5s %-3s %,5d %,10d %,8d %,10d %s",
                userNo, super.toString(), usage, type.usageFee(this),
                tax(), pay(), type.toString());
    }
}
