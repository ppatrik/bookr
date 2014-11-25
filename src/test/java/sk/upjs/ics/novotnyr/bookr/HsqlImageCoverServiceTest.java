
package sk.upjs.ics.novotnyr.bookr;

import javax.swing.ImageIcon;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
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