package GameBacklog;

import Repositories.Game_Repository;
import Repositories.User_Repository;
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
public class Game_Update_Frame extends javax.swing.JFrame {
	SQLConnectionClass DB_Connection = new SQLConnectionClass();
	Regix_Manager_Class Regix = new Regix_Manager_Class();
	Game_Repository game = new Game_Repository();

	public static String name;
	public static String type;
	public static String status;
	public static int ID;

	User_Repository user;
	Connection connection;
	ResultSet resultset;
	CallableStatement callablestatement;

	public Game_Update_Frame() {
		initComponents();
		centreWindow(this);
	}

	public void pass(int ID, String name, String type, String Status) {
		Game_Update_Frame.ID = ID;
		Game_Update_Frame.name = name;
		Game_Update_Frame.type = type;
		Game_Update_Frame.status = Status;
		NameTextField.setText(Game_Update_Frame.name);
		UpdateCombo.setSelectedItem(Game_Update_Frame.type);
		StatusCombo.setSelectedItem(Game_Update_Frame.status);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		InsertPanel = new javax.swing.JPanel();
		MainLabel = new javax.swing.JLabel();
		NameTextField = new javax.swing.JTextField();
		GameNameLabel = new javax.swing.JLabel();
		UpdateCombo = new javax.swing.JComboBox();
		TypeLabel = new javax.swing.JLabel();
		InsertButton = new javax.swing.JButton();
		ErrorLabel = new javax.swing.JLabel();
		CancelButton = new javax.swing.JButton();
		StatusCombo = new javax.swing.JComboBox();
		jLabel1 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		InsertPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

		MainLabel.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
		MainLabel.setText("Game Update Panel");

		GameNameLabel.setText("Game Name");

		UpdateCombo.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "Platform Game", "First Person Shooter", "Third Person Shooter", "Beat 'em Ups",
						"Stealth Game", "Survival Game", "Survival Horror", "Graphic Adventures", "Visual Novels",
						"Interactive Movie", "Real-Time 3D Adventures", "Action RPG", "MMORPG", "Sandbox RPG",
						"Tactical RPG", "First Person Party Based RPG", "Choice RPG", "Fantasy RPG", "Life Simulation",
						"Vehicle Simulation", "Real TIme Strategy", "Turn Based Strategy", "Racing", "Sports", "MMO",
						"Casual Game", "Music Game", "Party Game", " " }));

		TypeLabel.setText("Game Type");

		InsertButton.setText("Insert");
		InsertButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				InsertButtonActionPerformed(evt);
			}
		});

		CancelButton.setText("Cancel");
		CancelButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				CancelButtonActionPerformed(evt);
			}
		});

		StatusCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Incomplete", "Complete", " " }));

		jLabel1.setText("Game Status");

		javax.swing.GroupLayout InsertPanelLayout = new javax.swing.GroupLayout(InsertPanel);
		InsertPanel.setLayout(InsertPanelLayout);
		InsertPanelLayout.setHorizontalGroup(InsertPanelLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(InsertPanelLayout.createSequentialGroup().addContainerGap().addGroup(InsertPanelLayout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(ErrorLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(InsertPanelLayout.createSequentialGroup()
								.addComponent(InsertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(CancelButton, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InsertPanelLayout.createSequentialGroup()
								.addGroup(
										InsertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(TypeLabel, javax.swing.GroupLayout.Alignment.TRAILING,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(GameNameLabel, javax.swing.GroupLayout.Alignment.TRAILING,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addGroup(InsertPanelLayout.createSequentialGroup()
														.addComponent(jLabel1).addGap(0, 0, Short.MAX_VALUE)))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(InsertPanelLayout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(NameTextField)
										.addComponent(UpdateCombo, javax.swing.GroupLayout.Alignment.TRAILING,
												javax.swing.GroupLayout.PREFERRED_SIZE, 150,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(StatusCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)))
						.addGroup(InsertPanelLayout.createSequentialGroup()
								.addComponent(MainLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 228,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(0, 0, Short.MAX_VALUE)))
						.addContainerGap()));
		InsertPanelLayout.setVerticalGroup(InsertPanelLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(InsertPanelLayout.createSequentialGroup().addContainerGap().addComponent(MainLabel)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(InsertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(GameNameLabel))
						.addGap(3, 3, 3)
						.addComponent(ErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(InsertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(TypeLabel).addComponent(UpdateCombo,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(InsertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(StatusCombo, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel1))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(InsertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(InsertButton).addComponent(CancelButton))
						.addContainerGap()));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap().addComponent(InsertPanel,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap().addComponent(InsertPanel,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void InsertButtonActionPerformed(java.awt.event.ActionEvent evt)// GEN-FIRST:event_InsertButtonActionPerformed
	{// GEN-HEADEREND:event_InsertButtonActionPerformed

		try {
			String combo = UpdateCombo.getSelectedItem().toString();
			String Status = StatusCombo.getSelectedItem().toString();
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
					game.update(connection, ID, field, combo, Status);
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null,
							"Encountered a problem with the button  Please try again later.");
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
	}// GEN-LAST:event_InsertButtonActionPerformed

	private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt)// GEN-FIRST:event_CancelButtonActionPerformed
	{// GEN-HEADEREND:event_CancelButtonActionPerformed
		Main_Frame main = new Main_Frame();
		main.setVisible(true);
		this.setVisible(false);
		main.startup();
	}// GEN-LAST:event_CancelButtonActionPerformed

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton CancelButton;
	private javax.swing.JLabel ErrorLabel;
	private javax.swing.JLabel GameNameLabel;
	private javax.swing.JButton InsertButton;
	private javax.swing.JPanel InsertPanel;
	private javax.swing.JLabel MainLabel;
	private javax.swing.JTextField NameTextField;
	@SuppressWarnings("rawtypes")
	private javax.swing.JComboBox StatusCombo;
	private javax.swing.JLabel TypeLabel;
	@SuppressWarnings("rawtypes")
	private javax.swing.JComboBox UpdateCombo;
	private javax.swing.JLabel jLabel1;
	// End of variables declaration//GEN-END:variables

	public static void centreWindow(Window frame) {
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
		int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
		frame.setLocation(x, y);
	}

}
