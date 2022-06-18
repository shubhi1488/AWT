/*
Creating the basic frame by inheriting the Frame class.
*/
import java.awt.*;
class AWTExample1 extends Frame{
AWTExample1(){
Button b=new Button("ClickMe");
b.setBounds(30,100,80,20);
add(b);
setSize(400,400);
setLayout(null);
setTitle("New Frame");
setVisible(true);
}
public static void main(String ar[]){
AWTExample1 obj=new AWTExample1();
}
}
