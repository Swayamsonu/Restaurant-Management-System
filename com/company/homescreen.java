package com.company;
import javax.swing.*; import java.awt.*;
import java.awt.event.ActionEvent; import java.awt.event.ActionListener;

public class homescreen { homescreen(){
JFrame jf1=new JFrame("Restaurant bill"); jf1.getContentPane().setBackground(Color.BLUE); jf1.setSize(600,600);
JLabel jl1,jl2,jl3,jl4,jl5,jl6,jl7; jl1=new JLabel("WELCOME"); jl1.setBounds(250,40, 100,30); jl1.setForeground(Color.RED);
jl1.setVerticalAlignment(JLabel.CENTER);


jl1.setFont(new Font("Verdana", Font.BOLD, 15)); jl2=new JLabel("Please select your item"); jl2.setBounds(200,60, 300,30); jl2.setForeground(Color.RED); jl2.setVerticalAlignment(JLabel.CENTER); jl2.setFont(new Font("Verdana", Font.BOLD, 15));
jl3=new JLabel("	"); jl3.setBounds(100,80, 500,30);
jl3.setForeground(Color.RED); jl3.setVerticalAlignment(JLabel.CENTER); jl3.setFont(new Font("Verdana", Font.BOLD, 15));


JButton veg=new JButton("FOR VEG DISHES CLICK HERE"); veg.setBounds(150,110,300, 40);
JButton nonveg=new JButton("FOR NON-VEG DISHES CLICK HERE"); nonveg.setBounds(150,160,300, 40);
JButton meals=new JButton("FOR MEALS DISHES CLICK HERE"); meals.setBounds(150,210,300, 40);
JButton exit=new JButton("EXIT"); exit.setBounds(200,260,200,30); jf1.add(jl1);
jf1.add(meals); jf1.add(exit); jf1.add(nonveg); jf1.add(veg);
jf1.add(jl2);
jf1.add(jl3); jf1.setLayout(null); jf1.setVisible(true);
nonveg.addActionListener(new ActionListener() { @Override
public void actionPerformed(ActionEvent e) { jf1.dispose();
new non_veg();

}
});
veg.addActionListener(new ActionListener() { @Override
public void actionPerformed(ActionEvent e) { jf1.dispose();
new veg();
}
});
meals.addActionListener(new ActionListener() { @Override
public void actionPerformed(ActionEvent e) { jf1.dispose();
new meal();
}
});
exit.addActionListener(new ActionListener() { @Override
public void actionPerformed(ActionEvent e) { System.exit(0);
}
});
}
}