import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private String id = "hansang";
	private String password = "123456";
	private JTextField tf;
	private JPasswordField pf;
	private JButton login;
	JLabel loginText = new JLabel();
	private boolean isLogin = false;

 public Login() {
  JPanel idPanel = new JPanel();
  JPanel passPanel = new JPanel();
  tf = new JTextField(12);
  pf = new JPasswordField(10);
  loginText.setForeground(Color.RED);
  
  JLabel idLabel = new JLabel("ID : ");
  JLabel passLabel = new JLabel("PASSWORD : ");
  login = new JButton("LOGIN");
  login.addActionListener(this);
  
  idPanel.add(idLabel);
  idPanel.add(tf);

  passPanel.add(passLabel);
  passPanel.add(pf);

  this.add(idPanel);
  this.add(passPanel);
  this.add(login);
  this.add(loginText);
  
  setLayout(new FlowLayout());

  setTitle("LOGIN");
  setSize(300, 200);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  setVisible(true);
 }

 @SuppressWarnings("deprecation")
@Override
 public void actionPerformed(ActionEvent e) {
  // TODO Auto-generated method stub
  if (e.getSource() == login) {
   try {
    if (id.equals(tf.getText()) && password.equals(pf.getText()))
     isLogin = true;
    else
     isLogin = false;
    if (isLogin) {
     loginText.setText("Successfully logged in. Hello Hansang");
     new Test();
    } else {
     loginText.setText("Wrong ID or password");
    }
   } catch (Exception e1) {
    System.out.println("false");
   }
  }
 }

 public static void main(String[] args) {

	 new Login();
 }
}