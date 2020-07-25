import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ex2 {

	public static void main(String[] args) {
		//ex2
		
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

				Position[] PAccount = { position1, position2 };
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

				Position[] PAccount2 = { position2 };
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

				Position[] PAccount3 = { position3 };
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

//				System.out.println("thong tin group 3");
//				System.out.println("name: "+ group3.groupName);
				// create groupaccount
				GroupAccount groupaccount1 = new GroupAccount();
				Group[] groupa= {group1};
				groupaccount1.groupId = groupa;
				groupaccount1.accountId = account1;
				groupaccount1.joinDate = LocalDate.of(2020, 06, 06);
//				
//				System.out.println("thong tin groupaccount 1");
//				System.out.println("joindate: "+ groupaccount1.joinDate );
				GroupAccount groupaccount2 = new GroupAccount();
				Group[] groupb= {group1};
				groupaccount2.groupId = groupb;
				groupaccount2.accountId = account2;
				groupaccount2.joinDate = LocalDate.of(2020, 06, 06);

//				System.out.println("thong tin groupaccount 2");
//				System.out.println("joindate: "+ groupaccount2.joinDate );

				GroupAccount groupaccount3 = new GroupAccount();
				Group[] groupc= {group3};
				groupaccount3.groupId = groupc;
				groupaccount3.accountId = account3;
				groupaccount3.joinDate = LocalDate.of(2020, 06, 06);

//				System.out.println("thong tin groupaccount 3");
//				System.out.println("joindate: "+ groupaccount3.joinDate );
				// create typequestion
				TypeQuestion typequestion1 = new TypeQuestion();
				typequestion1.typeId = 1;
				typequestion1.typeName = "cau hoi 1";

//				
//				System.out.println("thong tin typequestion 1");
//				System.out.println("name: "+ typequestion1.typeName);

				TypeQuestion typequestion2 = new TypeQuestion();
				typequestion2.typeId = 2;
				typequestion2.typeName = "cau hoi 2";

//				
//				System.out.println("thong tin typequestion 2");
//				System.out.println("name: "+ typequestion2.typeName);

				TypeQuestion typequestion3 = new TypeQuestion();
				typequestion3.typeId = 3;
				typequestion3.typeName = "cau hoi 3";

//				
//				System.out.println("thong tin typequestion 3");
//				System.out.println("name: "+ typequestion3.typeName);
				// crate categoryquestion
				CategoryQuestion categoryquestion1 = new CategoryQuestion();
				categoryquestion1.categoryId = 1;
				categoryquestion1.categoryName = "AAA";

//				
//				System.out.println("thong tin 	categoryquestion 1");
//				System.out.println("name: "+ 	categoryquestion1.categoryName);

				CategoryQuestion categoryquestion2 = new CategoryQuestion();
				categoryquestion2.categoryId = 2;
				categoryquestion2.categoryName = "BBB";

//				System.out.println("thong tin 	categoryquestion 2");
//				System.out.println("name: "+ 	categoryquestion2.categoryName);
				CategoryQuestion categoryquestion3 = new CategoryQuestion();
				categoryquestion3.categoryId = 3;
				categoryquestion3.categoryName = "CCC";

//				System.out.println("thong tin 	categoryquestion 3");
//				System.out.println("name: "+ 	categoryquestion3.categoryName);
				// create question
				Question question1 = new Question();
				question1.questionId = 1;
				question1.content = "chua biet 1";
				question1.categoryId = categoryquestion1;
				question1.typeId = typequestion1;
				question1.creatorId = 1;
				question1.creatorDate = LocalDate.of(2020, 06, 06);

//				System.out.println("thong tin 	question 1");
//				System.out.println("name: "+ 	question1.content);

				Question question2 = new Question();
				question2.questionId = 2;
				question2.content = "chua biet 2";
				question2.categoryId = categoryquestion2;
				question2.typeId = typequestion2;
				question2.creatorId = 2;
				question2.creatorDate = LocalDate.of(2020, 06, 06);

//				System.out.println("thong tin 	question 2");
//				System.out.println("name: "+ 	question2.content);

				Question question3 = new Question();
				question3.questionId = 3;
				question3.content = "chua biet 3";
				question3.categoryId = categoryquestion3;
				question3.typeId = typequestion3;
				question3.creatorId = 3;
				question3.creatorDate = LocalDate.of(2020, 06, 06);

//				System.out.println("thong tin 	question 3");
//				System.out.println("name: "+ 	question3.content);
				// create answer
				Answer answer1 = new Answer();
				answer1.answerId = 1;
				answer1.content = "Dap an 1";
				answer1.isCorrect = Correct.TRUE;

//				System.out.println("thong tin 	answer 1");
//				System.out.println("name: "+ 	answer1.content);

				Answer answer2 = new Answer();
				answer2.answerId = 2;
				answer2.content = "Dap an 2";
				answer2.isCorrect = Correct.FALSE;

//				System.out.println("thong tin 	answer 2");
//				System.out.println("name: "+ 	answer2.content);
				Answer answer3 = new Answer();
				answer3.answerId = 3;
				answer3.content = "Dap an 3";
				answer3.isCorrect = Correct.TRUE;

//				System.out.println("thong tin 	answer 3");
//				System.out.println("name: "+ 	answer3.content);
				// create Exam
				Exam exam1 = new Exam();
				exam1.examId = 1;
				exam1.categoryId = categoryquestion1;
				exam1.code = "AA";
				exam1.creatorId = 1;
				exam1.tiltle = "kiemtramieng";
				exam1.creatorDate = LocalDateTime.of(2020, 06, 06, 10, 05, 05);
				exam1.duration = duration._60phut;
//				
//				System.out.println("thong tin 	exam 1");
//				System.out.println("name: "+ exam1.code);
				Exam exam2 = new Exam();
				exam2.examId = 2;
				exam2.categoryId = categoryquestion2;
				exam2.code = "BB";
				exam2.creatorId = 2;
				exam2.tiltle = "kiemtragiuakia";
				exam2.creatorDate = LocalDateTime.of(2020, 06, 06, 10, 05, 05);
				exam2.duration = duration._90phut;

		//
//				System.out.println("thong tin 	exam 2");
//				System.out.println("name: "+ exam2.code);
//				
				Exam exam3 = new Exam();
				exam3.examId = 3;
				exam3.categoryId = categoryquestion3;
				exam3.code = "CC";
				exam3.creatorId = 3;
				exam3.tiltle = "kiemtracuoiki";
				exam3.creatorDate = LocalDateTime.of(2020, 06, 06, 10, 05, 05);
				exam3.duration = duration._90phut;

		//
//				System.out.println("thong tin 	exam 3");
//				System.out.println("name: "+ exam3.code);
				// create examquestion
				ExamQuestion examquestion1 = new ExamQuestion();
				examquestion1.examId = exam1;
				examquestion1.questionId = question1;

		//
//				System.out.println("thong tin 	examquestion 1");
//				System.out.println("name: "+ examquestion1.examId);
				ExamQuestion examquestion2 = new ExamQuestion();
				examquestion2.examId = exam2;
				examquestion2.questionId = question2;

//				System.out.println("thong tin 	examquestion 2");
//				System.out.println("name: "+ examquestion2.examId);
				ExamQuestion examquestion3 = new ExamQuestion();
				examquestion3.examId = exam3;
				examquestion3.questionId = question3;

//				System.out.println("thong tin 	examquestion 3");
//				System.out.println("name: "+ examquestion3.examId);
//		//q1
//		int a=5;
//		System.out.printf("%d %n",a);
//		
//		//q2
//		int b=100000000;
//		System.out.printf("%,d%n",b);
//		
//		//q3
//		float c= (float) 5.656475;
//		System.out.printf("%.4f %n",c);
//		
//		//q4
//		String d="Nguyen van A";
//		System.out.println("ten toi la " +d + " va toi dang lam bai");
//		
//		//q5
//		LocalDate homnay = LocalDate.of(2020, 06, 06);
//		System.out.println(homnay);
//		
//		LocalDateTime today = LocalDateTime.now();
//		String formattedDate = today.format(DateTimeFormatter.ofPattern("dd-MM-yyyy hh-mm-ss"));	 
//		System.out.println(formattedDate);
//		
		//q6
		Account[] accounts = { account1, account2, account3 };
		System.out.println( "Email            fullName                     department" );
		for (Account account : accounts) {
		System.out.println(account.email  + " " + account.fullName  + account.departmentId.departmentName );
		}
			
		
	}

}
