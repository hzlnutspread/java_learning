package JFrame;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame() {
        this.setTitle("DONKEY MANNNNNN"); //set title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        this.setResizable(false); //cant change frame from resizing
        this.setSize(420,420); // set x , set y dimension
        this.setVisible(true); //make frame visible

        ImageIcon image = new ImageIcon("logo.png"); //creates an image icon
        this.setIconImage(image.getImage()); //change the icon image

        this.getContentPane().setBackground(new Color(123,50,250)); //change background colour
    }
}
