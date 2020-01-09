package Classes;

public class StaticUser {

	private static int ID;
	private static String firstname;
	private static String lastname;
	private static String username;
	private static String password;
	private static int accesslevel;

	public static int GetID() {
		return ID;
	}

	public void SetID(int ID) {
		StaticUser.ID = ID;
	}

	public static String GetFirstname() {
		return firstname;
	}

	public void SetFirstname(String firstname) {
		StaticUser.firstname = firstname;
	}

	public static String GetLastname() {
		return lastname;
	}

	public void SetLastname(String lastname) {
		StaticUser.lastname = lastname;
	}

	public static String GetUsername() {
		return username;
	}

	public void SetUsername(String username) {
		StaticUser.username = username;
	}

	public static String GetPassword() {
		return password;
	}

	public void SetPassword(String password) {
		StaticUser.password = password;
	}

	public static int GetAccesslevel() {
		return accesslevel;
	}

	public void SetAccessLevel(int accesslevel) {
		StaticUser.accesslevel = accesslevel;
	}

}
