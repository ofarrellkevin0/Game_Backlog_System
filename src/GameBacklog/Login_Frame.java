package GameBacklog;

import Repositories.User_Repository;
import SQLConnection.SQLConnectionClass;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import Classes.StaticUser;

@SuppressWarnings("serial")
public final class Login_Frame extends javax.swing.JFrame {

	StaticUser userclass = new StaticUser();
	User_Repository user = new User_Repository();
	SQLConnectionClass DB_Connection = new SQLConnectionClass();

	Main_Frame main = new Main_Frame();

	Connection connection;
	ResultSet resultset;
	CallableStatement callablestatement;

	public Login_Frame() {
		initComponents();
		centreWindow(this);
	}

	private void initComponents() {

		UsernameField = new javax.swing.JTextField();
		UsernameLabel = new javax.swing.JLabel();
		PasswordLabel = new javax.swing.JLabel();
		LoginButton = new javax.swing.JButton();
		RegisterLabel = new javax.swing.JLabel();
		WelcomeLabel = new javax.swing.JLabel();
		RegisterButton = new javax.swing.JButton();
		UnsuccessfulLabel = new javax.swing.JLabel();
		ExitButton = new javax.swing.JButton();
		PasswordField = new javax.swing.JPasswordField();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		UsernameField.setText("Admin");

		UsernameLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
		UsernameLabel.setText("Username");

		PasswordLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
		PasswordLabel.setText("Password");

		LoginButton.setText("Login");
		LoginButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				LoginButtonActionPerformed(evt);
			}
		});

		RegisterLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
		RegisterLabel.setText("Register Here");

		WelcomeLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
		WelcomeLabel.setText(" Login form for the system");
		WelcomeLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

		RegisterButton.setText("Register");
		RegisterButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				RegisterButtonActionPerformed(evt);
			}
		});

		ExitButton.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
		ExitButton.setText("Exit");
		ExitButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ExitButtonActionPerformed(evt);
			}
		});

		PasswordField.setText("123456");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup().addGroup(
								layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addGroup(
										layout.createSequentialGroup().addContainerGap().addComponent(ExitButton,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout
												.createSequentialGroup().addContainerGap().addGroup(layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(UnsuccessfulLabel,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addGroup(layout.createSequentialGroup()
																.addComponent(UsernameLabel,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(UsernameField,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 150,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
																.createSequentialGroup().addComponent(RegisterLabel,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(RegisterButton,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 95,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
																.createSequentialGroup()
																.addComponent(PasswordLabel,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(layout.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING,
																		false)
																		.addComponent(LoginButton,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				150, Short.MAX_VALUE)
																		.addComponent(PasswordField)))))
										.addGroup(javax.swing.GroupLayout.Alignment.LEADING,
												layout.createSequentialGroup().addGap(22, 22, 22)
														.addComponent(WelcomeLabel).addGap(0, 21, Short.MAX_VALUE)))
								.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				layout.createSequentialGroup().addContainerGap().addComponent(WelcomeLabel).addGap(25, 25, 25)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(UsernameLabel).addComponent(UsernameField,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(PasswordLabel).addComponent(PasswordField,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(LoginButton)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(UnsuccessfulLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(RegisterButton).addComponent(RegisterLabel,
										javax.swing.GroupLayout.PREFERRED_SIZE, 48,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(ExitButton)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt)// GEN-FIRST:event_LoginButtonActionPerformed
	{// GEN-HEADEREND:event_LoginButtonActionPerformed
		try {
			connection = DB_Connection.Connect();
			String username = UsernameField.getText();
			String password = String.valueOf(PasswordField.getPassword());
			resultset = user.Login(connection, username, password);

			if (resultset.next()) {
				result(resultset);
				UnsuccessfulLabel.setText("The Login Attempt was successful");
				main.setVisible(true);
				this.setVisible(false);
				main.startup();

			} else {
				UnsuccessfulLabel.setText("The Login Attempt was unsuccessful");
			}
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Encountered a problem logging in. Please try again later");
		} finally {
			try {
				user.Close();
				connection.close();
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, "Encountered a problem logging in.  Please try again later");
			}

		}
	}// GEN-LAST:event_LoginButtonActionPerformed

	private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt)// GEN-FIRST:event_RegisterButtonActionPerformed
	{// GEN-HEADEREND:event_RegisterButtonActionPerformed
		Register_Frame Register = new Register_Frame();
		Register.setVisible(true);
		this.setVisible(false);
	}// GEN-LAST:event_RegisterButtonActionPerformed

	private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt)// GEN-FIRST:event_ExitButtonActionPerformed
	{// GEN-HEADEREND:event_ExitButtonActionPerformed
		System.exit(0);
	}// GEN-LAST:event_ExitButtonActionPerformed

	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Login_Frame().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton ExitButton;
	private javax.swing.JButton LoginButton;
	private javax.swing.JPasswordField PasswordField;
	private javax.swing.JLabel PasswordLabel;
	private javax.swing.JButton RegisterButton;
	private javax.swing.JLabel RegisterLabel;
	private javax.swing.JLabel UnsuccessfulLabel;
	private javax.swing.JTextField UsernameField;
	private javax.swing.JLabel UsernameLabel;
	private javax.swing.JLabel WelcomeLabel;
	// End of variables declaration//GEN-END:variables

	public void result(ResultSet resultSet) {

		try {
			userclass = new StaticUser();
			int ID = resultSet.getInt(1);
			userclass.SetID(ID);
			String firstname = resultSet.getString(2);
			userclass.SetFirstname(firstname);
			String lastname = resultSet.getString(3);
			userclass.SetLastname(lastname);
			String username = resultSet.getString(4);
			userclass.SetUsername(username);
			int accesslevel = resultSet.getInt(6);
			userclass.SetAccessLevel(accesslevel);

		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Encountered a problem logging in.  Please try again later");
		}
	}

	public static void centreWindow(Window frame) {
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
		int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
		frame.setLocation(x, y);
	}

}
