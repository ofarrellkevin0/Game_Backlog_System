package GameBacklog;

import Repositories.Regix_Manager_Class;
import Repositories.User_Repository;
import com.sun.rowset.JdbcRowSetImpl;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Register_Frame extends javax.swing.JFrame
{

    Regix_Manager_Class Regix;
    User_Repository user;
    Connection connection;
    ResultSet resultset;
    JdbcRowSetImpl RowSet;
    CallableStatement callablestatement;
    String URL = "jdbc:mysql://localhost:3306/gamebacklog";
    String DB_Username = "root";
    String DB_Password = "root";

    public Register_Frame()
    {
	initComponents();
	centreWindow(this);
	Regix = new Regix_Manager_Class();
	user = new User_Repository();
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
	    System.exit(0);
	}

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        RegisterLabel = new javax.swing.JLabel();
        FirstnameLabel = new javax.swing.JLabel();
        FirstnameField = new javax.swing.JTextField();
        LastnameLabel = new javax.swing.JLabel();
        LastnameField = new javax.swing.JTextField();
        UsernameLabel = new javax.swing.JLabel();
        UsernameField = new javax.swing.JTextField();
        PasswordLabel = new javax.swing.JLabel();
        ConfirmLabel = new javax.swing.JLabel();
        RegisterButton = new javax.swing.JButton();
        unsuccessfulLabel = new javax.swing.JLabel();
        CancelButton = new javax.swing.JButton();
        PasswordField = new javax.swing.JPasswordField();
        ConfirmPasswordField = new javax.swing.JPasswordField();
        FirstnameErrorLabel = new javax.swing.JLabel();
        LastnameErrorLabel = new javax.swing.JLabel();
        UsernameErrorLabel = new javax.swing.JLabel();
        PasswordErrorLabel = new javax.swing.JLabel();
        ConfirmErrorLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RegisterLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        RegisterLabel.setText("Register Form for the GameBacklog");

        FirstnameLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        FirstnameLabel.setText("Firstname");

        LastnameLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        LastnameLabel.setText("Lastname");

        UsernameLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        UsernameLabel.setText("Username");

        PasswordLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        PasswordLabel.setText("Password");

        ConfirmLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        ConfirmLabel.setText("Confirm");

        RegisterButton.setText("Register");
        RegisterButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                RegisterButtonActionPerformed(evt);
            }
        });

        unsuccessfulLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                CancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(unsuccessfulLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FirstnameErrorLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LastnameErrorLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(UsernameErrorLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PasswordErrorLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(ConfirmLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ConfirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(UsernameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(UsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(PasswordLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ConfirmErrorLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(RegisterLabel)
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(CancelButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FirstnameLabel)
                            .addComponent(LastnameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FirstnameField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LastnameField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RegisterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstnameLabel)
                    .addComponent(FirstnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FirstnameErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LastnameLabel)
                    .addComponent(LastnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LastnameErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsernameLabel)
                    .addComponent(UsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UsernameErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordLabel)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PasswordErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConfirmLabel)
                    .addComponent(ConfirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ConfirmErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelButton)
                    .addComponent(RegisterButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(unsuccessfulLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_RegisterButtonActionPerformed
    {//GEN-HEADEREND:event_RegisterButtonActionPerformed
	Connect();

	String Confirm = ConfirmPasswordField.getText();
	String Password = PasswordField.getText();
	String Firstname = FirstnameField.getText();
	String Lastname = LastnameField.getText();
	String Username = UsernameField.getText();

	try
	{
	    if (Confirm.isEmpty() || Password.isEmpty() || Firstname.isEmpty() || Lastname.isEmpty() || Username.isEmpty())
	    {
		unsuccessfulLabel.setText("All fields must be entered to register");
	    } else
	    {
		unsuccessfulLabel.setText("");
	    }
	    if (Regix.Is_Characters(Firstname) == false)
	    {
		FirstnameErrorLabel.setText("Firstname can only have Letters (4-10)");
	    } else
	    {
		FirstnameErrorLabel.setText("");
	    }

	    if ((Regix.Is_Characters(Lastname) == false))
	    {
		LastnameErrorLabel.setText("Lastname can only have Letters (4-10)");
	    } else
	    {
		LastnameErrorLabel.setText("");
	    }

	    if ((Regix.Is_Characters_And_Numbers(Username) == false))

	    {
		UsernameErrorLabel.setText("Username can have letters and numbers (3-20)");
	    } else
	    {
		UsernameErrorLabel.setText("");
	    }

	    if ((Regix.Is_Characters_And_Numbers_Password(Password) == false))

	    {
		PasswordErrorLabel.setText("Password can have letters and numbers (6-20)");
	    } else
	    {
		PasswordErrorLabel.setText("");
	    }

	    if ((Regix.Is_Characters_And_Numbers_Password(Confirm) == false))

	    {
		ConfirmErrorLabel.setText("Confirm must be the same as Password");
	    } else
	    {
		ConfirmErrorLabel.setText("");
	    }
	} catch (Exception ex)
	{
	    JOptionPane.showMessageDialog(null, "Encountered a problem with the form.  Please try again later.");
	}
	try
	{
	    if (Confirm.equals(Password) && Confirm.length() > 5 && Confirm.length() <= 20
		    && Password.length() > 5 && Password.length() <= 20 && Firstname.length() >= 4
		    && Lastname.length() >= 4 && Username.length() >= 3)
	    {
		try
		{
		    String firstname = FirstnameField.getText();
		    String lastname = LastnameField.getText();
		    String username = UsernameField.getText();
		    String password = PasswordField.getText();
		    user.Register(connection, firstname, lastname, username, password);
		} catch (Exception ex)
		{
		     JOptionPane.showMessageDialog(null, "Encountered a problem with the form.  Please try again later.");
		} finally
		{
		    user.Close();
		    connection.close();
		    Login_Frame Login = new Login_Frame();
		    Login.setVisible(true);
		    this.setVisible(false);

		}
	    } else
	    {
		unsuccessfulLabel.setText("Please Correct the fields where necessary");
	    }
	} catch (Exception ex)
	{
	    JOptionPane.showMessageDialog(null, "Encountered a problem with the Interface. Please try again later");
	}

    }//GEN-LAST:event_RegisterButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_CancelButtonActionPerformed
    {//GEN-HEADEREND:event_CancelButtonActionPerformed
	Login_Frame Login = new Login_Frame();
	Login.setVisible(true);
	this.setVisible(false);
    }//GEN-LAST:event_CancelButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JLabel ConfirmErrorLabel;
    private javax.swing.JLabel ConfirmLabel;
    private javax.swing.JPasswordField ConfirmPasswordField;
    private javax.swing.JLabel FirstnameErrorLabel;
    private javax.swing.JTextField FirstnameField;
    private javax.swing.JLabel FirstnameLabel;
    private javax.swing.JLabel LastnameErrorLabel;
    private javax.swing.JTextField LastnameField;
    private javax.swing.JLabel LastnameLabel;
    private javax.swing.JLabel PasswordErrorLabel;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JLabel RegisterLabel;
    private javax.swing.JLabel UsernameErrorLabel;
    private javax.swing.JTextField UsernameField;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JLabel unsuccessfulLabel;
    // End of variables declaration//GEN-END:variables

    public static void centreWindow(Window frame)
    {
	Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
	int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
	frame.setLocation(x, y);
    }
    
}
