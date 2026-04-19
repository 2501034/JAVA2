public abstract class Type implements Calculable{
    protected Type type;

    @Override
    public abstract int usageFee(Customer customer);

    // 누진 계산 공통 로직 - 서브클래스에서 재사용 가능
    protected int calcProgressFee(int usage, int basic) {
        double KwUsageFee = 0;
        if (usage <= 100) {
            KwUsageFee += usage * 184.1;
        } else if (usage <= 200) {
            KwUsageFee += 100 * 184.1;
            KwUsageFee += (usage - 100) * 223.8;
        } else if (usage <= 300) {
            KwUsageFee += 100 * 184.1;
            KwUsageFee += 100 * 223.8;
            KwUsageFee += (usage - 200) * 278.3;
        } else if (usage <= 400) {
            KwUsageFee += 100 * 184.1;
            KwUsageFee += 100 * 223.8;
            KwUsageFee += 100 * 278.3;
            KwUsageFee += (usage - 300) * 353.6;
        } else if (usage <= 500) {
            KwUsageFee += 100 * 184.1;
            KwUsageFee += 100 * 223.8;
            KwUsageFee += 100 * 278.3;
            KwUsageFee += 100 * 353.6;
            KwUsageFee += (usage - 400) * 466.4;
        } else {
            KwUsageFee += 100 * 184.1;
            KwUsageFee += 100 * 223.8;
            KwUsageFee += 100 * 278.3;
            KwUsageFee += 100 * 353.6;
            KwUsageFee += 100 * 466.4;
            KwUsageFee += (usage - 500) * 643.9;
        }
        return (int) (basic + KwUsageFee); // 사용 요금
    }
}
