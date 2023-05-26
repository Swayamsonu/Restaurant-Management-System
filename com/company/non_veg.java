package com.company;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class non_veg {
     int flag1,flag2=0,flag3=0;
    non_veg(){
        JFrame jf2=new JFrame("Restaurant bill");
        jf2.setSize(600,600);
        jf2.setLayout(null);
        jf2.setVisible(true);
        JLabel jl=new JLabel("SELECT YOUR ITEM");
        JLabel jl1=new JLabel("----------------------------------------------------");
        jl.setFont(new Font("Verdana", Font.BOLD, 18));
        jl.setBounds(240,20,300,30);

        jl1.setBounds(235,30,300,30);
        JCheckBox checkBox1 = new JCheckBox("CHIKEN(RS-80 per plate enter QTY):-");
        JCheckBox checkBox2 = new JCheckBox("MUTTON(RS-140 per plate QTY):-");
        JCheckBox checkBox3=new JCheckBox("Chilli chiken(Rs-100 per plate QTY):-");

        jl1.setForeground(Color.RED);
        jl.setForeground(Color.red);

        JButton jb1=new JButton("BACK");
        jb1.setBounds(240,180,180,30);

        JTextField jf1=new JTextField("0");
        JTextField jf=new JTextField("0");
        JTextField chiilichiken=new JTextField("0");
        JButton jb=new JButton("Proceed to checkout");
        jb.setBounds(240,130,180,30);
        chiilichiken.setBounds(470,100,50,20);
        jf.setBounds(470, 50,50,20);
        jf1.setBounds(470, 75,50,20);

        checkBox1.setFont(new Font("Verdana", Font.BOLD, 14));
        checkBox1.setBounds(120,50, 350,20);

        checkBox2.setFont(new Font("Verdana", Font.BOLD, 14));
        checkBox2.setBounds(120,75, 350,20);
        checkBox3.setBounds(120,100,350,20);
        checkBox3.setFont(new Font("Verdana", Font.BOLD, 14));
        JLabel jl4=new JLabel("sd");
        jl4.setBounds(230,100,300,20);
        checkBox1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                String qty=jf.getText();
                int qty1=Integer.parseInt(qty);
                int price=qty1*80;
                //String pricee=
                if(e.getStateChange()==1){
                    flag1=1;
                }else{
                    flag1=0;
                }

            }
        });
        checkBox2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
               //String qty=jf1.getText();
                //int qty1=Integer.parseInt(qty);
                //int price=qty1*80;
                //String pricee=
                if(e.getStateChange()==1){
                    flag2=1;
                }else{
                    flag2=0;
                }

            }
        });
        checkBox3.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                String qty=chiilichiken.getText();
                int qty1=Integer.parseInt(qty);
                int price=qty1*80;
                //String pricee=
                if(e.getStateChange()==1){
                    flag3=1;
                }else{
                    flag3=0;
                }

            }
        });
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jf2.dispose();
                String qty1,qty2,qty3;
                qty1=jf.getText();


                qty2=jf1.getText();
                qty3=chiilichiken.getText();





                new bill(flag1,flag2,flag3,qty1,qty2,qty3);
            }
        });
        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jf2.dispose();
                new homescreen();
            }
        });
        jf2.add(jl1);
        jf2.add(jl);
        jf2.add(jl4);
        jf2.add(jf);
        jf2.add(jf1);
        jf2.add(chiilichiken);
        jf2.add(checkBox3);
        jf2.add(jb);
        jf2.add(jb1);

        jf2.add(checkBox1);
        jf2.add(checkBox2);

    }

}