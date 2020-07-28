package assignment3;

public class ex6 {
	public static void main(String[] args) {
		Department department1=new Department();
		department1.departmentId=1;
		department1.departmentName="A";
		
		Department department2=new Department();
		department2.departmentId=2;
		department2.departmentName="A";
		
		Department department3=new Department();
		department3.departmentId=3;
		department3.departmentName="A";
		
////		ex1
//		System.out.println(department1.toString());
////		ex2
//		Department[] departments = {department1,department2,department3};
//		for(Department department : departments) {
//			System.out.println(department.toString());
////			ex3
//			System.out.println(department1.hashCode());
////			ex4
//			if(department1.departmentName=="A") {
//				System.out.println("true");
//			}else {
//				System.out.println("false");
//			}
//		q5
		System.out.print(department1.equals(department2));
		
	}
}
