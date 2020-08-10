import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
			Queue<Student> student =  new LinkedList<Student>(); 
			student.add(new Student(1,"nguyen minh"));
			student.add(new Student(2,"nguyen huy"));
			student.add(new Student(3,"nguyen tung"));
			student.add(new Student(4,"nguyen h"));
			student.add(new Student(5,"nguyen t"));
			
			for(int i=0;i<student.size();i++) {
				System.out.println(student.poll());
				i--;
			}
			
		
		
	}
	
	
}
