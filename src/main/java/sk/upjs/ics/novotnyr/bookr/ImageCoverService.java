package sk.upjs.ics.novotnyr.bookr;

import javax.swing.ImageIcon;


public interface ImageCoverService {

    ImageIcon getImageCover(Book book);

    void save(Book book, ImageIcon icon);
    
}
