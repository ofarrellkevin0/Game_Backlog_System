package Database_Classes;

public class User
{

    private static int ID;
    private static String firstname;
    private static String lastname;
    private static String username;
    private static String password;
    private static int accesslevel;

    public static int GetID()
    {
	return ID;
    }

    public void SetID(int ID)
    {
	User.ID = ID;
    }

    public static String GetFirstname()
    {
	return firstname;
    }

    public void SetFirstname(String firstname)
    {
	User.firstname = firstname;
    }

    public static String GetLastname()
    {
	return lastname;
    }

    public void SetLastname(String lastname)
    {
	User.lastname = lastname;
    }

    public static String GetUsername()
    {
	return username;
    }

    public void SetUsername(String username)
    {
	User.username = username;
    }

    public static String GetPassword()
    {
	return password;
    }

    public void SetPassword(String password)
    {
	User.password = password;
    }

    public static int GetAccesslevel()
    {
	return accesslevel;
    }

    public void SetAccessLevel(int accesslevel)
    {
	User.accesslevel = accesslevel;
    }

}
