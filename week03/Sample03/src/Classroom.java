public class Classroom {
    private Person teacher;
    private Person student;


    public Classroom(Student student, Teacher teacher) {
        this.student = student;
        this.teacher = teacher;

    }

    public void startClass(Book book) {
        if (teacher instanceof Teacher)
            ((Teacher)teacher).teach();
        if (student instanceof Student)
            ((Student)student).study(book);

    }
}
