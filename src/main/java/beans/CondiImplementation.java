package beans;

public class CondiImplementation implements Coudiment{
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CondiImplementation(String name) {
		this.name = name;
	}
	
	public CondiImplementation() {
	}

	@Override
	public String toString() {
		return "CondiImplementation [name=" + name + "]";
	}
	

}
