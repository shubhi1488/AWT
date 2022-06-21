import java.awt.*;
class MyFrame{
Frame f;
Button b1,b2;
MyFrame(){
f=new Frame();
b1=new Button("click-1");
b2=new Button("click-2");
First f1=new First();
Second s1=new Second();
b1.addActionListener(f1);
b2.addActionListener(s1);
f.setLayout(new FlowLayout());
f.add(b1);
f.add(b2);
f.setSize(400,400);
f.setVisible(true);
}
public static void main(String ar[]){
new MyFrame();
}
}
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  import java.awt.event.*;
class First implements ActionListener{
public void actionPerformed(ActionEvent e){
System.out.println("jor se Bolo");
}
}
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  import java.awt.event.*;
class Second implements ActionListener{
public void actionPerformed(ActionEvent e){
System.out.println("Jai Mata Di");
}
}
