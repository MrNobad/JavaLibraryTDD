import java.awt.print.Book;
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> collection;

    public Library(){
        this.collection = new ArrayList<Book>();
    }

    public int bookCount() {
        return this.collection.size();
    }
}
