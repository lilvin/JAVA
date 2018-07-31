package com.Forms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class dataInput {
    private JButton button1;
    private JPanel panel1;


    public dataInput() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"hello");
            }
        });
    }

    public static void main(String[] args){
        JFrame frame=new JFrame("App");
        frame.setContentPane(new dataInput().panel1);
       //frame.getDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
                }
                }
