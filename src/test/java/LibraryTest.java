import org.junit.Before;
import org.junit.Test;

import java.awt.print.Book;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;
    private Book book1;
    private Book book2;


    @Before
    public void before(){
        library = new Library(2);
        book = new Book();
        book1 = new Book();
        book2 = new Book();
    }

    @Test
    public void libraryHasNoBooks(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void addsBooksToLibrary(){
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void libraryCantAddBooks(){
        library.addBook(book);
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.bookCount());
    }



}
