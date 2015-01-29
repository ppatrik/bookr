package sk.upjs.ics.novotnyr.bookr.gui;

import sk.upjs.ics.novotnyr.bookr.Book;

import javax.swing.*;

public class BookDetailPanel {
    private JButton btnComments;
    private JLabel lblTitle;
    private JLabel lblPublisher;
    private JLabel lblYear;
    private JLabel lblRating;
    private JPanel panel;

    public void setBook(Book book) {
        lblTitle.setText(book.getTitle());
        lblPublisher.setText(book.getPublisher().getName());
        lblYear.setText(Integer.toString(book.getYear()));
        lblRating.setText("Rating: " + Integer.toString(book.getRating()));
    }

    public JPanel getPanel() {
        return panel;
    }
}
