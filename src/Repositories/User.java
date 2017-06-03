package Repositories;

public class User
{

    private String username;
    private String firstname;
    private String lastname;
    private int accesslevel;
    private int ID;

    public User(int ID, String Firstname, String Lastname, String Username, int Accesslevel)
    {
	this.ID = ID;
	this.username = Username;
	this.firstname = Firstname;
	this.lastname = Lastname;
	this.accesslevel = Accesslevel;
    }

    public String getUsername()
    {
	return username;
    }

    public String getFirstName()
    {
	return firstname;
    }

    public String getLastName()
    {
	return lastname;
    }

    public int getAccessLevel()
    {
	return accesslevel;
    }

    public int getID()
    {
	return ID;
    }
}
