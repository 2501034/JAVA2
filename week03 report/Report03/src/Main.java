//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        Member hong = new Member("홍길동");
        Member kim = new Member("김철수");

        Book book1 = new Book("소년은 온다");
        Book book2 = new Book("점프 투 파이썬");

        library.checkOutBook(kim, book1);
        library.checkOutBook(hong, book2);
        library.returnBook(kim, book1);
        library.returnBook(hong, book2);
    }
}