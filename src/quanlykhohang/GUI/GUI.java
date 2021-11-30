package quanlykhohang.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    private JFrame frame;
    private JPanel panel;

    public GUI(){
        frame = new JFrame();
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(500,500,100,500));
        panel.setLayout(new GridLayout(0,2));

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Ware House");
        frame.pack();
        frame.setVisible(true);

        JLabel label = new JLabel("User");
        label.setBounds(10,20,80,25);
        panel.add(label);
        JTextField userText = new JTextField();
        userText.setBounds(100,20,165,25);
        panel.add(userText);
        JLabel passwordText = new JLabel("password");
        passwordText.setBounds(10,50,80,25);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
