import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class showupp extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			showupp dialog = new showupp();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public showupp() {
		setTitle("Showupp");
		setBounds(100, 100, 732, 592);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblImage1 = new JLabel("Slika1");
        Image img2 = new ImageIcon(this.getClass().getResource("/Microsoft-Fluentui-Emoji-Flat-Party-Popper-Flat.128.png")).getImage();
        lblImage1.setIcon(new ImageIcon(img2));
        lblImage1.setBounds(554, 81, 128, 128);
        lblImage1.setOpaque(true);
        lblImage1.setBackground(new Color(102, 2, 152)); 
		contentPanel.add(lblImage1);
		
		JLabel lblImage2 = new JLabel("Slika2");
        Image img3 = new ImageIcon(this.getClass().getResource("/Dapino-Cute-Chicken-Party-chicken.128.png")).getImage();
        lblImage2.setIcon(new ImageIcon(img3));
        lblImage2.setBounds(381, 81, 128, 128);
        lblImage2.setOpaque(true);
        lblImage2.setBackground(new Color(102, 2, 152)); 
		contentPanel.add(lblImage2);
		
		JLabel lblImage3 = new JLabel("Slika3");
        Image img4 = new ImageIcon(this.getClass().getResource("/Microsoft-Fluentui-Emoji-Flat-Party-Popper-Flat.128.png")).getImage();
        lblImage3.setIcon(new ImageIcon(img4));
        lblImage3.setBounds(210, 81, 128, 128);
        lblImage3.setOpaque(true);
        lblImage3.setBackground(new Color(102, 2, 152)); 
		contentPanel.add(lblImage3);
		
		JLabel lblImage4 = new JLabel("Slika4");
        Image img = new ImageIcon(this.getClass().getResource("/Dapino-Cute-Chicken-Party-chicken.128.png")).getImage();
        lblImage4.setIcon(new ImageIcon(img));
        lblImage4.setBounds(37, 81, 128, 128);
        lblImage4.setOpaque(true);
        lblImage4.setBackground(new Color(102, 2, 152)); 
		contentPanel.add(lblImage4);
		
		JLabel lblImage5 = new JLabel("Slika6");
		Image img11 = new ImageIcon(this.getClass().getResource("/sport1.png")).getImage();
		lblImage5.setIcon(new ImageIcon(img11));
		lblImage5.setBounds(279, 283, 96, 96);
		lblImage5.setOpaque(true);
		lblImage5.setBackground(new Color(102, 2, 152)); 
		contentPanel.add(lblImage5);
		
		JLabel lblImage6 = new JLabel("slika7");
		Image img22 = new ImageIcon(this.getClass().getResource("/sport2.png")).getImage();
		lblImage6.setIcon(new ImageIcon(img22));
		lblImage6.setBounds(413, 283, 96, 96);
		lblImage6.setOpaque(true);
		lblImage6.setBackground(new Color(102, 2, 152)); 
		contentPanel.add(lblImage6);
		
		JLabel lblImage7 = new JLabel("Slika8");
		Image img44 = new ImageIcon(this.getClass().getResource("/sport3.png")).getImage();
		lblImage7.setIcon(new ImageIcon(img44));
		lblImage7.setBounds(554, 283, 96, 96);
		lblImage7.setOpaque(true);
		lblImage7.setBackground(new Color(102, 2, 152));  
		contentPanel.add(lblImage7);
		
		
		JLabel lblImage8 = new JLabel("Slika5");
		Image img55 = new ImageIcon(this.getClass().getResource("/sport4.png")).getImage();
		lblImage8.setIcon(new ImageIcon(img55));
		lblImage8.setOpaque(true);
		lblImage8.setBackground(new Color(102, 2, 152));
		lblImage8.setBounds(133, 283, 96, 96);
		contentPanel.add(lblImage8);
		
		JLabel lblImage9 = new JLabel("Slika9");
		Image img66 = new ImageIcon(this.getClass().getResource("/sport4.png")).getImage();
		lblImage9.setIcon(new ImageIcon(img66));
		lblImage9.setOpaque(true);
		lblImage9.setBackground(new Color(102, 2, 152));
		lblImage9.setBounds(133, 402, 96, 96);
		contentPanel.add(lblImage9);
		
		JLabel lblImage10 = new JLabel("Slika10");
		Image img77 = new ImageIcon(this.getClass().getResource("/sport3.png")).getImage();
		lblImage10.setIcon(new ImageIcon(img77));
		lblImage10.setOpaque(true);
		lblImage10.setBackground(new Color(102, 2, 152));
		lblImage10.setBounds(279, 402, 96, 96);
		contentPanel.add(lblImage10);
		
		JLabel lblImage11 = new JLabel("Slika11");
		Image img88 = new ImageIcon(this.getClass().getResource("/sport2.png")).getImage();
		lblImage11.setIcon(new ImageIcon(img88));
		lblImage11.setOpaque(true);
		lblImage11.setBackground(new Color(102, 2, 152));
		lblImage11.setBounds(413, 402, 96, 96);
		contentPanel.add(lblImage11);
		
		JLabel lblImage12 = new JLabel("Slika12");
		Image img99 = new ImageIcon(this.getClass().getResource("/sport1.png")).getImage();
		lblImage12.setIcon(new ImageIcon(img99));
		lblImage12.setOpaque(true);
		lblImage12.setBackground(new Color(102, 2, 152));
		lblImage12.setBounds(554, 402, 96, 96);
		contentPanel.add(lblImage12);
		
		JLabel lbleEents = new JLabel("Events near you");
		lbleEents.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		lbleEents.setBounds(10, 39, 165, 32);
		contentPanel.add(lbleEents);
		
		JComboBox comboBoxFilteri = new JComboBox();
		comboBoxFilteri.setModel(new DefaultComboBoxModel(new String[] {"Sport\t", "Koncerti", "Predstave", ""}));
		comboBoxFilteri.setBounds(37, 249, 128, 23);
		contentPanel.add(comboBoxFilteri);
		
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		{
			JMenuBar menuBar = new JMenuBar();
			setJMenuBar(menuBar);
		}
	}
}
