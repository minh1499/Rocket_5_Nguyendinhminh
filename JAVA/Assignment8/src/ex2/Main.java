package ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		List<Student> student= new ArrayList<Student>();
		student.add(new Student(2,"Minh",3));
		student.add(new Student(3,"Tinh",10));
		student.add(new Student(4,"Kinh",9));
		student.add(new Student(5,"Binh",8));
		student.add(new Student(7,"Minh",7));
		student.add(new Student(6,"Minh",7));
		
//		Collections.sort(student);
//		for (Student st: student) {
//			System.out.println(st);
//		}
		
		Comparator<Student> sortbyname=new SortByName();
		Comparator<Student> sortbydiem=new SortByDiem();
		Comparator<Student> sortbyid=new SortById();
		
		Collections.sort(student,sortbyname.thenComparing(sortbydiem).thenComparing(sortbyid));
		for (Student st: student) {
			System.out.println(st);
		}
		
		
		
	}
	

}
