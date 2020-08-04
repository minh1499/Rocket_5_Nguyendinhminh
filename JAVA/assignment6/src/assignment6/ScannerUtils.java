package assignment6;

import java.util.Scanner;

public class ScannerUtils {
	public static void inputInt(String errorMessage ) {
		Scanner scanner=new Scanner(System.in);
		Scanner close;
		int a;
		boolean test=false;
		
			do {
				System.out.println("moi ban nhao vao so  ");
				String c=scanner.nextLine();
				
			try {
				int b=Integer.parseInt(c);
				if(b<0) {
					System.err.println("khong duoc nhap so nho hon 0");	
				}else { test=true;
					System.out.println("tuoi cua ban vua nhap la "+ c);
					 
				}
				} catch(NumberFormatException e) {
					System.out.println(errorMessage);
					}
					}
		while(!test);
		
	
}
}
