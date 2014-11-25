package sk.upjs.ics.novotnyr.bookr.gui;

import java.awt.Component;
import java.net.URL;
import javax.swing.DefaultListCellRenderer;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import sk.upjs.ics.novotnyr.bookr.BeanFactory;
import sk.upjs.ics.novotnyr.bookr.Book;
import sk.upjs.ics.novotnyr.bookr.ImageCoverService;

public class BookDashboardListCellRenderer implements ListCellRenderer<Book> {
    private ImageCoverService imageCoverService = BeanFactory.INSTANCE.imageCoverService();
    
    private DefaultListCellRenderer delegate = new DefaultListCellRenderer();
    
    @Override
    public Component getListCellRendererComponent(JList<? extends Book> list, Book book, int index, boolean isSelected, boolean cellHasFocus) {
        Component component = delegate.getListCellRendererComponent(list, book, index, isSelected, cellHasFocus);
        if(component instanceof JLabel) {
            // DefaultListCellRenderer vracia vždy JLabel s textom, viď dokumentácia
            JLabel label = (JLabel) component;
            label.setText(book.getTitle());
            label.setIcon(getIcon(book));
            return label;
        } else {
            throw new ClassCastException("Illegal JList component type. "
                    + "Expected JLabel, but found " 
                    + component.getClass());
        } 
    }

    private Icon getIcon(Book book) {
        ImageIcon imageCover = imageCoverService.getImageCover(book);
        if(imageCover == null) {
            URL bookIconUrl = BookDashboardListCellRenderer.class.getResource("book-icon.png");
            return new ImageIcon(bookIconUrl);
        } 
        return imageCover;
    }

}
