package showupp;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.sql.*;
import java.awt.Color;
import java.text.SimpleDateFormat;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DlgIspisEvenata extends JDialog {

    private static final long serialVersionUID = 1L;
    private JPanel contentPanel = new JPanel();
    private JTable eventTable;
    private DefaultTableModel tableModel;
    private JComboBox<String> filterComboBox;

    public static void main(String[] args) {
        try {
            DlgIspisEvenata dialog = new DlgIspisEvenata();
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public DlgIspisEvenata() {
        setBounds(100, 100, 1057, 712);
        getContentPane().setLayout(new BorderLayout());
        contentPanel.setBackground(Color.WHITE);
        contentPanel.setLayout(null);
        getContentPane().add(contentPanel, BorderLayout.CENTER);

        JLabel lblNewLabel = new JLabel("Nadolazeći Eventi");
        lblNewLabel.setBounds(390, 11, 283, 114);
        lblNewLabel.setForeground(new Color(128, 0, 255));
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
        contentPanel.add(lblNewLabel);

        // Dodavanje tablice
        tableModel = new DefaultTableModel(new Object[]{"Naziv Eventa", "Datum Događanja", "Tip Eventa"}, 0);
        eventTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(eventTable);
        scrollPane.setBounds(20, 160, 1000, 460);
        contentPanel.add(scrollPane);

        //kreiranje filtera 
        filterComboBox = new JComboBox<>();
        filterComboBox.setModel(new DefaultComboBoxModel<>(new String[] {"Svi", "Festival", "Komedija", "Techno", "Koncert", "Lokalni"}));
        filterComboBox.setBounds(20, 120, 150, 30);
        filterComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                selectIspisEvenata();
            }
        });
        contentPanel.add(filterComboBox);

        JPanel buttonPane = new JPanel();
        buttonPane.setBackground(new Color(255, 255, 255));
        buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
        getContentPane().add(buttonPane, BorderLayout.SOUTH);

        JButton okButton = new JButton("OK");
        okButton.setActionCommand("OK");
        buttonPane.add(okButton);
        getRootPane().setDefaultButton(okButton);

        JButton cancelButton = new JButton("Cancel");
        cancelButton.setActionCommand("Cancel");
        buttonPane.add(cancelButton);

        selectIspisEvenata();
    }

    void selectIspisEvenata() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://ucka.veleri.hr/ibistricki?" +
                    "user=ibistricki&password=11");

            // Odabir filtera
            String selectedFilter = filterComboBox.getSelectedItem().toString();
            String sql = "SELECT * FROM Event";
            if (!selectedFilter.equals("Svi")) {
                sql += " WHERE tip_eventa = ?";
            }

            PreparedStatement stmt = conn.prepareStatement(sql);
            if (!selectedFilter.equals("Svi")) {
                stmt.setString(1, selectedFilter);
            }

            ResultSet rs = stmt.executeQuery();

            SimpleDateFormat dbDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            SimpleDateFormat displayDateFormat = new SimpleDateFormat("dd.MM.yyyy");

            tableModel.setRowCount(0);  

            while (rs.next()) {
                String nazivEventa = rs.getString("naziv_eventa");
                String datumDogadjanja = rs.getString("vrijeme_eventa");
                String tipEventa = rs.getString("tip_eventa");

                java.util.Date date = dbDateFormat.parse(datumDogadjanja);
                String formattedDate = displayDateFormat.format(date);

                
                tableModel.addRow(new Object[]{nazivEventa, formattedDate, tipEventa});
            }

            conn.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Greška", JOptionPane.ERROR_MESSAGE);
        }
    }
}
