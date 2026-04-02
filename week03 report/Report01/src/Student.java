import java.time.LocalDate;

public class Student {
    private String name;
    private String enroll;
    private String depart;
    private int birthday;

    public Student(String name, String enroll, String depart, int birthday) {
        this.name = name;
        this.enroll = enroll;
        this.depart = depart;
        this.birthday = birthday;
    }

    public int getAge(int birthday) {
        int birthYear = birthday / 10000;
        int birthMonth = (birthday / 100) % 100;
        int birthDay = birthday % 100;

        LocalDate today = LocalDate.now();

        int age = today.getYear() - birthYear;

        // 생일 안 지났으면 -1
        if (today.getMonthValue() < birthMonth ||
                (today.getMonthValue() == birthMonth && today.getDayOfMonth() < birthDay)) {
            age--;
        }
        return age;
    }

    @Override
    public String toString() {
        int age = getAge(birthday);
        return String.format("이름: %s \n" +
                             "나이: %d \n" +
                             "학번: %s \n" +
                             "학과: %s \n", name, age, enroll, depart);
    }
}