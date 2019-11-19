import java.awt.print.Book;
import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> collection;

    public Library(int capacity){
        this.collection = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int bookCount() {
        return this.collection.size();
    }

    public void addBook(Book book){
        if(this.collection.size() < this.capacity)
        this.collection.add(book);
    }
    public Book loanBook(Book book){
        this.collection.add(book);
        return this.collection.remove(0);
    }
}
