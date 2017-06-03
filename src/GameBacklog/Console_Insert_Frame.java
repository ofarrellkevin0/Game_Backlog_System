package GameBacklog;

import Repositories.Console_Repository;
import Repositories.Regix_Manager_Class;
import Repositories.User_Repository;
import com.sun.rowset.JdbcRowSetImpl;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Console_Insert_Frame extends javax.swing.JFrame
{

    User_Repository user;
    Regix_Manager_Class Regix = new Regix_Manager_Class();
    Console_Repository console = new Console_Repository();
    Connection connection;
    ResultSet resultset;
    JdbcRowSetImpl RowSet;
    CallableStatement callablestatement;
    String URL = "jdbc:mysql://localhost:3306/gamebacklog";
    String DB_Username = "root";
    String DB_Password = "root";

    public Console_Insert_Frame()
    {
	initComponents();
    }

    public final void Connect()
    {

	RowSet = new JdbcRowSetImpl();

	try
	{
	    connection = DriverManager.getConnection(URL, DB_Username, DB_Password);
	    RowSet.setUrl(URL);
	    RowSet.setUsername(DB_Username);
	    RowSet.setPassword(DB_Password);
	} catch (Exception ex)
	{
	    JOptionPane.showMessageDialog(null, "There was a problem connecting to the database.");
	    System.out.print(ex);
	    System.exit(0);
	}
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        InsertPanel = new javax.swing.JPanel();
        MainLabel = new javax.swing.JLabel();
        NameTextField = new javax.swing.JTextField();
        ConsoleNameLabel = new javax.swing.JLabel();
        InsertComboBox = new javax.swing.JComboBox();
        TypeLabel = new javax.swing.JLabel();
        InsertButton = new javax.swing.JButton();
        ErrorLabel = new javax.swing.JLabel();
        CancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        InsertPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        MainLabel.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        MainLabel.setText("Console Insert Panel");

        ConsoleNameLabel.setText("Console Name");

        InsertComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Atari 2600", "Atari 5200", "Atari 7800", "Atari Lynx", "ColceoVision", "Famicom Disk System", "Gameboy", "Gameboy Advance", "Gamegear", "Nintendo (NES)", "Nintendo 64", "Nintendo DS", "Sega Master System", "Sega Mega Drive", "Sony Playstation 1", "Sony Playstation 2", "Sony Playstation 3", "Sony Playstation 4", "Super Nintendo", "Xbox", "Xbox 360", "Xbox One" }));

        TypeLabel.setText("Console Type");

        InsertButton.setText("Insert");
        InsertButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                InsertButtonActionPerformed(evt);
            }
        });

        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                CancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InsertPanelLayout = new javax.swing.GroupLayout(InsertPanel);
        InsertPanel.setLayout(InsertPanelLayout);
        InsertPanelLayout.setHorizontalGroup(
            InsertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InsertPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InsertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MainLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InsertPanelLayout.createSequentialGroup()
                        .addGroup(InsertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ConsoleNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(InsertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InsertComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(ErrorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(InsertPanelLayout.createSequentialGroup()
                        .addComponent(InsertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        InsertPanelLayout.setVerticalGroup(
            InsertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InsertPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(InsertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConsoleNameLabel))
                .addGap(3, 3, 3)
                .addComponent(ErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InsertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TypeLabel)
                    .addComponent(InsertComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(InsertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InsertButton)
                    .addComponent(CancelButton))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(InsertPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(InsertPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InsertButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_InsertButtonActionPerformed
    {//GEN-HEADEREND:event_InsertButtonActionPerformed

	try
	{
	    String combo = InsertComboBox.getSelectedItem().toString();
	    String field = NameTextField.getText();
	    try
	    {
		if (NameTextField.getText() == null)
		{
		    ErrorLabel.setText("All fields must be entered to register");
		} else
		{
		    ErrorLabel.setText("");
		}

		if (Regix.Is_Characters_And_Numbers(field) == false)
		{
		    ErrorLabel.setText("Name can only have Letters and numbers (3-20)");
		} else
		{
		    ErrorLabel.setText("");
		}
	    } catch (Exception ex)
	    {
		System.out.println(ex);
	    }
	    if (field.length() >= 3 && field.length() <= 20)
	    {
		try
		{
		    Connect();
		    console.insert(connection, field, combo);
		} catch (Exception ex)
		{
		     JOptionPane.showMessageDialog(null, "Encountered a problem with the button.  Please try again later.");
		} finally
		{
		    try
		    {
			connection.close();
			Main_Frame main = new Main_Frame();
			main.setVisible(true);
			main.startup();
			this.setVisible(false);
		    } catch (Exception ex)
		    {
			System.out.print(ex);
		    }

		}
	    } else
	    {
		ErrorLabel.setText("Please Correct the fields where necessary");
	    }
	} catch (Exception ex)
	{
	    JOptionPane.showMessageDialog(null, "Encountered a problem with the Interface. Please try again later");
	    System.out.println(ex);
	}
    }//GEN-LAST:event_InsertButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_CancelButtonActionPerformed
    {//GEN-HEADEREND:event_CancelButtonActionPerformed
	Main_Frame main = new Main_Frame();
	main.setVisible(true);
	main.startup();
	this.setVisible(false);
    }//GEN-LAST:event_CancelButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JLabel ConsoleNameLabel;
    private javax.swing.JLabel ErrorLabel;
    private javax.swing.JButton InsertButton;
    private javax.swing.JComboBox InsertComboBox;
    private javax.swing.JPanel InsertPanel;
    private javax.swing.JLabel MainLabel;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JLabel TypeLabel;
    // End of variables declaration//GEN-END:variables
}
