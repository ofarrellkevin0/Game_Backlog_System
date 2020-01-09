package Repositories;

import java.sql.CallableStatement;
import java.sql.Connection;

public class Game_Repository {

	CallableStatement callablestatement;

	public void insert(Connection connection, int ID, String name, String type, String Status) {
		try {
			String SQL = "{call Insert_Game (?, ?, ?, ?)}";
			callablestatement = connection.prepareCall(SQL);
			callablestatement.setInt(1, ID);
			callablestatement.setString(2, name);
			callablestatement.setString(3, type);
			callablestatement.setString(4, Status);
			callablestatement.execute();
			callablestatement.close();

		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

	public void update(Connection connection, int ID, String name, String type, String Status) {
		try {
			String SQL = "{call Update_Game (?, ?, ?, ?)}";
			callablestatement = connection.prepareCall(SQL);
			callablestatement.setInt(1, ID);
			callablestatement.setString(2, name);
			callablestatement.setString(3, type);
			callablestatement.setString(4, Status);
			callablestatement.execute();
			callablestatement.close();

		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

	public void delete(Connection connection, int ID) {
		try {
			String SQL = "{call Delete_Game (?)}";
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
			String SQL = "{ call Log_New_Game_Time (?) }";
			callablestatement = connection.prepareCall(SQL);
			callablestatement.setInt(1, ID);
			callablestatement.execute();
			callablestatement.close();
		} catch (Exception ex) {

		}
	}

}
