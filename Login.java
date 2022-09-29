package login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frame;
	private JTextField Uname;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username :");
		lblNewLabel.setBounds(75, 62, 77, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password :");
		lblNewLabel_1.setBounds(75, 105, 77, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		Uname = new JTextField();
		Uname.setBounds(189, 64, 96, 19);
		frame.getContentPane().add(Uname);
		Uname.setColumns(10);

		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			private JLabel textField;
			private JLabel passwordField;

			public void actionPerformed(ActionEvent e) {
				textField = null;
				String uname=textField.getText();
				passwordField = null;
				String pwd=passwordField.getText();
				if(uname.equals("Username")&& pwd.equals("Password")) {
					JOptionPane.showMessageDialog(frame, "You are Logged in");}
				else {
					JOptionPane.showMessageDialog(frame, "Invalid username or password");
				}
			}
		});
		btnNewButton.setBounds(136, 158, 85, 21);
		frame.getContentPane().add(btnNewButton);
		JPasswordField passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(189, 105, 96, 19);
		frame.getContentPane().add(passwordField_1);
	}
}
