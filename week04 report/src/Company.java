import java.util.ArrayList;

public class Company {
    private ArrayList<Employee> employees;

    public Company(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void display() {
        line();
        System.out.printf("%-6s %-6s %-6s %-4s %-4s %5s %8s %6s %6s %5s %8s \n",
                "이름", "사번", "부서명", "보훈", "급-호", "본봉", "업무수당",
                "직급수당", "공제금액", "세금", "수령액");
        line();
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));

            if ((i + 1) % 5 == 0) {
                System.out.println();
            }
        }
        line();
    }

    private void line() {
        for (int i = 0; i < 95; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
