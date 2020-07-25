import java.time.LocalDate;

public class ex6 {

	public static void main(String[] args) {
		
//		q1
		insonguyenduongchannhohon10();
//		q2
		inrathongtincacaccount();
//		q3 
		inrasonguyenduongnhohon10();
		
		
}

	private static void inrasonguyenduongnhohon10() {
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
	}

	private static void inrathongtincacaccount() {
		// create department
				Department department1 = new Department();
				department1.departmentId = 1;
				department1.departmentName = "sale";

//				System.out.println("thong tin phong ban 1");
//				System.out.println("name: "+ department1.departmentName);

				Department department2 = new Department();
				department2.departmentId = 2;
				department2.departmentName = "marketing";

//				System.out.println("thong tin phong ban 2");
//				System.out.println("name: "+ department2.departmentName);

				Department department3 = new Department();
				department3.departmentId = 3;
				department3.departmentName = "manager";
//				
//				System.out.println("thong tin phong ban 2");
//				System.out.println("name: "+ department2.departmentName);

				// create position
				Position position1 = new Position();
				position1.positionID = 1;
				position1.positionName = "nv1";
//				
//				System.out.println("thong tin position 1");
//				System.out.println("name: "+ position1.positionName);

				Position position2 = new Position();
				position2.positionID = 2;
				position2.positionName = "nv2";
//				
//				System.out.println("thong tin position 2");
//				System.out.println("name: "+ position2.positionName);
//				
				Position position3 = new Position();
				position3.positionID = 3;
				position3.positionName = "nv3";
//				
//				System.out.println("thong tin position 3");
//				System.out.println("name: "+ position3.positionName);
				// create account
				Account account1 = new Account();
				account1.accountId = 1;
				account1.email = "nguyendinhminh@gmail.com";
				account1.userName = "Minh";
				account1.fullName = "Nguyen Dinh Minh";

				account1.departmentId = department1;

				
				account1.positionId = position1;
				account1.createDate = LocalDate.of(2020, 06, 06);
//				
//				System.out.println("thong tin account 1");
//				System.out.println("name: "+ account1.fullName);

				Account account2 = new Account();
				account2.accountId = 2;
				account2.email = "ledanghuy@gmail.com";
				account2.userName = "Huy";
				account2.fullName = "Le Dang Huy";

				account2.departmentId = department2;

				
				account2.positionId = position2;
				account2.createDate = LocalDate.of(2020, 06, 06);

//				System.out.println(account2.departmentId);

//				System.out.println("thong tin account 2");
//				System.out.println("name: "+ account2.fullName);
				Account account3 = new Account();
				account3.accountId = 3;
				account3.email = "nguyensontung@gmail.com";
				account3.userName = "tung";
				account3.fullName = "Nguyen Son Tung";

				account3.departmentId = department3;

			
				account3.positionId = position3;
				account3.createDate = LocalDate.of(2020, 06, 06);

		//
//				System.out.println("thong tin account 3");
//				System.out.println("name: "+ account3.fullName);
				// create group
				Group group1 = new Group();
				group1.groupId = 1;
				group1.groupName = "groupA";
				group1.creatorId = 1;
				group1.createDate = LocalDate.of(2020, 06, 06);

//				System.out.println("thong tin group 1");
//				System.out.println("name: "+ group1.groupName);

				Group group2 = new Group();
				group2.groupId = 2;
				group2.groupName = "groupB";
				group2.creatorId = 2;
				group2.createDate = LocalDate.of(2020, 06, 06);
//				
//				System.out.println("thong tin group 2");
//				System.out.println("name: "+ group2.groupName);
				Group group3 = new Group();
				group3.groupId = 3;
				group3.groupName = "groupC";
				group3.creatorId = 3;
				group3.createDate = LocalDate.of(2020, 06, 06);
				System.out.println("in ra thông tin các account");
				Account[] accounts = {account1,account2,account3};
					for (int i = 0; i < accounts.length; i++) {
						System.out.println("Thông tin account thứ " + (i + 1) + " là :");
						System.out.println("Email: " + accounts[i].email);
						System.out.println("Fullname: " + accounts[i].fullName);
						System.out.println("Department: " + accounts[i].departmentId.departmentName);
					}
				
				
	}

	private static void insonguyenduongchannhohon10() {
		System.out.println("in ra cac so chan nguyen duong nho hon 10");
		for(int i=0;i<=10;i++) {
			if(i%2==1) {continue;
		}
			else {
				System.out.println(i);
			}
	}
	}
}
