import java.io.IOException;

public class Classroom {
    private Student[] students;

    public Classroom(Student[] students) {
        this.students = students;
    }

    protected void inputData() throws IOException {
        for (int i = 0; i < students.length; i++) {
            students[i].inputData();
            System.out.println();
        }
    }

    protected void  display() {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString());
        }

    }
}
