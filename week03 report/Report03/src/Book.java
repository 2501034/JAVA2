public class Book {
    private String bookName;
    private boolean bookBorrow;

    public Book(String bookName) {
        this.bookName = bookName;
        this.bookBorrow = false;
    }

    public boolean bookBorrow() {
        return bookBorrow;
    }

    public void setBorrow(boolean borrowed) {
        bookBorrow = borrowed;
    }

    @Override
    public String toString() {
        return bookName;
    }
}
