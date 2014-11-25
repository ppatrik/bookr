
package sk.upjs.ics.novotnyr.bookr;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class HsqlBookDaoTest {
    private BookDao bookDao = BeanFactory.INSTANCE.bookDao();
    

    @Test
    public void testList() {
        List<Book> books = bookDao.list();
        assertEquals(0, books.size());
    }

    @Test
    public void testFindByNonexistentId() {
        Book book = bookDao.findById(-1L);
        assertNull(book);
    }

}