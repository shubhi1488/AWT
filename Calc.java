import java.awt.*;
import java.awt.event.*;
class Calc implements ActionListener{
Frame f;
TextArea t1,t2,t3;
Button b1,b2,b3,b4;
Panel p;
Calc(){
f=new Frame("My Calc");
t1=new TextArea();
t2=new TextArea();
t3=new TextArea();
p=new Panel();
b1=new Button("+");
b2=new Button("-");
b3=new Button("*");
b4=new Button("/");
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
f.setLayout(new GridLayout(4,1));
p.setLayout(new GridLayout(1,4));
p.add(b1);
p.add(b2);
p.add(b3);
p.add(b4);
f.add(t1);
f.add(t2);
f.add(p);
f.add(t3);
f.setSize(300,300);
f.setVisible(true);
}
public static void main(String ar[]){
Calc c=new Calc();
}
public void actionPerformed(ActionEvent e){
float x,y,z;
x=Float.parseFloat(t1.getText());
y=Float.parseFloat(t2.getText());
if(e.getSource()==b1)
z=x+y;
else if(e.getSource()==b2)
z=x-y;
else if(e.getSource()==b3)
z=x*y;
else
z=x/y;
String a=""+z;
t3.setText(a);
}
}
