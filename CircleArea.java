import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class CircleArea extends JApplet implements ActionListener
{
String str;
JButton jb1;
JLabel jl1;
JTextField jtf1,jtf2;
float pi=3.14f;
float area,radius;
public void init()
{
Container contentPane=getContentPane();
contentPane.setLayout(new FlowLayout());
jl1=new JLabel("Enter radius : ");
jtf1=new JTextField(10);
jtf2=new JTextField(10);
jb1=new JButton("Result");
contentPane.add(jl1);
contentPane.add(jtf1);
contentPane.add(jb1);
contentPane.add(jtf2);
jb1.addActionListener(this);
}

public void actionPerformed(ActionEvent ae)
{
radius=Float.parseFloat(jtf1.getText());
area=pi*radius*radius;
str=ae.getActionCommand();
if(str.equals("Result")){
jtf2.setText(String.valueOf(area));
repaint();
}
}
}

//<applet code="CircleArea.class" width="300" height="300"></applet>