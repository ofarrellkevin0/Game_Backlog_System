package GameBacklog;

import Repositories.Console_Repository;
import SQLConnection.SQLConnectionClass;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

import Regix.Regix_Manager_Class;

@SuppressWarnings("serial")
public class Console_Update_Frame extends javax.swing.JFrame {

	SQLConnectionClass DB_Connection = new SQLConnectionClass();
	Regix_Manager_Class Regix = new Regix_Manager_Class();
	Console_Repository console = new Console_Repository();
	
	public static String name;
	public static String type;
	public static int ID;

	Connection connection;
	ResultSet resultset;
	CallableStatement callablestatement;
	

	public Console_Update_Frame() {
		initComponents();
		centreWindow(this);
	}

	public void pass(int ID, String name, String type) {
		Console_Update_Frame.ID = ID;
		Console_Update_Frame.name = name;
		Console_Update_Frame.type = type;
		NameTextField.setText(Console_Update_Frame.name);
		UpdateComboBox.setSelectedItem(Console_Update_Frame.type);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		UpdatePanel = new javax.swing.JPanel();
		MainLabel = new javax.swing.JLabel();
		NameTextField = new javax.swing.JTextField();
		ConsoleNameLabel = new javax.swing.JLabel();
		UpdateComboBox = new javax.swing.JComboBox();
		TypeLabel = new javax.swing.JLabel();
		UpdateButton = new javax.swing.JButton();
		ErrorLabel = new javax.swing.JLabel();
		CancelButton = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		UpdatePanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

		MainLabel.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
		MainLabel.setText("Console Update Panel");

		ConsoleNameLabel.setText("Console Name");

		UpdateComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Atari 2600", "Atari 5200",
				"Atari 7800", "Atari Lynx", "ColceoVision", "Famicom Disk System", "Gameboy", "Gameboy Advance",
				"Gamegear", "Nintendo (NES)", "Nintendo 64", "Nintendo DS", "Sega Master System", "Sega Mega Drive",
				"Sony Playstation 1", "Sony Playstation 2", "Sony Playstation 3", "Sony Playstation 4",
				"Super Nintendo", "Xbox", "Xbox 360", "Xbox One" }));

		TypeLabel.setText("Console Type");

		UpdateButton.setText("Update");
		UpdateButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				UpdateButtonActionPerformed(evt);
			}
		});

		CancelButton.setText("Cancel");
		CancelButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				CancelButtonActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout UpdatePanelLayout = new javax.swing.GroupLayout(UpdatePanel);
		UpdatePanel.setLayout(UpdatePanelLayout);
		UpdatePanelLayout.setHorizontalGroup(UpdatePanelLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(UpdatePanelLayout.createSequentialGroup().addContainerGap().addGroup(UpdatePanelLayout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(MainLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UpdatePanelLayout.createSequentialGroup()
								.addGroup(UpdatePanelLayout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(TypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(ConsoleNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(UpdatePanelLayout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(NameTextField, javax.swing.GroupLayout.Alignment.TRAILING,
												javax.swing.GroupLayout.PREFERRED_SIZE, 150,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(UpdateComboBox, javax.swing.GroupLayout.Alignment.TRAILING,
												javax.swing.GroupLayout.PREFERRED_SIZE, 150,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addComponent(ErrorLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(UpdatePanelLayout.createSequentialGroup()
								.addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(CancelButton, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addContainerGap()));
		UpdatePanelLayout.setVerticalGroup(UpdatePanelLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(UpdatePanelLayout.createSequentialGroup().addContainerGap().addComponent(MainLabel)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(UpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(ConsoleNameLabel))
						.addGap(3, 3, 3)
						.addComponent(ErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(UpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(TypeLabel).addComponent(UpdateComboBox,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(UpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(UpdateButton).addComponent(CancelButton))
						.addContainerGap(7, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap().addComponent(UpdatePanel,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(UpdatePanel, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt)// GEN-FIRST:event_UpdateButtonActionPerformed
	{// GEN-HEADEREND:event_UpdateButtonActionPerformed

		try {
			String combo = UpdateComboBox.getSelectedItem().toString();
			String field = NameTextField.getText();
			try {
				if (NameTextField.getText() == null) {
					ErrorLabel.setText("All fields must be entered to register");
				} else {
					ErrorLabel.setText("");
				}

				if (Regix.Is_Characters_And_Numbers(field) == false) {
					ErrorLabel.setText("Name can only have Letters and numbers (3-20)");
				} else {
					ErrorLabel.setText("");
				}
			} catch (Exception ex) {
				System.out.println(ex);
			}
			if (field.length() >= 3 && field.length() <= 20) {
				try {
					connection = DB_Connection.Connect();
					console.update(connection, ID, field, combo);
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null,
							"Encountered a problem with the button.  Please try again later.");
				} finally {
					try {
						connection.close();
						Main_Frame main = new Main_Frame();
						main.setVisible(true);
						main.startup();
						this.setVisible(false);
					} catch (Exception ex) {
						System.out.print(ex);
					}

				}
			} else {
				ErrorLabel.setText("Please Correct the fields where necessary");
			}
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Encountered a problem with the Interface. Please try again later");
			System.out.println(ex);
		}
	}// GEN-LAST:event_UpdateButtonActionPerformed

	private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt)// GEN-FIRST:event_CancelButtonActionPerformed
	{// GEN-HEADEREND:event_CancelButtonActionPerformed
		Main_Frame main = new Main_Frame();
		main.setVisible(true);
		main.startup();
		this.setVisible(false);
	}// GEN-LAST:event_CancelButtonActionPerformed

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton CancelButton;
	private javax.swing.JLabel ConsoleNameLabel;
	private javax.swing.JLabel ErrorLabel;
	private javax.swing.JLabel MainLabel;
	private javax.swing.JTextField NameTextField;
	private javax.swing.JLabel TypeLabel;
	private javax.swing.JButton UpdateButton;
	@SuppressWarnings("rawtypes")
	private javax.swing.JComboBox UpdateComboBox;
	private javax.swing.JPanel UpdatePanel;
	// End of variables declaration//GEN-END:variables

	public static void centreWindow(Window frame) {
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
		int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
		frame.setLocation(x, y);
	}
}
