
public class Student implements Comparable<Student> {
	private int sbd;
	private String name;
	
	
	public Student(int sbd, String name) {
		super();
		this.sbd = sbd;
		this.name = name;
	}


	public int getSbd() {
		return sbd;
	}


	public void setSbd(int sbd) {
		this.sbd = sbd;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Student [sbd=" + sbd + ", name=" + name + "]";
	}


	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
