package assignment4;

public class Main {

	public static void main(String[] args) {
//		HighSchoolStudent student1= new HighSchoolStudent("minh", 18, "chuyen van ", "DHCN") {
//		};
//		System.out.println(student1);
		
//		QLCB manager=new QLCB();
//		manager.themcanbo(new NhanVien("luc",18,gender.KHAC,"lua","lua"));
//	
//		manager.inTatCaCanBo();
		
		VietnamesePhone sdt= new VietnamesePhone();
		sdt.insertContact("minh", "123");
		sdt.insertContact("huy", "456");
		sdt.inthongtin();
		sdt.removeContact("minh");
		sdt.inthongtin();
		sdt.updateContact("huy", "789");
		sdt.inthongtin();
		
	}

}
