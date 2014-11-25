package sk.upjs.ics.novotnyr.bookr.gui;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import sk.upjs.ics.novotnyr.bookr.Publisher;


public class PublisherListCellRenderer extends DefaultListCellRenderer {

    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        Publisher publisher = (Publisher) value;
        if(Publisher.isNullPublisher(publisher)) {
            publisher.setName("-- Select -- ");
        }
        return super.getListCellRendererComponent(list, publisher.getName(), index, isSelected, cellHasFocus);
    }
    
}
