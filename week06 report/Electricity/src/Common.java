public class Common extends Type {
    private String message;

    @Override
    public int usageFee(Customer customer) {
        // 추상 클래스의 공통 매서드 사용
        return calcProgressFee(customer.usage, customer.BASIC);
    }

    @Override
    public String toString() {
        return String.format("");
    }
}
