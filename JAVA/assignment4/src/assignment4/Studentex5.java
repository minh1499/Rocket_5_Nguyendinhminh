package assignment4;

public abstract class Studentex5 extends Person {
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Studentex5(String name,int id) {
		super(name);
		this.id=id;
	}

	@Override
	public String toString() {
		return "Studentex5 [id=" + id + "]";
	}
	
	

}
