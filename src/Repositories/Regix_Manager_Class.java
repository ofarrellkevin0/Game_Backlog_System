package Repositories;

public class Regix_Manager_Class
{

    public boolean Is_Characters(String s)
    {
	String pattern = "^[a-zA-Z]{4,20}$";
	return s.matches(pattern);
    }

    public boolean Is_Characters_And_Numbers(String s)
    {
	String pattern = "^[a-zA-Z0-9]{3,20}$";
	return s.matches(pattern);
    }
    
    public boolean Is_Characters_And_Numbers_Password(String s)
    {
	String pattern = "^[a-zA-Z0-9]{6,20}$";
	return s.matches(pattern);
    }

    public boolean is_Numers(String s)
    {
	String pattern = "^[0-9]{1,10}$";
	return s.matches(pattern);
    }

}
