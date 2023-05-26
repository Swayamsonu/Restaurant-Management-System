package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class bill {
    int p1=0,p2=0,p3=0;
    bill(int flag1,int flag2,int flag3,String qty1,String qty2,String qty3){
        JFrame jf=new JFrame("Restaurant bill");
        jf.setSize(600,600);
        jf.setLayout(null);
        jf.setVisible(true);
        JLabel jl=new JLabel("FILL THE DETAILS");
        jl.setBounds(220,10,200,20);
        jl.setFont(new Font("Verdana", Font.BOLD, 15));

        JLabel jl2=new JLabel("---------------------------------------");
        jl2.setForeground(Color.RED);
        jl.setForeground(Color.RED);
        jl2.setBounds(220,20,200,20);
        JLabel orderid=new JLabel("Order id:");
        JLabel cusname=new JLabel("Customer Name:");
        JLabel cusPh=new JLabel("phone number:");
        JLabel cusemail=new JLabel("Email id:");
        JLabel purchasedate=new JLabel("order date:");
        purchasedate.setBounds(120,140,200,20);
        cusname.setBounds(120,50,200,20);
        cusemail.setBounds(120,80,200,20);
        cusname.setFont(new Font("Verdana", Font.BOLD, 13));
        cusemail.setFont(new Font("Verdana", Font.BOLD, 13));
        cusPh.setBounds(120,110,200,20);
        orderid.setBounds(120,170,200,20);
        cusPh.setFont(new Font("Verdana", Font.BOLD, 13));
        orderid.setFont(new Font("Verdana", Font.BOLD, 13));
        purchasedate.setFont(new Font("Verdana", Font.BOLD, 13));
       JTextField oi=new JTextField();
        JTextField cn=new JTextField();
        JTextField cm=new JTextField();
        JTextField cp=new JTextField();
        JTextField cd=new JTextField();
       oi.setBounds(240,170,200,20);
        cn.setBounds(240,50,200,20);
        cm.setBounds(240,80,200,20);
        cp.setBounds(240,110,200,20);
        cd.setBounds(240,140,200,20);
        JButton bill=new JButton("Generate Bill");
        JButton back=new JButton("Back to home screen");
        back.setBounds(250,260,170,30);
        bill.setBounds(250,220,170,30);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jf.dispose();
                new homescreen();
            }
        });

        bill.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String orderid=oi.getText();
                String cusnamee= cn.getText();
                String cusemail=cm.getText();
                String cusph=cp.getText();
                String date=cd.getText();
                jf.dispose();
                JFrame jf1=new JFrame("Resturant Bill");
                JLabel invoice=new JLabel("INVOICE");
                JLabel underinvoice=new JLabel("--------");
                JLabel underline=new JLabel("--------------------------");
                JLabel customername=new JLabel("Customer Name:");
                JLabel customeremail=new JLabel("Email Id:");
                JLabel customerphone=new JLabel("Phone number:");
                JLabel orderdate=new JLabel("Order Id:");
                JLabel orderidd=new JLabel("Order date:");
                JLabel item=new JLabel("ITEM");
                JLabel price=new JLabel("PRICE");
                JLabel underlin=new JLabel("--------");
                JLabel qtyunderline=new JLabel("------");
                JLabel gst=new JLabel("GST:11");
                JLabel item1=new JLabel();
                JLabel item2=new JLabel();
                JLabel item3=new JLabel();
                JLabel amouttobepaid=new JLabel();
                JLabel jqty=new JLabel("QTY");
                JLabel jqty1=new JLabel();
                JLabel jqty2=new JLabel();
                JLabel jqty3=new JLabel();
                JLabel price1=new JLabel();
                JLabel price2=new JLabel();
                JLabel price3=new JLabel();
                JButton gotohome=new JButton("Go to homescreen");
                JButton exit=new JButton("EXIT");
                JLabel cname=new JLabel();
                JLabel cemail=new JLabel();
                JLabel cphone=new JLabel();
                JLabel oid=new JLabel();
                JLabel odate=new JLabel();
                JLabel total=new JLabel("Total amount:");
                JLabel totalprice=new JLabel();
                JLabel amountpaid=new JLabel("Total amount to be paid:");
                cname.setText(cusnamee);
                cemail.setText(cusemail);
                cphone.setText(cusph);
                oid.setText(orderid);
                odate.setText(date);
                underline.setBounds(240,20,150,20);
                gotohome.setBounds(190,420,200,30);
                exit.setBounds(190,470,200,30);
                amountpaid.setBounds(225,370,200,20);
                amouttobepaid.setBounds(400,370,200,20);
                totalprice.setBounds(400,330,100,20);
                total.setBounds(300,330,100,20);
                price.setBounds(380,200,100,20);
                underinvoice.setBounds(380,210,100,20);
                price1.setBounds(380,230,100,20);
                price2.setBounds(380,260,100,20);
                price3.setBounds(380,290,100,20);
                jqty.setBounds(270,200,100,20);
                qtyunderline.setBounds(270,210,100,20);
                gst.setBounds(345,345,100,20);
                jqty1.setBounds(275,230,100,20);
                jqty2.setBounds(275,260,100,20);
                jqty3.setBounds(275,290,100,20);
                invoice.setBounds(240,10,100,20);
                customername.setBounds(140,40,150,20);
                customeremail.setBounds(140,70,150,20);
                customerphone.setBounds(140,100,150,20);
                orderdate.setBounds(140,130,150,20);
                orderidd.setBounds(140,160,150,20);
                cname.setBounds(270,40,200,20);
                cemail.setBounds(270,70,200,20);
                cphone.setBounds(270,100,200,20);
                oid.setBounds(270,130,200,20);
                odate.setBounds(270,160,200,20);
                item.setBounds(140,200,100,20);
                item1.setBounds(140,230,100,20);
                item2.setBounds(140,260,100,20);
                item3.setBounds(140,290,100,20);
                underlin.setBounds(140,210,50,20);
                invoice.setFont(new Font("Verdana", Font.BOLD, 20));
                customername.setFont(new Font("Verdana", Font.BOLD, 13));
                total.setFont(new Font("Verdana", Font.BOLD, 13));
                amountpaid.setFont(new Font("Verdana", Font.BOLD, 13));
                gst.setFont(new Font("Verdana", Font.BOLD, 13));
                customeremail.setFont(new Font("Verdana", Font.BOLD, 13));
                customerphone.setFont(new Font("Verdana", Font.BOLD, 13));
                orderdate.setFont(new Font("Verdana", Font.BOLD, 13));
                orderidd.setFont(new Font("Verdana", Font.BOLD, 13));
                invoice.setForeground(Color.BLACK);
                jf1.setSize(600,600);
                if(flag1==1){
                    item1.setText("CHICKEN");
                    jqty1.setText(qty1);
                    int tempqty1=Integer.parseInt(qty1);
                    p1=tempqty1*80;
                    String setp1=String.valueOf(p1);
                    price1.setText(setp1);
                }
                if(flag2==1){
                    item2.setText("MUTTON");
                    jqty2.setText(qty2);
                    System.out.println(qty2);
                    int tempqty2=Integer.parseInt(qty2);
                    p2=tempqty2*140;
                    String setp2=String.valueOf(p2);
                    price2.setText(setp2);
                }
                if(flag3==1){
                    item3.setText("CHILLI CHIKEN");
                    jqty3.setText(qty3);
                    int tempqty3=Integer.parseInt(qty3);
                    p3=tempqty3*100;
                    String setp3=String.valueOf(p3);
                    price3.setText(setp3);
                }
                if(flag1==2){
                    item1.setText("PANNER");
                    jqty1.setText(qty1);
                    int tempqty1=Integer.parseInt(qty1);
                    p1=tempqty1*80;
                    String setp1=String.valueOf(p1);
                    price1.setText(setp1);
                }
                if(flag2==2){
                    item2.setText("MUSHROOM");
                    jqty2.setText(qty2);
                    System.out.println(qty2);
                    int tempqty2=Integer.parseInt(qty2);
                    p2=tempqty2*140;
                    String setp2=String.valueOf(p2);
                    price2.setText(setp2);
                }
                if(flag3==2){
                    item3.setText("CHILLI PANNER");
                    jqty3.setText(qty3);
                    int tempqty3=Integer.parseInt(qty3);
                    p3=tempqty3*100;
                    String setp3=String.valueOf(p3);
                    price3.setText(setp3);
                }
                if(flag1==3){
                    item1.setText("VEG THALI");
                    jqty1.setText(qty1);
                    int tempqty1=Integer.parseInt(qty1);
                    p1=tempqty1*90;
                    String setp1=String.valueOf(p1);
                    price1.setText(setp1);

                }
                if(flag2==3){
                    item2.setText("NON VEG THALI");
                    jqty2.setText(qty2);
                    System.out.println(qty2);
                    int tempqty2=Integer.parseInt(qty2);
                    p2=tempqty2*160;
                    String setp2=String.valueOf(p2);
                    price2.setText(setp2);

                }
                if(flag3==3){
                    item3.setText("CHINESE THALI");
                    jqty3.setText(qty3);
                    int tempqty3=Integer.parseInt(qty3);
                    p3=tempqty3*120;
                    String setp3=String.valueOf(p3);
                    price3.setText(setp3);
                }
                int finalprice=p1+p2+p3;
                String finalstrprice=String.valueOf(finalprice);
                int gstadd=Integer.parseInt(finalstrprice);
                int gstadding=gstadd+11;
                String gstaddedstr=String.valueOf(gstadding) ;
                totalprice.setText(finalstrprice);
                amouttobepaid.setText(gstaddedstr);
                gotohome.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        jf1.dispose();
                        new homescreen();
                    }
                });
                exit.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.exit(0);
                    }
                });
                jf1.setLayout(null);
                jf1.add(gst);
                jf1.add(exit);
                jf1.add(gotohome);
                jf1.setVisible(true);
                jf1.add(amountpaid);
                jf1.add(total);
                jf1.add(qtyunderline);
                jf1.add(totalprice);
                jf1.add(invoice);
                jf1.add(amouttobepaid);
                jf1.add(underline);
                jf1.add(customername);
                jf1.add(orderdate);
                jf1.add(orderidd);
                jf1.add(customeremail);
                jf1.add(customerphone);
                jf1.add(cname);
                jf1.add(cemail);
                jf1.add(cphone);
                jf1.add(oid);
                jf1.add(odate);
                jf1.add(item);
                jf1.add(item1);
                jf1.add(item2);
                jf1.add(item3);
                jf1.add(underlin);
                jf1.add(jqty);
                jf1.add(jqty1);
                jf1.add(jqty2);
                jf1.add(jqty3);
                jf1.add(underinvoice);
                jf1.add(price);
                jf1.add(price1);
                jf1.add(price2);
                jf1.add(price3);
            }
        });
        jf.add(jl);
        jf.add(bill);
        jf.add(cd);
        jf.add(cp);
        jf.add(jl2);
        jf.add(cn);
        jf.add(cusname);
        jf.add(purchasedate);
        jf.add(cusPh);
        jf.add(back);
        jf.add(cusemail);
        jf.add(oi);
        jf.add(orderid);
        jf.add(cm);

    }
}