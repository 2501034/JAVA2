import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Department[] departments = new Department[] {
                new Department('0',"",250000),
                new Department('1',"경리과",250000),
                new Department('2',"인사과",250000),
                new Department('3',"영업팀",350000),
                new Department('4',"생산과",350000),
                new Department('5',"A/S팀",300000)
        };

        ClassGrade[] classGrades = new ClassGrade[] {
                new ClassGrade('1','1',1250000,300000),
                new ClassGrade('1','2',1200000,300000),
                new ClassGrade('1','3',1150000,300000),
                new ClassGrade('1','4',1100000,300000),
                new ClassGrade('1','5',1050000,300000),
                new ClassGrade('2','1',950000,200000),
                new ClassGrade('2','2',925000,200000),
                new ClassGrade('2','3',900000,200000),
                new ClassGrade('2','4',875000,200000),
                new ClassGrade('2','5',850000,200000),
                new ClassGrade('3','1',750000,100000),
                new ClassGrade('3','2',725000,100000),
                new ClassGrade('3','3',700000,100000),
                new ClassGrade('3','4',675000,100000),
                new ClassGrade('3','5',650000,100000),
        };

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("홍길동","11111", departments[1], classGrades[0],false,200000));
        employees.add(new Employee("한국민","12231", departments[3], classGrades[7],false,300000));
        employees.add(new Employee("이대한","13156", departments[4], classGrades[8],true,200000));
        employees.add(new Employee("한아름","13211", departments[5], classGrades[12],false,100000));
        employees.add(new Employee("새로움","16171", departments[4], classGrades[14],false,200000));

        employees.add(new Employee("이기쁨","17778", departments[3], classGrades[7],false,200000));
        employees.add(new Employee("정동진","18567", departments[1], classGrades[6],true,200000));
        employees.add(new Employee("김진우","19129", departments[4], classGrades[0],false,200000));
        employees.add(new Employee("이나래","19891", departments[3], classGrades[13],false,200000));
        employees.add(new Employee("박명길","21190", departments[2], classGrades[9],false,300000));

        Company company = new Company(employees);
        company.display();

    }
}