package Repositories;

import com.sun.rowset.JdbcRowSetImpl;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class User_Repository
{

    JdbcRowSetImpl RowSet;
    CallableStatement callablestatement;

    public void Close()
    {
	try
	{
	    callablestatement.close();
	} catch (SQLException ex)
	{
	    Logger.getLogger(User_Repository.class.getName()).log(Level.SEVERE, null, ex);
	}
    }

    public ResultSet Login(Connection connection, String username, String password)
    {
	ResultSet results = null;
	try
	{
	    String SQL = "{call Login (?, ?)}";
	    callablestatement = connection.prepareCall(SQL);
	    callablestatement.setString(1, username);
	    callablestatement.setString(2, password);
	    results = callablestatement.executeQuery();
	    return results;
	} catch (SQLException ex)
	{
	    System.out.println("one \t" + ex);
	}
	return results;
    }

    public void Register(Connection connection, String firstname, String lastname, String username, String password)
    {
	try
	{
	    String SQL = "{call Register (?, ?, ?, ?)}";
	    callablestatement = connection.prepareCall(SQL);
	    callablestatement.setString(1, firstname);
	    callablestatement.setString(2, lastname);
	    callablestatement.setString(3, username);
	    callablestatement.setString(4, password);
	    boolean result = callablestatement.execute();

	} catch (Exception ex)
	{

	}
    }

    public void Update(Connection connection, int ID, String firstname, String lastname, String username, int Accesslevel)
    {
	try
	{
	    String SQL = "{call Update_User (?, ?, ?, ?, ?)}";
	    callablestatement = connection.prepareCall(SQL);
	    callablestatement.setInt(1, ID);
	    callablestatement.setString(2, firstname);
	    callablestatement.setString(3, lastname);
	    callablestatement.setString(4, username);
	    callablestatement.setInt(5, Accesslevel);

	    boolean result = callablestatement.execute();
	    callablestatement.close();

	} catch (Exception ex)
	{
	    System.out.println(ex);
	}
    }

    public void delete(Connection connection, int ID)
    {
	try
	{
	    String SQL = "{call Delete_User (?)}";
	    callablestatement = connection.prepareCall(SQL);
	    callablestatement.setInt(1, ID);
	    boolean result = callablestatement.execute();
	    callablestatement.close();

	} catch (Exception ex)
	{
	    System.out.println(ex);
	}
    }

}
