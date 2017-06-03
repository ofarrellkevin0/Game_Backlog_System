package GameBacklog;

import Repositories.StaticUser;
import Repositories.Console_Repository;
import Repositories.Console;
import Repositories.Game;
import Repositories.Game_Repository;
import com.sun.rowset.JdbcRowSetImpl;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public final class Main_Frame extends javax.swing.JFrame
{

    static FileOutputStream fos;
    static PrintWriter out;
    Repositories.StaticUser userclass;
    Console_Repository console;
    Connection connection;
    ResultSet resultset;
    JdbcRowSetImpl RowSet;
    CallableStatement callablestatement;
    String URL = "jdbc:mysql://localhost:3306/gamebacklog";
    String DB_Username = "root";
    String DB_Password = "root";

    public Main_Frame()
    {
	initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        WelcomeLabel = new javax.swing.JLabel();
        LogoutButton = new javax.swing.JButton();
        GamesPanel = new javax.swing.JPanel();
        GamePanelLabel = new javax.swing.JLabel();
        GamesPanelCombo = new javax.swing.JComboBox();
        ShowGameTypeButton = new javax.swing.JButton();
        GamesPanelInsertButton = new javax.swing.JButton();
        GamesPanelUpdateButton = new javax.swing.JButton();
        GamesPanelDeleteButton = new javax.swing.JButton();
        GamesPanelLogTimeButton = new javax.swing.JButton();
        PrintGamesButton = new javax.swing.JButton();
        GamestoFileButton = new javax.swing.JButton();
        AllGames = new javax.swing.JButton();
        AllGamestoFileButton = new javax.swing.JButton();
        ConsolePanel = new javax.swing.JPanel();
        ConsolesPanelLabel = new javax.swing.JLabel();
        ConsolesPanelInsertButton = new javax.swing.JButton();
        ShowConsoleTypeButton = new javax.swing.JButton();
        ConsolesPanelCombo = new javax.swing.JComboBox();
        ConsolesPanelUpdateButton = new javax.swing.JButton();
        ConsolesPanelDeleteButton = new javax.swing.JButton();
        ConsolesPanelLogTimeButton = new javax.swing.JButton();
        PrintConsolesButton = new javax.swing.JButton();
        ConsolestoFileButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        DatabaseTextArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        InformationConsoleTextArea = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        InformationGameTextArea = new javax.swing.JTextArea();
        AccountsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        WelcomeLabel.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        WelcomeLabel.setText("Welcome");

        LogoutButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        LogoutButton.setText("Logout");
        LogoutButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                LogoutButtonActionPerformed(evt);
            }
        });

        GamesPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        GamePanelLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        GamePanelLabel.setText("Games Panel");

        ShowGameTypeButton.setText("Show Game Type");
        ShowGameTypeButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ShowGameTypeButtonActionPerformed(evt);
            }
        });

        GamesPanelInsertButton.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        GamesPanelInsertButton.setText("Insert");
        GamesPanelInsertButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                GamesPanelInsertButtonActionPerformed(evt);
            }
        });

        GamesPanelUpdateButton.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        GamesPanelUpdateButton.setText("Update");
        GamesPanelUpdateButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                GamesPanelUpdateButtonActionPerformed(evt);
            }
        });

        GamesPanelDeleteButton.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        GamesPanelDeleteButton.setText("Delete");
        GamesPanelDeleteButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                GamesPanelDeleteButtonActionPerformed(evt);
            }
        });

        GamesPanelLogTimeButton.setText("Log Time");
        GamesPanelLogTimeButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                GamesPanelLogTimeButtonActionPerformed(evt);
            }
        });

        PrintGamesButton.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        PrintGamesButton.setText("Print games");
        PrintGamesButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                PrintGamesButtonActionPerformed(evt);
            }
        });

        GamestoFileButton.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        GamestoFileButton.setText("To File");
        GamestoFileButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                GamestoFileButtonActionPerformed(evt);
            }
        });

        AllGames.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        AllGames.setText("All Games");
        AllGames.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                AllGamesActionPerformed(evt);
            }
        });

        AllGamestoFileButton.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        AllGamestoFileButton.setText("All To File");
        AllGamestoFileButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                AllGamestoFileButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout GamesPanelLayout = new javax.swing.GroupLayout(GamesPanel);
        GamesPanel.setLayout(GamesPanelLayout);
        GamesPanelLayout.setHorizontalGroup(
            GamesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GamesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(GamesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GamesPanelCombo, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ShowGameTypeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(GamesPanelLayout.createSequentialGroup()
                        .addComponent(GamesPanelInsertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GamesPanelUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(GamesPanelDeleteButton))
                    .addComponent(GamesPanelLogTimeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(GamesPanelLayout.createSequentialGroup()
                        .addGroup(GamesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(AllGames, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PrintGamesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(GamesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(GamestoFileButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AllGamestoFileButton, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)))
                    .addGroup(GamesPanelLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(GamePanelLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        GamesPanelLayout.setVerticalGroup(
            GamesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GamesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GamePanelLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GamesPanelCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ShowGameTypeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(GamesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GamesPanelInsertButton)
                    .addComponent(GamesPanelUpdateButton)
                    .addComponent(GamesPanelDeleteButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GamesPanelLogTimeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(GamesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PrintGamesButton)
                    .addComponent(GamestoFileButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(GamesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AllGames)
                    .addComponent(AllGamestoFileButton))
                .addContainerGap())
        );

        ConsolePanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ConsolesPanelLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        ConsolesPanelLabel.setText("Consoles Panel");

        ConsolesPanelInsertButton.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        ConsolesPanelInsertButton.setText("Insert");
        ConsolesPanelInsertButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ConsolesPanelInsertButtonActionPerformed(evt);
            }
        });

        ShowConsoleTypeButton.setText("Show Console Type");
        ShowConsoleTypeButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ShowConsoleTypeButtonActionPerformed(evt);
            }
        });

        ConsolesPanelCombo.setToolTipText("");
        ConsolesPanelCombo.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                ConsolesPanelComboItemStateChanged(evt);
            }
        });
        ConsolesPanelCombo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ConsolesPanelComboActionPerformed(evt);
            }
        });

        ConsolesPanelUpdateButton.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        ConsolesPanelUpdateButton.setText("Update");
        ConsolesPanelUpdateButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ConsolesPanelUpdateButtonActionPerformed(evt);
            }
        });

        ConsolesPanelDeleteButton.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        ConsolesPanelDeleteButton.setText("Delete");
        ConsolesPanelDeleteButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ConsolesPanelDeleteButtonActionPerformed(evt);
            }
        });

        ConsolesPanelLogTimeButton.setText("Log Time");
        ConsolesPanelLogTimeButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ConsolesPanelLogTimeButtonActionPerformed(evt);
            }
        });

        PrintConsolesButton.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        PrintConsolesButton.setText("Print Consoles");
        PrintConsolesButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                PrintConsolesButtonActionPerformed(evt);
            }
        });

        ConsolestoFileButton.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        ConsolestoFileButton.setText("Consoles to File");
        ConsolestoFileButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ConsolestoFileButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ConsolePanelLayout = new javax.swing.GroupLayout(ConsolePanel);
        ConsolePanel.setLayout(ConsolePanelLayout);
        ConsolePanelLayout.setHorizontalGroup(
            ConsolePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsolePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ConsolePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ConsolesPanelLogTimeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ShowConsoleTypeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ConsolesPanelCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ConsolePanelLayout.createSequentialGroup()
                        .addComponent(ConsolesPanelInsertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ConsolesPanelUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ConsolesPanelDeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ConsolePanelLayout.createSequentialGroup()
                        .addComponent(PrintConsolesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ConsolestoFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConsolePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ConsolesPanelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        ConsolePanelLayout.setVerticalGroup(
            ConsolePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsolePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ConsolesPanelLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ConsolesPanelCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ShowConsoleTypeButton)
                .addGap(12, 12, 12)
                .addGroup(ConsolePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConsolesPanelInsertButton)
                    .addComponent(ConsolesPanelUpdateButton)
                    .addComponent(ConsolesPanelDeleteButton))
                .addGap(12, 12, 12)
                .addComponent(ConsolesPanelLogTimeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ConsolePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ConsolestoFileButton)
                    .addComponent(PrintConsolesButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        DatabaseTextArea.setColumns(20);
        DatabaseTextArea.setRows(5);
        jScrollPane1.setViewportView(DatabaseTextArea);

        InformationConsoleTextArea.setColumns(20);
        InformationConsoleTextArea.setRows(5);
        jScrollPane2.setViewportView(InformationConsoleTextArea);

        InformationGameTextArea.setColumns(20);
        InformationGameTextArea.setRows(5);
        jScrollPane3.setViewportView(InformationGameTextArea);

        AccountsButton.setText("Accounts");
        AccountsButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                AccountsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(WelcomeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(LogoutButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(ConsolePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(GamesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(AccountsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(WelcomeLabel)
                    .addComponent(LogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GamesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConsolePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AccountsButton))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_LogoutButtonActionPerformed
    {//GEN-HEADEREND:event_LogoutButtonActionPerformed
	Login_Frame login = new Login_Frame();
	login.setVisible(true);
	this.setVisible(false);
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void ConsolesPanelInsertButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ConsolesPanelInsertButtonActionPerformed
    {//GEN-HEADEREND:event_ConsolesPanelInsertButtonActionPerformed
	Console_Insert_Frame insert = new Console_Insert_Frame();
	insert.setVisible(true);
	this.setVisible(false);
    }//GEN-LAST:event_ConsolesPanelInsertButtonActionPerformed

    private void ShowConsoleTypeButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ShowConsoleTypeButtonActionPerformed
    {//GEN-HEADEREND:event_ShowConsoleTypeButtonActionPerformed

	Console selected_item = (Console) ConsolesPanelCombo.getSelectedItem();
	InformationConsoleTextArea.setText("");
	InformationConsoleTextArea.setText("Name = " + selected_item.getName() + "\n" + "Type =  " + selected_item.getType());
    }//GEN-LAST:event_ShowConsoleTypeButtonActionPerformed

    private void ConsolesPanelUpdateButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ConsolesPanelUpdateButtonActionPerformed
    {//GEN-HEADEREND:event_ConsolesPanelUpdateButtonActionPerformed
	Console selected_item = (Console) ConsolesPanelCombo.getSelectedItem();
	String name = selected_item.getName();
	int ID = selected_item.getId();
	String type = selected_item.getType();
	Console_Update_Frame update = new Console_Update_Frame();
	update.pass(ID, name, type);
	update.setVisible(true);
	this.setVisible(false);
    }//GEN-LAST:event_ConsolesPanelUpdateButtonActionPerformed

    private void ConsolesPanelDeleteButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ConsolesPanelDeleteButtonActionPerformed
    {//GEN-HEADEREND:event_ConsolesPanelDeleteButtonActionPerformed
	console = new Console_Repository();
	Console selected_item = (Console) ConsolesPanelCombo.getSelectedItem();
	int ID = selected_item.getId();
	try
	{
	    Connect();
	    console.Delete(connection, ID);
	    ConsoleCombo();
	    connection.close();
	    startup();
	} catch (Exception ex)
	{
	    JOptionPane.showMessageDialog(null, "Encountered a problem with this button.  Please try again later");
	}
    }//GEN-LAST:event_ConsolesPanelDeleteButtonActionPerformed

    private void ConsolesPanelLogTimeButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ConsolesPanelLogTimeButtonActionPerformed
    {//GEN-HEADEREND:event_ConsolesPanelLogTimeButtonActionPerformed
	console = new Console_Repository();
	Console selected_item = (Console) ConsolesPanelCombo.getSelectedItem();
	int ID = selected_item.getId();
	try
	{
	    Connect();
	    console.UpdateTime(connection, ID);
	    ConsoleCombo();
	    connection.close();
	    startup();
	} catch (Exception ex)
	{
	    JOptionPane.showMessageDialog(null, "Encountered a problem with this button.  Please try again later");
	}
    }//GEN-LAST:event_ConsolesPanelLogTimeButtonActionPerformed

    private void PrintConsolesButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_PrintConsolesButtonActionPerformed
    {//GEN-HEADEREND:event_PrintConsolesButtonActionPerformed
	try
	{
	    console = new Console_Repository();
	    Connect();
	    String SQL = "{ call Select_Consoles (?) }";
	    callablestatement = connection.prepareCall(SQL);
	    callablestatement.setInt(1, Repositories.StaticUser.GetID());
	    resultset = callablestatement.executeQuery();
	    DatabaseTextArea.setText(print(resultset));
	    connection.close();
	    callablestatement.close();
	} catch (Exception ex)

	{
	    JOptionPane.showMessageDialog(null, "Encountered a problem with this button.  Please try again later");
	}
    }//GEN-LAST:event_PrintConsolesButtonActionPerformed

    private void ConsolestoFileButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ConsolestoFileButtonActionPerformed
    {//GEN-HEADEREND:event_ConsolestoFileButtonActionPerformed
	try
	{
	    fos = new FileOutputStream(new File("Consoles" + Repositories.StaticUser.GetUsername() + ".txt"));
	    out = new PrintWriter(fos);

	    console = new Console_Repository();
	    Connect();
	    String SQL = "{ call Select_Consoles (?) }";
	    callablestatement = connection.prepareCall(SQL);
	    callablestatement.setInt(1, Repositories.StaticUser.GetID());
	    resultset = callablestatement.executeQuery();
	    out.print(print(resultset));
	    out.flush();
	    connection.close();
	    callablestatement.close();
	} catch (Exception ex)

	{
	    JOptionPane.showMessageDialog(null, "Encountered a problem with this button.  Please try again later");
	}
    }//GEN-LAST:event_ConsolestoFileButtonActionPerformed

    private void GamesPanelInsertButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_GamesPanelInsertButtonActionPerformed
    {//GEN-HEADEREND:event_GamesPanelInsertButtonActionPerformed
	Game_Insert_Frame insert = new Game_Insert_Frame();
	insert.setVisible(true);
	this.setVisible(false);
	Console selected_item = (Console) ConsolesPanelCombo.getSelectedItem();
	insert.pass(selected_item.getId());
    }//GEN-LAST:event_GamesPanelInsertButtonActionPerformed

    private void ShowGameTypeButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ShowGameTypeButtonActionPerformed
    {//GEN-HEADEREND:event_ShowGameTypeButtonActionPerformed
	Game item = (Game) GamesPanelCombo.getSelectedItem();
	InformationGameTextArea.setText("");
	InformationGameTextArea.setText("Name = " + item.getName() + "\n" + "Type = " + item.getType() + "\n" + "Status = " + item.getStatus());
    }//GEN-LAST:event_ShowGameTypeButtonActionPerformed

    private void GamesPanelUpdateButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_GamesPanelUpdateButtonActionPerformed
    {//GEN-HEADEREND:event_GamesPanelUpdateButtonActionPerformed
	Game selected_item = (Game) GamesPanelCombo.getSelectedItem();
	String name = selected_item.getName();
	int ID = selected_item.getId();
	String type = selected_item.getType();
	String status = selected_item.getStatus();
	Game_Update_Frame update = new Game_Update_Frame();
	update.pass(ID, name, type, status);
	update.setVisible(true);
	this.setVisible(false);
    }//GEN-LAST:event_GamesPanelUpdateButtonActionPerformed

    private void GamesPanelDeleteButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_GamesPanelDeleteButtonActionPerformed
    {//GEN-HEADEREND:event_GamesPanelDeleteButtonActionPerformed
	Game_Repository game = new Game_Repository();
	Game selected_item = (Game) GamesPanelCombo.getSelectedItem();
	int ID = selected_item.getId();
	try
	{
	    Connect();
	    game.delete(connection, ID);
	    connection.close();
	    startup();
	} catch (Exception ex)
	{
	    JOptionPane.showMessageDialog(null, "Encountered a problem with this button.  Please try again later");
	}
    }//GEN-LAST:event_GamesPanelDeleteButtonActionPerformed

    private void GamesPanelLogTimeButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_GamesPanelLogTimeButtonActionPerformed
    {//GEN-HEADEREND:event_GamesPanelLogTimeButtonActionPerformed
	Game_Repository game = new Game_Repository();
	Game selected_item = (Game) GamesPanelCombo.getSelectedItem();
	int ID = selected_item.getId();
	try
	{
	    Connect();
	    game.UpdateTime(connection, ID);
	    ConsoleCombo();
	    connection.close();
	    startup();
	} catch (Exception ex)
	{
	    JOptionPane.showMessageDialog(null, "Encountered a problem with this button.  Please try again later");
	}
    }//GEN-LAST:event_GamesPanelLogTimeButtonActionPerformed

    private void PrintGamesButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_PrintGamesButtonActionPerformed
    {//GEN-HEADEREND:event_PrintGamesButtonActionPerformed
	try
	{
	    Console selected_item = (Console) ConsolesPanelCombo.getSelectedItem();
	    int ID = selected_item.getId();
	    Connect();
	    String SQL = "{ call Select_Games (?) }";
	    callablestatement = connection.prepareCall(SQL);
	    callablestatement.setInt(1, ID);
	    resultset = callablestatement.executeQuery();
	    DatabaseTextArea.setText(print(resultset));
	    connection.close();
	    callablestatement.close();
	} catch (Exception ex)

	{
	    JOptionPane.showMessageDialog(null, "Encountered a problem with this button.  Please try again later");
	}
    }//GEN-LAST:event_PrintGamesButtonActionPerformed

    private void GamestoFileButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_GamestoFileButtonActionPerformed
    {//GEN-HEADEREND:event_GamestoFileButtonActionPerformed
	try
	{
	    fos = new FileOutputStream(new File("games" + Repositories.StaticUser.GetUsername() + ".txt"));
	    out = new PrintWriter(fos);

	    Console selected_item = (Console) ConsolesPanelCombo.getSelectedItem();
	    int ID = selected_item.getId();

	    Connect();
	    String SQL = "{ call Select_Games (?) }";
	    callablestatement = connection.prepareCall(SQL);
	    callablestatement.setInt(1, ID);
	    resultset = callablestatement.executeQuery();
	    out.print(print(resultset));
	    out.flush();
	    connection.close();
	    callablestatement.close();
	} catch (Exception ex)

	{
	    JOptionPane.showMessageDialog(null, "Encountered a problem with this button.  Please try again later");
	}
    }//GEN-LAST:event_GamestoFileButtonActionPerformed

    private void AllGamesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_AllGamesActionPerformed
    {//GEN-HEADEREND:event_AllGamesActionPerformed
	try
	{
	    console = new Console_Repository();
	    Connect();
	    String SQL = "{ call Select_All_Games (?) }";
	    callablestatement = connection.prepareCall(SQL);
	    callablestatement.setInt(1, Repositories.StaticUser.GetID());
	    resultset = callablestatement.executeQuery();
	    DatabaseTextArea.setText(print(resultset));
	    connection.close();
	    callablestatement.close();
	} catch (Exception ex)

	{
	    JOptionPane.showMessageDialog(null, "Encountered a problem with this button.  Please try again later");
	}
    }//GEN-LAST:event_AllGamesActionPerformed

    private void AllGamestoFileButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_AllGamestoFileButtonActionPerformed
    {//GEN-HEADEREND:event_AllGamestoFileButtonActionPerformed
	try
	{
	    out = new PrintWriter(fos);

	    console = new Console_Repository();
	    Connect();
	    Connect();
	    String SQL = "{ call Select_All_Games (?) }";
	    callablestatement = connection.prepareCall(SQL);
	    callablestatement.setInt(1, Repositories.StaticUser.GetID());
	    resultset = callablestatement.executeQuery();
	    out.print(print(resultset));
	    out.flush();
	    connection.close();
	    callablestatement.close();
	} catch (Exception ex)

	{
	    JOptionPane.showMessageDialog(null, "Encountered a problem with this button.  Please try again later");
	}
    }//GEN-LAST:event_AllGamestoFileButtonActionPerformed

    private void ConsolesPanelComboActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ConsolesPanelComboActionPerformed
    {//GEN-HEADEREND:event_ConsolesPanelComboActionPerformed

    }//GEN-LAST:event_ConsolesPanelComboActionPerformed

    private void ConsolesPanelComboItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_ConsolesPanelComboItemStateChanged
    {//GEN-HEADEREND:event_ConsolesPanelComboItemStateChanged
	Console item = (Console) ConsolesPanelCombo.getSelectedItem();
	int ID = item.getId();
	try
	{
	    GamesPanelCombo.removeAllItems();
	    Connect();
	    String SQL = "{ call Select_Game_Combo (?) }";
	    callablestatement = connection.prepareCall(SQL);
	    callablestatement.setInt(1, ID);
	    ResultSet res = callablestatement.executeQuery();
	    while (res.next())
	    {
		String name = res.getString("name");
		String type = res.getString("type");
		String status = res.getString("status");
		int id = res.getInt("ID");
		Game items = new Game(id, type, status, name);
		GamesPanelCombo.addItem(items);
	    }

	    connection.close();
	    callablestatement.close();
	} catch (Exception ex)
	{

	}
    }//GEN-LAST:event_ConsolesPanelComboItemStateChanged

    private void AccountsButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_AccountsButtonActionPerformed
    {//GEN-HEADEREND:event_AccountsButtonActionPerformed
	Accounts_Frame accounts = new Accounts_Frame();
	accounts.setVisible(true);
	this.setVisible(false);
    }//GEN-LAST:event_AccountsButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AccountsButton;
    private javax.swing.JButton AllGames;
    private javax.swing.JButton AllGamestoFileButton;
    private javax.swing.JPanel ConsolePanel;
    private javax.swing.JComboBox ConsolesPanelCombo;
    private javax.swing.JButton ConsolesPanelDeleteButton;
    private javax.swing.JButton ConsolesPanelInsertButton;
    private javax.swing.JLabel ConsolesPanelLabel;
    private javax.swing.JButton ConsolesPanelLogTimeButton;
    private javax.swing.JButton ConsolesPanelUpdateButton;
    private javax.swing.JButton ConsolestoFileButton;
    private javax.swing.JTextArea DatabaseTextArea;
    private javax.swing.JLabel GamePanelLabel;
    private javax.swing.JPanel GamesPanel;
    private javax.swing.JComboBox GamesPanelCombo;
    private javax.swing.JButton GamesPanelDeleteButton;
    private javax.swing.JButton GamesPanelInsertButton;
    private javax.swing.JButton GamesPanelLogTimeButton;
    private javax.swing.JButton GamesPanelUpdateButton;
    private javax.swing.JButton GamestoFileButton;
    private javax.swing.JTextArea InformationConsoleTextArea;
    private javax.swing.JTextArea InformationGameTextArea;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton PrintConsolesButton;
    private javax.swing.JButton PrintGamesButton;
    private javax.swing.JButton ShowConsoleTypeButton;
    private javax.swing.JButton ShowGameTypeButton;
    private javax.swing.JLabel WelcomeLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables

    public void startup()
    {
	int access = userclass.GetAccesslevel();
	if (access != 1)
	{
	    AccountsButton.setVisible(false);
	} else
	{
	    AccountsButton.setVisible(true);
	}

	WelcomeLabel.setText("Welcome " + StaticUser.GetUsername());

	ConsoleCombo();
	GameCombo();
    }

    public void ConsoleCombo()
    {
	try
	{
	    ConsolesPanelCombo.removeAllItems();
	    console = new Console_Repository();
	    Connect();
	    String SQL = "{ call Select_Console_Combo (?) }";
	    callablestatement = connection.prepareCall(SQL);
	    callablestatement.setInt(1, Repositories.StaticUser.GetID());
	    ResultSet res = callablestatement.executeQuery();

	    while (res.next())
	    {
		String name = res.getString("name");
		String type = res.getString("type");
		int ID = res.getInt("ID");
		Console item = new Console(ID, type, name);
		ConsolesPanelCombo.addItem(item);
	    }

	    connection.close();
	    callablestatement.close();
	} catch (Exception ex)
	{
	    //JOptionPane.showMessageDialog(null, "Encountered a problem with console menu.  Please try again later");
	}
    }

    public void GameCombo()
    {
	try
	{
	    GamesPanelCombo.removeAllItems();
	    Console item = (Console) ConsolesPanelCombo.getSelectedItem();
	    int ID = item.getId();

	    Connect();
	    String SQL = "{ call Select_Game_Combo (?) }";
	    callablestatement = connection.prepareCall(SQL);
	    callablestatement.setInt(1, ID);
	    ResultSet res = callablestatement.executeQuery();
	    while (res.next())
	    {
		String name = res.getString("name");
		String type = res.getString("type");
		String status = res.getString("status");
		int id = res.getInt("ID");
		Game items = new Game(id, type, status, name);
		GamesPanelCombo.addItem(items);
	    }

	    connection.close();
	    callablestatement.close();
	} catch (Exception ex)
	{
	    //JOptionPane.showMessageDialog(null, "Encountered a problem with a game menu.  Please try again later");
	}
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

    public static String print(ResultSet resultSet)
    {
	String results = "";
	try
	{
	    ResultSetMetaData metaData = resultSet.getMetaData();

	    int numberOfColumns = metaData.getColumnCount();

	    while (resultSet.next())
	    {
		for (int i = 1; i <= numberOfColumns; i++)
		{
		    results += resultSet.getObject(i) + "\n";
		}

		results += "\n \n";
	    }
	} catch (SQLException ex)
	{
	    JOptionPane.showMessageDialog(null, "Encountered a problem with printing the results.  Please try again later");
	}
	return results;
    }
}
