import java.awt.*;
import java.awt.event.*;
class Event implements ActionListener{
Frame f;
Button b1,b2;
Event(){
f=new Frame();
b1=new Button("click-1");
b2=new Button("click-2");
b1.addActionListener(this);
b2.addActionListener(this);
f.setLayout(new FlowLayout());
f.add(b1);
f.add(b2);
f.setSize(400,400);
f.setVisible(true);
}
public static void main(String ar[]){
Event e=new Event();
}
public void actionPerformed(ActionEvent e){
if(e.getSource()==b1)
System.out.println("jor se bolo");
else
System.out.println("jai mata di");
}
}