package ex2;

import java.time.LocalDate;
import java.util.Comparator;

public class Student implements Comparable<Student> {
	private int id;
	private String name;
	private LocalDate ngaysinh;
	private int diem;
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
	public LocalDate getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(LocalDate ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	public int getDiem() {
		return diem;
	}
	public void setDiem(int diem) {
		this.diem = diem;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", ngaysinh=" + ngaysinh + ", diem=" + diem + "]";
	}
	public Student(int id, String name,int diem) {
		super();
		this.id = id;
		this.name = name;
		this.diem = diem;
	}
	@Override
	public int compareTo(Student other) {
		return this.name.compareTo(other.name);
	}
	

	
	
}
