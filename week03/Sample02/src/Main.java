//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Book book = new Book("자바의 정석");
        Student lee = new Student("이영희");
        Teacher kim = new Teacher("김철수","자바");

        Classroom classRoom = new Classroom(lee,kim);
        classRoom.startClass(book);
    }
}