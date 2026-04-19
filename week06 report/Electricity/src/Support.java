public class Support extends Type{

    private String message;

    @Override
    public int usageFee(Customer customer) {
        int supportFee = (customer.usage > 100) ? customer.usage - 100 : 0;
        // 추상 클래스의 공통 메서드 재사용
        return calcProgressFee(supportFee, customer.BASIC);

    }

    @Override
    public String toString() {
        return String.format("%s","지원가구");
    }
}
