package beans;

public class RyeBread implements Bread{

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public RyeBread(String name) {
		this.name = name;
	}
}