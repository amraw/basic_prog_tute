import javax.swing.*;
import java.awt.event.*;
public class ButtonWithAction implements ActionListener {

 JButton button;
 public ButtonWithAction(){}
 public void creatFrame(){
	 JFrame frame=new JFrame();
	 frame.setTitle("Button Test");
	 frame.setSize(400,400);
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	 button=new JButton("Click Me");
	 button.addActionListener(this);
	 frame.getContentPane().add(button);
	 frame.setVisible(true);
	 
 }
 
 public void actionPerformed(ActionEvent e){
	 button.setText("Clicked");
 }
 public static void main(String []args){
	 ButtonWithAction frame=new ButtonWithAction();
		frame.creatFrame();
	}
 
}
