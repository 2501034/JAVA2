public class Employee extends Person {
        private Department department;
        private ClassGrade classGrade;
        private boolean special;
        private int aid;

    public Employee(String name, String employeeID, Department department, ClassGrade classGrade, boolean special, int aid) {
        super(name, employeeID);
        this.department = department;
        this.classGrade = classGrade;
        this.special = special;
        this.aid = aid;
    }

    private int gross() {
        return classGrade.getBaseSalary();
    }

    private int tax() {
        int tax = 0;
        int taxable = ((gross() + classGrade.getExtrapay() +
                department.getExtrapay()) - deduction());

        if (special) {
            tax = (int) (taxable * (3.0f / 100));
        } else {
            if (taxable < 700000) {
                tax = 0;
            } else if (taxable < 800000) {
                tax = (int) (taxable * (5.0f / 100));
            } else if (taxable < 1000000) {
                tax = (int) (taxable * (7.0f / 100));
            } else {
                tax = (int) (taxable * (9.0f / 100));
            }
        }

        return tax;
    }

    private int deduction() {
            int personal = Math.min(aid,300000);
            return (int)(classGrade.getBaseSalary() * 0.03f) + personal;
    }

    protected int payment() {
        int pay = gross() + classGrade.getExtrapay() + department.getExtrapay() - deduction() -tax();
        return (pay);
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%6s %7c %3c-%c %,10d %,8d %,8d %,8d %,8d %,10d",
                department.getName(), special ? 'O' : 'X', classGrade.getClas(), classGrade.getGrade(), gross(),
                department.getExtrapay(), classGrade.getExtrapay(), deduction(), tax(), payment());
    }
}