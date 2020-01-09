package Classes;

public class Game {

	private int id;
	private String name;
	private String type;
	private String status;

	public Game(int id, String type, String status, String name) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String name) {
		this.type = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return name;
	}
}
