import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class LoginFrame extends JFrame{
	Container c;
	JLabel userlable = new JLabel("Username:");
	JLabel passlable = new JLabel("Password:");
	
	//box
	JTextField user_textfield = new JTextField();
	JPasswordField pass_passfield = new JPasswordField();
	
	//button
	JButton click_btn = new JButton("Click Here");
	
	//login
	LoginFrame(){
	c = this.getContentPane();
	c.setLayout(null);
	c.setBackground(Color.pink);
	

	//user & password
	userlable.setBounds(100,50,100,40);
	passlable.setBounds(100,150,100,40);
	
	//setfont
		Font f = new Font("Arial",Font.BOLD,15);
		
	userlable.setFont(f);
	passlable.setFont(f);
	
	
	user_textfield.setBounds(250,50,150,40);
	pass_passfield.setBounds(250,150,150,40);
	
	click_btn.setBounds(100,200,150,40);
	
	c.add(userlable);
	c.add(passlable);
	c.add(user_textfield);
	c.add(pass_passfield);
	c.add(click_btn);
	}

}
public class LoginSwings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Create Frame
		LoginFrame fs = new LoginFrame();
		fs.setVisible(true);
		fs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fs.setBounds(100,50,100,50);
		
		
		
	}
}

