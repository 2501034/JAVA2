public class Member {

    private String TV;
    private String company;
    private int year;
    private int inch;
    private String panel;

    public Member(String TV, String company, int year, int inch, String panel) {
        this.TV = TV;
        this.company = company;
        this.year = year;
        this.inch = inch;
        this.panel = panel;
    }

    @Override
    public String toString() {
        return String.format("%s는 %s에서 만든 %d년형 %d 인치\n" +
                "%s TV 입니다.\n", TV, company, year, inch, panel);
    }
}
