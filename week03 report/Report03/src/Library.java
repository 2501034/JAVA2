public class Library {

    public void checkOutBook(Member member, Book book) {
        if (book.bookBorrow()) {
            System.out.println("이미 대출된 책입니다.\n");
            return;
        }
        book.setBorrow(true);
        System.out.printf("%s님이 %s 도서를 대출하였습니다.\n", member, book);
    }

    public void returnBook(Member member, Book book) {
        if (!book.bookBorrow()) {
            System.out.println("대출되지 않은 책입니다.\n");
            return;
        }
        book.setBorrow(false);
        System.out.printf("%s님이 %s 도서를 반납하였습니다.\n", member, book);
    }

}