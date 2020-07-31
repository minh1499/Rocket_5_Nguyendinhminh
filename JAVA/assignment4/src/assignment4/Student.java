package assignment4;

public class Student {
	private int id;
	private String homeTown;
	private String name;
	private int mark;
	public Student() {
		this.mark=1;
	}
	
	public Student(String name,String homeTown) {
		this.name=name;
		this.homeTown=homeTown;
		this.mark=1;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	public int diemcong(int diemcong) {
		return this.mark=this.mark+diemcong;
	}
	public void inthongtin() {
		System.out.println("thong tin sinh vien la: " + name);
		if(this.mark<4) {
			System.out.println("diem hoc luc yeu");
		}else if(this.mark>=4&&this.mark<6) {
			System.out.println("diem hoc luc trung binh ");
		}else if(this.mark>=6&&this.mark<8) {
			System.out.println("diem hoc luc kha");
	}else {
		System.out.println("diem hoc luc gioi");
	}
		
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", homeTown=" + homeTown + ", name=" + name + ", mark=" + mark + "]";
	}

	}
