public class Type {
    protected Type type;

    protected int usageFee(Customer customer) {
        double KwUsageFee = 0;
        if (customer.usage <= 100) {
            KwUsageFee += customer.usage * 184.1;
        } else if (customer.usage <= 200) {
            KwUsageFee += 100 * 184.1;
            KwUsageFee += (customer.usage - 100) * 223.8;
        } else if (customer.usage <= 300) {
            KwUsageFee += 100 * 184.1;
            KwUsageFee += 100 * 223.8;
            KwUsageFee += (customer.usage - 200) * 278.3;
        } else if (customer.usage <= 400) {
            KwUsageFee += 100 * 184.1;
            KwUsageFee += 100 * 223.8;
            KwUsageFee += 100 * 278.3;
            KwUsageFee += (customer.usage - 300) * 353.6;
        } else if (customer.usage <= 500) {
            KwUsageFee += 100 * 184.1;
            KwUsageFee += 100 * 223.8;
            KwUsageFee += 100 * 278.3;
            KwUsageFee += 100 * 353.6;
            KwUsageFee += (customer.usage - 400) * 466.4;
        } else {
            KwUsageFee += 100 * 184.1;
            KwUsageFee += 100 * 223.8;
            KwUsageFee += 100 * 278.3;
            KwUsageFee += 100 * 353.6;
            KwUsageFee += 100 * 466.4;
            KwUsageFee += (customer.usage - 500) * 643.9;
        }
        return (int) (customer.BASIC + KwUsageFee); // 사용 요금
    }
}
