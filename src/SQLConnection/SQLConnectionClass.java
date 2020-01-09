package SQLConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class SQLConnectionClass {
	private final String URL = "jdbc:mysql://localhost:8889/gamebacklog";
	private final String DB_Username = "root";
	private final String DB_Password = "root";

	public final Connection Connect() {

		try {
			return DriverManager.getConnection(URL, DB_Username, DB_Password);
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "There was a problem connecting to the database.");
			System.out.print(ex);
			System.exit(0);
			return null;
		}
	}
}
