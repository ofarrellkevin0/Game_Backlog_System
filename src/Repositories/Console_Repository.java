package Repositories;

import java.sql.CallableStatement;
import java.sql.Connection;

public class Console_Repository {

	CallableStatement callablestatement;

	public void insert(Connection connection, String name, String type) {
		try {
			String SQL = "{call Insert_Console (?, ?, ?)}";
			callablestatement = connection.prepareCall(SQL);
			callablestatement.setInt(1, Classes.StaticUser.GetID());
			callablestatement.setString(2, name);
			callablestatement.setString(3, type);
			callablestatement.execute();
			callablestatement.close();

		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

	public void update(Connection connection, int ID, String name, String type) {
		try {
			String SQL = "{call Update_Console (?, ?, ?)}";
			callablestatement = connection.prepareCall(SQL);
			callablestatement.setInt(1, ID);
			callablestatement.setString(2, name);
			callablestatement.setString(3, type);
			callablestatement.execute();
			callablestatement.close();

		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

	public void Delete(Connection connection, int ID) {
		try {
			String SQL = "{call Delete_Console (?)}";
			callablestatement = connection.prepareCall(SQL);
			callablestatement.setInt(1, ID);
			callablestatement.execute();
			callablestatement.close();

		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

	public void UpdateTime(Connection connection, int ID) {
		try {
			String SQL = "{ call Log_New_Console_Time (?) }";
			callablestatement = connection.prepareCall(SQL);
			callablestatement.setInt(1, ID);
			callablestatement.execute();
			callablestatement.close();
		} catch (Exception ex) {

		}
	}

}
