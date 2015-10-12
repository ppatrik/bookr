package sk.upjs.ics.novotnyr.bookr.gui;

import javax.swing.*;
import java.awt.*;

public class AboutForm extends JDialog {
    public AboutForm(Frame owner) {
        super(owner, "About Bookr.", true);

        add(new JLabel("(C) Bookr Team 2014-"));
        pack();

        setLocationRelativeTo(null);
    }


}
