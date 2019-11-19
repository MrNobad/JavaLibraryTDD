import java.awt.print.Book;
import java.util.ArrayList;

public class Biblophile {

    private ArrayList<Book> collection;

    public Biblophile(){
        this.collection = new ArrayList<Book>();
    }

    public int bookCount() {
        return this.collection.size();
    }

    public void borrowsBookFromLibrary(Library library) {
        Book book = library.loanBook(book);
        this.collection.add(book);
    }
}
