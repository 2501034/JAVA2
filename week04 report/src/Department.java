public class Department {
    private char departNO;
    private String name;
    private int extrapay;

    public Department(char departNO, String name, int extrapay) {
        this.departNO = departNO;
        this.name = name;
        this.extrapay = extrapay;
    }

    public String getName() {
        return name;
    }

    public int getExtrapay() {
        return extrapay;
    }

    @Override
    public String toString() {
        return String.format("%4s", name);
    }
}