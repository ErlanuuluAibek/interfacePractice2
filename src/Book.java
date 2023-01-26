import java.util.Arrays;

public class Book implements Printable {
    private String bookName;
    private int page;

    public Book(String bookName, int page) {
        this.page = page;
        this.bookName = bookName;
    }

    public static void printBooks(Printable[] printables) {
        System.out.println(Arrays.toString(printables));
    }


    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public void print() {
        System.out.println("print books");
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +" page: "+page+
                '}';
    }
}
