package JFrame;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class labels {

    public static void main(String[] args) {

        Border border = BorderFactory.createLineBorder(Color.green, 3);

        JLabel label = new JLabel();
        label.setText("Sniper Monkey");
        label.setHorizontalTextPosition(JLabel.CENTER); //set text
        label.setVerticalTextPosition(JLabel.TOP); //set text relative to an image
        label.setForeground(new Color(0xFF0000)); //set font color
        label.setFont(new Font("MV Boli", Font.PLAIN, 50)); //set font of text
        label.setIconTextGap(100);
        label.setBackground(Color.black); //set background color
        label.setOpaque(true); //display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon and text within label
        label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon and text within label
        //label.setBounds(125, 50, 250, 250);


        ImageIcon icon = new ImageIcon();

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(500,500);
        //frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();

    }
}