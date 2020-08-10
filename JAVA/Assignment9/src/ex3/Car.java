package ex3;

public class Car {
	private String name;
	private String type;
	@Override
	public String toString() {
		return "Car [name=" + name + ", type=" + type + "]";
	}
	public Car(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}
	public class Engine{
		public String engineType;

		public String getEngineType() {
			return engineType;
		}

		public void setEngineType(String engineType) {
			this.engineType = engineType;
		}
	}
	
	
}
