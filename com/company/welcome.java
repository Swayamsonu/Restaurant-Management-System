package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class welcome {
    welcome()  {
        JFrame jf   = new JFrame("WELCOME TO OUR RESTAURANT");
        JLabel jl   = new JLabel("WELCOME TO OUR RESTAURANT");
        jf.getContentPane().setBackground(Color.BLUE);
        JButton jb   = new JButton("Click here to continue");
        JButton jb1   = new JButton("EXIT");
        jf.setSize(600,  600);

        jl.setBounds(140,  40 , 400 , 100);
        jb.setBounds(200,  150 , 200 , 30);
        jb1.setBounds(200,  190 , 200 , 30);
        jl.setFont(new Font("Verdana", Font.BOLD, 20));
        jl.setForeground(Color.green);

        jf.setLayout(null);
        jf.setVisible(true);
        jf.add(jl);
        jf.add(jb1);
        jf.add(jb);
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jf.dispose();
                new homescreen();
            }
        });
        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }}