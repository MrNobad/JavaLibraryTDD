import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BiblophileTest {

    private Biblophile biblophile;
    private Book book;
    private Library library;


    @Before

    public void before(){
    biblophile = new Biblophile();
    book = new Book("2001", "Arthur C Clarke", "Sci-Fi");
    library = new Library(2);
    }

    @Test
    public void collectionStartsEmpty(){
        assertEquals(0, biblophile.bookCount());
    }

    @Test
    public void canBorrowBooks(){
        biblophile.borrowsBookFromLibrary(library);
        assertEquals(1, biblophile.bookCount());
    }


}
