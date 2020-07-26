package assignment3;

import java.time.LocalDate;

public class ex2 {

	public static void main(String[] args) {
		Account[] accounts =new Account[5];
		for (int i=0;i<accounts.length;i++) {
			System.out.println("thong tin account thu"+ (i+1) +" la");
			System.out.println("email: email " + (i+1) );
			System.out.println("username: username "+(i+1));
			System.out.println("fullname: fullname " + (i+1) );
			System.out.println("createdate " + LocalDate.now());
		}
	}

}
