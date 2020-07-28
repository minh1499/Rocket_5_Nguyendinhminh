package assignment3;

import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {
//		q1
		Scanner scanner = new Scanner(System.in);
		Scanner close;
//		System.out.println("nhap vao 1 sau ki tu ");
//		String a=scanner.nextLine();
//		char khoangtrang=' ';
//		int count=a.length();
//		for (int i=0;i<a.length();i++) {
//			if (a.charAt(i)== khoangtrang) {
//				count--;
//			}
//		}
//		System.out.println("so ki tu cua chuoi la " + count);

//		q2
//		System.out.println("nhap sau ki tu s1");
//		String s1=scanner.nextLine();
//		
//		System.out.println("nhap sau ki tu s2");
//		String s2=scanner.nextLine();
//		System.out.println("chuoi nhan duoc la " +s1+s2);
//		
//		q3
//		System.out.println("nhap ten");
//		String ten=scanner.nextLine();
//		String mahoa = ten.substring(0, 1).toUpperCase() + ten.substring(1); 
//		System.out.println(mahoa);

//		q4
//		System.out.println("nhap ten");
//		String ten=scanner.nextLine();
//		for (int i=0;i<ten.length();i++) {
//			System.out.println("ky tu thu"+ (i+1) +" la: " + ten.charAt(i));
//		}
//		q5
//		System.out.println("moi ban nhap ho");
//		String ho=scanner.nextLine();
//		System.out.println("moi ban nhap ten");
//		String ten=scanner.nextLine();
//		System.out.println("ho va ten la " + ho + ten);
//		q6
//		System.out.println("moi ban nhap ho va ten chi nhap 3 tieng");
//		String hovaten=scanner.nextLine(); 
//		String[] words=hovaten.split("\\s"); 
//		//su dung vong lap foreach de in cac phan tu trong mang chuoi  
//		System.out.println("ho :" + words[0]);
//		System.out.println("ten dem: "+ words[1]);
//		System.out.println("ten :" + words[2]);

//		q7
//		System.out.println("moi ban nhap ho va ten chi nhap 3 tieng");
//		String hovaten=scanner.nextLine(); 
//		char khoangtrang= ' ';
//		String[] words=hovaten.split("\\s"); 
//		//su dung vong lap foreach de in cac phan tu trong mang chuoi  
//		System.out.println("ho :" + words[0]);
//		System.out.println("ten dem: "+ words[1]);
//		System.out.println("ten :" + words[2]);
//		System.out.println("hovaten " +words[0]+khoangtrang+ words[1]+khoangtrang+words[2]);
//		String a = words[0].substring(0, 1).toUpperCase() + words[0].substring(1);
//		String b = words[1].substring(0, 1).toUpperCase() + words[1].substring(1);
//		String c = words[2].substring(0, 1).toUpperCase() + words[2].substring(1);
//		System.out.println("hovaten " +a+khoangtrang+ b+khoangtrang+c);

////		q10
//		System.out.println("nhap vao chuoi a");
//		String a=scanner.nextLine();
//		System.out.println("nhap vao chuoi b");
//		String b=scanner.nextLine();
//		char[] c = b.toCharArray();
//		 int begin=0;
//		    int end=c.length-1;
//		    char temp;
//		    while(end>begin){
//		        temp = c[begin];
//		        c[begin]=c[end];
//		        c[end] = temp;
//		        end--;
//		        begin++;
//		    }
//		    
//		    String d=String.valueOf(c);
//		    
//		   if(a.equals(d)) {
//			   System.out.println("OK");
//		   }else {
//			   System.out.println("KO");
//		   }
//		
//		q11
//		char kytu='a';
//		System.out.println("nhap vao 1 chuoi");
//		String b=scanner.nextLine();
//		char[] c=b.toCharArray();
//		int count=0;
//		for(int i=0;i<c.length;i++) {
//			if(c[i]==kytu) {
//				count++;
//			}
//		}
//		System.out.println("so ky tu a trong chuoi la "+count);

//		q12 nhu q10

//		q13
//		System.out.println("nhap vao 1 chuoi");
//		String a=scanner.nextLine();
//		 boolean containsDigit = false;
//		 
//		   
//		        for (char c : a.toCharArray()) {
//		            if (containsDigit = Character.isDigit(c)) {
//		                System.out.println("false");
//		            }else {
//		            	System.out.println("true");
//		            }
//		        }

//			q14
//		System.out.println("nhap chuoi");
//		String a=scanner.nextLine();
//		String b=a.replace('e', '*');
//		System.out.println(b);

//		q15
//
//		System.out.println("nhap chuoi");
//		String a = scanner.nextLine();
//		String[] words = a.split("\\s");
//
//		int begin = 0;
//		int end = words.length - 1;
//		String temp;
//		while (end > begin) {
//			temp = words[begin];
//			words[begin] = words[end];
//
//			words[end] = temp;
//			end--;
//			begin++;
//
//		}
//		System.out.println("chuoi nhan duoc la");
//		for(int i=0;i<words.length;i++) {
//			System.out.print(words[i]+" ");
//		}
		
//		q16
		System.out.println("mời bạn nhập chuỗi");
		String a = scanner.nextLine();
		System.out.println("nhap số nguyên n");
		int n=scanner.nextInt();
		char[] b=a.toCharArray();
		if(b.length%n==0) {
			for(int i=0;i<b.length;i=i+n){
//				System.out.println(a.substring);
			}
		}else {
			System.out.println("khong chia duoc");
		}
		
	
		
	}

}
