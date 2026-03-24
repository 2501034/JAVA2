public class Classroom {
    private Teacher teacher;
    private Student student;

    public Classroom(Student student, Teacher teacher) {
        this.student = student;
        this.teacher = teacher;
    }

    public void startClass(Book book) {
        teacher.teach();
        student.study(book);
    }
}
