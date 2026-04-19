public class Support extends Type{

    private String message;

    @Override
    protected int usageFee(Customer customer) {
        int supportFee = (customer.usage > 100) ? customer.usage - 100 : 0;
        double KwSupportFee = 0;

        if (supportFee <= 100) {
            KwSupportFee += supportFee * 184.1;
        } else if (supportFee <= 200) {
            KwSupportFee += 100 * 184.1;
            KwSupportFee += (supportFee - 100) * 223.8;
        } else if (supportFee <= 300) {
            KwSupportFee += 100 * 184.1;
            KwSupportFee += 100 * 223.8;
            KwSupportFee += (supportFee - 200) * 278.3;
        } else if (supportFee <= 400) {
            KwSupportFee += 100 * 184.1;
            KwSupportFee += 100 * 223.8;
            KwSupportFee += 100 * 278.3;
            KwSupportFee += (supportFee - 300) * 353.6;
        } else if (supportFee <= 500) {
            KwSupportFee += 100 * 184.1;
            KwSupportFee += 100 * 223.8;
            KwSupportFee += 100 * 278.3;
            KwSupportFee += 100 * 353.6;
            KwSupportFee += (supportFee - 400) * 466.4;
        } else {
            KwSupportFee += 100 * 184.1;
            KwSupportFee += 100 * 223.8;
            KwSupportFee += 100 * 278.3;
            KwSupportFee += 100 * 353.6;
            KwSupportFee += 100 * 466.4;
            KwSupportFee += (supportFee - 500) * 643.9;
        }
        return (int) (customer.BASIC + KwSupportFee); // 사용 요금 (지원가구)

    }

    @Override
    public String toString() {
        return String.format("%s","지원가구");
    }
}
