
package sk.upjs.ics.novotnyr.bookr;

import org.junit.Test;

import javax.swing.*;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

/**
 * @author rn
 */
public class HsqlImageCoverServiceTest {

    public HsqlImageCoverServiceTest() {
    }

    @Test
    public void testGetImageCover() {
        Book book = new Book();
        book.setId(5L);

        ImageCoverService imageCoverService = BeanFactory.INSTANCE.imageCoverService();
        ImageIcon icon = imageCoverService.getImageCover(book);

        assertNotNull(icon);
    }

    @Test
    public void testSave() {
        System.out.println("save");
        Book book = null;
        ImageIcon icon = null;
        HsqlImageCoverService instance = new HsqlImageCoverService();
        instance.save(book, icon);
        fail("The test case is a prototype.");
    }

}