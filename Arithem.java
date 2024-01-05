import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Arithem extends JApplet implements ActionListener{
String str;
JLabel jl1,jl2;
JTextField jtf1,jtf2,jtf3;
JButton jbt1,jbt2;
int num1,num2,res;

public void init()
{
Container contentPane = getContentPane();
contentPane.setLayout(new FlowLayout());
jl1=new JLabel("Enter first number : ");
jl2=new JLabel("Enter second number : ");
jtf1=new JTextField(10);
jtf2=new JTextField(10);
jtf3=new JTextField(10);
jbt1=new JButton("GET RESULT");
jbt2=new JButton("RESET");
contentPane.add(jl1);
contentPane.add(jtf1);
contentPane.add(jl2);
contentPane.add(jtf2);
contentPane.add(jtf3);
contentPane.add(jbt1);
contentPane.add(jbt2);
jbt1.addActionListener(this);
jbt2.addActionListener(this);
}


public void actionPerformed(ActionEvent ae)
{
num1=Integer.parseInt(jtf1.getText());
num2=Integer.parseInt(jtf2.getText());
res=num1+num2;
str=ae.getActionCommand();
if(str.equals("GET RESULT"))
{
jtf3.setText(String.valueOf(res));
}
if(str.equals("RESET"))
{
jtf1.setText("");
jtf2.setText("");
jtf3.setText("");
}
repaint();
}
}

//<applet code="Arithem.class" width=300 height=300></applet>