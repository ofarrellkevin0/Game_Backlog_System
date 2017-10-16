package GameBacklog;

import Repositories.User;
import Repositories.User_Repository;
import com.sun.rowset.JdbcRowSetImpl;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public final class Accounts_Frame extends javax.swing.JFrame
{

    Repositories.StaticUser userclass;
    User_Repository userclassRep = new User_Repository();
    Connection connection;
    ResultSet resultset;
    JdbcRowSetImpl RowSet;
    CallableStatement callablestatement;
    String URL = "jdbc:mysql://localhost:3306/gamebacklog";
    String DB_Username = "root";
    String DB_Password = "root";

    public Accounts_Frame()
    {
	initComponents();
	Show_Users_In_JTable();
	centreWindow(this);
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

    public ArrayList<User> getUsersList()
    {
	ArrayList<User> usersList = new ArrayList<>();
	Connect();

	String query = "SELECT * FROM User ";
	Statement st;
	ResultSet rs;

	try
	{
	    st = connection.createStatement();
	    rs = st.executeQuery(query);

	    User user;

	    while (rs.next())
	    {
		user = new User(rs.getInt("ID"), rs.getString("Firstname"), rs.getString("Lastname"), rs.getString("Username"), rs.getInt("Accesslevel"));
		usersList.add(user);
	    }

	} catch (Exception e)
	{
	    JOptionPane.showMessageDialog(null, "Encountered a problem with the information.  Please try again later.");
	}
	return usersList;
    }

    public void Show_Users_In_JTable()
    {
	ArrayList<User> list = getUsersList();
	DefaultTableModel model = (DefaultTableModel) UsersTable.getModel();
	Object[] row = new Object[5];
	for (User list1 : list)
	{
	    row[0] = list1.getID();
	    row[1] = list1.getFirstName();
	    row[2] = list1.getLastName();
	    row[3] = list1.getUsername();
	    row[4] = list1.getAccessLevel();
	    model.addRow(row);
	}
    }

    public void removerows()
    {
	DefaultTableModel model = (DefaultTableModel) UsersTable.getModel();
	model.getDataVector().removeAllElements();
	model.fireTableDataChanged();
	Show_Users_In_JTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        MainPanel = new javax.swing.JPanel();
        FieldPanel = new javax.swing.JPanel();
        FirstnameLabel = new javax.swing.JLabel();
        FirstnameTextField = new javax.swing.JTextField();
        LastnameLabel = new javax.swing.JLabel();
        LastnameTextField = new javax.swing.JTextField();
        UsernameLabel = new javax.swing.JLabel();
        UsernameTextField = new javax.swing.JTextField();
        UsernameLabel1 = new javax.swing.JLabel();
        AccesslevelTextField = new javax.swing.JTextField();
        TablePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        UsersTable = new javax.swing.JTable();
        ButtonPanel = new javax.swing.JPanel();
        DeleteButtonPanel = new javax.swing.JPanel();
        DeleteButton = new javax.swing.JButton();
        UpdateButtonPanel = new javax.swing.JPanel();
        UpdateButton = new javax.swing.JButton();
        CancelButtonPanel = new javax.swing.JPanel();
        CancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        FieldPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        FirstnameLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        FirstnameLabel.setText("Firstname");

        LastnameLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        LastnameLabel.setText("Lastname");

        UsernameLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        UsernameLabel.setText("Username");

        UsernameLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        UsernameLabel1.setText("Access");

        javax.swing.GroupLayout FieldPanelLayout = new javax.swing.GroupLayout(FieldPanel);
        FieldPanel.setLayout(FieldPanelLayout);
        FieldPanelLayout.setHorizontalGroup(
            FieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FieldPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FieldPanelLayout.createSequentialGroup()
                        .addComponent(LastnameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LastnameTextField)
                        .addContainerGap())
                    .addGroup(FieldPanelLayout.createSequentialGroup()
                        .addGroup(FieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FieldPanelLayout.createSequentialGroup()
                                .addComponent(FirstnameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(FirstnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FieldPanelLayout.createSequentialGroup()
                                .addGroup(FieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(UsernameLabel)
                                    .addComponent(UsernameLabel1))
                                .addGap(12, 12, 12)
                                .addGroup(FieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(UsernameTextField)
                                    .addComponent(AccesslevelTextField))))
                        .addGap(6, 6, 6))))
        );
        FieldPanelLayout.setVerticalGroup(
            FieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FieldPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstnameLabel)
                    .addComponent(FirstnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LastnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LastnameLabel))
                .addGap(18, 18, 18)
                .addGroup(FieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(UsernameLabel)
                    .addComponent(UsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(FieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsernameLabel1)
                    .addComponent(AccesslevelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TablePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        UsersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "ID", "Firstname", "Lastname", "Username", "Accesslevel"
            }
        ));
        UsersTable.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                UsersTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(UsersTable);

        javax.swing.GroupLayout TablePanelLayout = new javax.swing.GroupLayout(TablePanel);
        TablePanel.setLayout(TablePanelLayout);
        TablePanelLayout.setHorizontalGroup(
            TablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                .addContainerGap())
        );
        TablePanelLayout.setVerticalGroup(
            TablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        ButtonPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        DeleteButtonPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        DeleteButton.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                DeleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DeleteButtonPanelLayout = new javax.swing.GroupLayout(DeleteButtonPanel);
        DeleteButtonPanel.setLayout(DeleteButtonPanelLayout);
        DeleteButtonPanelLayout.setHorizontalGroup(
            DeleteButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeleteButtonPanelLayout.createSequentialGroup()
                .addComponent(DeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        DeleteButtonPanelLayout.setVerticalGroup(
            DeleteButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeleteButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DeleteButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        UpdateButtonPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        UpdateButton.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                UpdateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout UpdateButtonPanelLayout = new javax.swing.GroupLayout(UpdateButtonPanel);
        UpdateButtonPanel.setLayout(UpdateButtonPanelLayout);
        UpdateButtonPanelLayout.setHorizontalGroup(
            UpdateButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdateButtonPanelLayout.createSequentialGroup()
                .addComponent(UpdateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        UpdateButtonPanelLayout.setVerticalGroup(
            UpdateButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdateButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(UpdateButton, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                .addContainerGap())
        );

        CancelButtonPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        CancelButton.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                CancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CancelButtonPanelLayout = new javax.swing.GroupLayout(CancelButtonPanel);
        CancelButtonPanel.setLayout(CancelButtonPanelLayout);
        CancelButtonPanelLayout.setHorizontalGroup(
            CancelButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CancelButtonPanelLayout.createSequentialGroup()
                .addComponent(CancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        CancelButtonPanelLayout.setVerticalGroup(
            CancelButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CancelButtonPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CancelButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout ButtonPanelLayout = new javax.swing.GroupLayout(ButtonPanel);
        ButtonPanel.setLayout(ButtonPanelLayout);
        ButtonPanelLayout.setHorizontalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CancelButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DeleteButtonPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(UpdateButtonPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        ButtonPanelLayout.setVerticalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DeleteButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(UpdateButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(CancelButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FieldPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(FieldPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsersTableMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_UsersTableMouseClicked
    {//GEN-HEADEREND:event_UsersTableMouseClicked
	int i = UsersTable.getSelectedRow();

	TableModel model = UsersTable.getModel();

	FirstnameTextField.setText(model.getValueAt(i, 1).toString());

	LastnameTextField.setText(model.getValueAt(i, 2).toString());

	UsernameTextField.setText(model.getValueAt(i, 3).toString());

	AccesslevelTextField.setText(model.getValueAt(i, 4).toString());
    }//GEN-LAST:event_UsersTableMouseClicked

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_UpdateButtonActionPerformed
    {//GEN-HEADEREND:event_UpdateButtonActionPerformed
	try
	{
	    int i = UsersTable.getSelectedRow();
	    TableModel model = UsersTable.getModel();

	    String first = FirstnameTextField.getText();
	    String last = LastnameTextField.getText();
	    String user = UsernameTextField.getText();
	    int Accesslevel = Integer.parseInt(AccesslevelTextField.getText());
	    int ID = (int) model.getValueAt(i, 0);

	    Connect();
	    userclassRep.Update(connection, ID, first, last, user, Accesslevel);

	} catch (Exception ex)
	{
	   JOptionPane.showMessageDialog(null, "Encountered a problem with the button.  Please try again later.");
	    System.out.println(ex);
	} finally
	{
	    try
	    {
		connection.close();
		removerows();
	    } catch (Exception ex)
	    {
		JOptionPane.showMessageDialog(null, "Encountered a problem with the button.  Please try again later.");
	    }

	}
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_CancelButtonActionPerformed
    {//GEN-HEADEREND:event_CancelButtonActionPerformed
	Main_Frame main = new Main_Frame();
	main.setVisible(true);
	main.startup();
	this.setVisible(false);
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_DeleteButtonActionPerformed
    {//GEN-HEADEREND:event_DeleteButtonActionPerformed

	int i = UsersTable.getSelectedRow();
	TableModel model = UsersTable.getModel();
	int ID = (int) model.getValueAt(i, 0);

	try
	{
	    Connect();
	    userclassRep.delete(connection, ID);
	    connection.close();
	    removerows();
	} catch (Exception ex)
	{
	     JOptionPane.showMessageDialog(null, "Encountered a problem with the button.  Please try again later.");
	}
    }//GEN-LAST:event_DeleteButtonActionPerformed

    public void executeSQlQuery(String query, String message)
    {
	Connect();
	Statement st;
	try
	{
	    st = connection.createStatement();
	    if ((st.executeUpdate(query)) == 1)
	    {
		DefaultTableModel model = (DefaultTableModel) UsersTable.getModel();
		model.setRowCount(0);
		Show_Users_In_JTable();
	    }
	} catch (Exception ex)
	{
	   JOptionPane.showMessageDialog(null, "Encountered a problem with the information.  Please try again later.");
	}
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AccesslevelTextField;
    private javax.swing.JPanel ButtonPanel;
    private javax.swing.JButton CancelButton;
    private javax.swing.JPanel CancelButtonPanel;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JPanel DeleteButtonPanel;
    private javax.swing.JPanel FieldPanel;
    private javax.swing.JLabel FirstnameLabel;
    private javax.swing.JTextField FirstnameTextField;
    private javax.swing.JLabel LastnameLabel;
    private javax.swing.JTextField LastnameTextField;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel TablePanel;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JPanel UpdateButtonPanel;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JLabel UsernameLabel1;
    private javax.swing.JTextField UsernameTextField;
    private javax.swing.JTable UsersTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public static void centreWindow(Window frame)
    {
	Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
	int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
	frame.setLocation(x, y);
    }
    
}
