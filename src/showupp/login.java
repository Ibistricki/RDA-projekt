
package showupp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFielduUsername;
	private JTextField textFieldPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public login() {
		setTitle("Sign up");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUsername.setBounds(138, 11, 71, 28);
		contentPane.add(lblUsername);
		
		textFielduUsername = new JTextField();
		textFielduUsername.setBounds(138, 41, 144, 28);
		contentPane.add(textFielduUsername);
		textFielduUsername.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPassword.setBounds(138, 89, 71, 28);
		contentPane.add(lblPassword);
		
		textFieldPassword = new JTextField();
		textFieldPassword.setColumns(10);
		textFieldPassword.setBounds(138, 119, 144, 28);
		contentPane.add(textFieldPassword);
		
		JButton btnNewButton = new JButton("Sign up");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String Username = textFieldUsername.getText();
			String Role = (String) comboBoxRole.getSelectedItem();
			String Password = textAreaPassword.getText();
			
			try {						
		 	  Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			  Connection conn = DriverManager.getConnection 
("jdbc:mysql://ucka.veleri.hr/?" +
 "user=ibistricki&password=11");
			  
			  String sql = "INSERT INTO Roles VALUES(NULL,?,?,?,?);";
			  PreparedStatement stmt = conn.prepareStatement(sql);
			  stmt.setString(1,Username);
			  stmt.setString(2, Password);
			  stmt.setString(4, Role);
  			  stmt.execute();
							
			  conn.close();
						
			  textFieldUsername.setText("");
			  textFieldPassword.setText("");
			  comboBoxRole.setSelectedIndex(-1);
							
			} catch(Exception ex) {
			  JOptionPane.showMessageDialog(null, 
   ex.getMessage(),"Greška", JOptionPane.ERROR_MESSAGE);

			}
		}
	});
		btnNewButton.setBounds(168, 214, 81, 23);
		contentPane.add(btnNewButton);
		
		JComboBox<String> comboBoxRole = new JComboBox<>();
		comboBoxRole.setModel(new DefaultComboBoxModel<>(new String[] {"Admin", "Posjetitelj", "Organizator"}));
		comboBoxRole.setBounds(149, 181, 114, 22);
		contentPane.add(comboBoxRole);

		
		JLabel lblRole = new JLabel("Role:");
		lblRole.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRole.setBounds(138, 152, 101, 28);
		contentPane.add(lblRole);
	}
}
