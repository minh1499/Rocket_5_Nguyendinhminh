package assignment4;

public abstract class HighSchoolStudent extends Studentex5 {
	private String clazz;
	public String getClazz() {
		return clazz;
	}
	public void setClazz(String clazz) {
		this.clazz = clazz;
	}
	public String getDesiredUniversity() {
		return desiredUniversity;
	}
	public void setDesiredUniversity(String desiredUniversity) {
		this.desiredUniversity = desiredUniversity;
	}
	private String desiredUniversity;
	public HighSchoolStudent(String name, int id,String clazz,String desiredUniversity) {
		super(name, id);
		this.clazz=clazz;
		this.desiredUniversity=desiredUniversity;
	}
	
	

}
