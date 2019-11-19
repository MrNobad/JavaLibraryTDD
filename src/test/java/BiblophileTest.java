import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BiblophileTest {

    private Biblophile biblophile;
    private Book book;


    @Before
    public void before(){
        biblophile = new Biblophile();
        book = new Book("2001 A Space Odessey", "Arthur C Clark", "Sci-Fi");
    }

    @Test
    public void addBookToBiblophileCollection(){
        biblophile.addBook(book);
        assertEquals(1, biblophile.bookCount());
    }
}
