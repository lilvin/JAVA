package com.gui3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.Toolkit;
import com.gui3.Home;


public class inputForm {
    private JPanel LoginPanel;
    private JPasswordField passwordField1;
    private JTextField UsernameTf;
    private JButton LoginBtn;
    private JButton ExitBtn;
    private JLabel UsernameLbl;
    private JButton ResetBtn;



    public inputForm() {
        ExitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        ResetBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                passwordField1.setText(null);
                UsernameTf.setText(null);
            }
        });
        LoginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = UsernameTf.getText();
                String password = passwordField1.getText();
                if (password.contains("@kl2018") && username.contains("LILIAN")) {

                    passwordField1.setText(null);
                    UsernameTf.setText(null);
                    System.exit(0);

                }


              else {
                    passwordField1.setText(null);
                    UsernameTf.setText(null);
                    System.out.println("ENTER VALID CREDENTIALS");
                }
                }

        });
    }

  

    public static void main(String[] args) {
        JFrame frame = new JFrame("inputForm");
        frame.setContentPane(new inputForm().LoginPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}
