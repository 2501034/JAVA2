public class ClassGrade {
    private char clas;
    private char grade;
    private int baseSalary;
    private int extrapay;

    public ClassGrade(char clas, char grade, int baseSalary, int extrapay) {
        this.clas = clas;
        this.grade = grade;
        this.baseSalary = baseSalary;
        this.extrapay = extrapay;
    }

    public char getClas() {
        return clas;
    }

    public char getGrade() {
        return grade;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public int getExtrapay() {
        return extrapay;
    }
}
