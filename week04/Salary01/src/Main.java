import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        Employee[] employees = new Employee[]{
                new Employee("홍길동","1234",new Date(2003,5,23),'1','1'),
                new Employee("이나라","1345",new Date(2001,12,25),'3','2'),
                new Employee("나정신","2234",new Date(1995,5,4),'5','5'),
                new Employee("박정환","3234",new Date(2005,4,18),'2','3'),
                new Employee("김대한","4545",new Date(2000,8,13),'4','4'),
                new Employee("이민국","2234",new Date(1995,5,4),'5','4')
        };
        Company company =new Company(employees);
        company.inputData();
        company.display();
    }
}