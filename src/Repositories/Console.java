package Repositories;

public class Console
{

    private  int id;
    private String name;
    private  String type;

    public Console(int id, String type, String name)
    {
	this.id = id;
	this.name = name;
	this.type = type;
    }

    public  int getId()
    {
	return id;
    }

    public  void setId(int id)
    {
	this.id = id;
    }

    public  String getName()
    {
	return name;
    }

    public  void setName(String name)
    {
	this.name = name;
    }
    
        public  String getType()
    {
	return type;
    }

    public void setType(String name)
    {
	this.type = name;
    }

    @Override
    public String toString()
    {
	return name;
    }
}
