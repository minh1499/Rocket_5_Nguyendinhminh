package assignment3;

import java.util.Random;
import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
//		q1
		
		float a1=(float)5240.5f;
		float a2=(float)10970.055f;
		int luong1=(int)a1;
		int luong2=(int)a2;
		System.out.println(a1);
		System.out.println(a2);
		System.out.println( luong1);
		System.out.println( luong2);		
	
//	q2 lay ngau nhien 1 so co nho hon hoac bang 5 chu so neu so co 4 chu so thi them chu so 0 o dau
		Random random =new Random();
		int option= random.nextInt(2);
		switch(option) {
		case 0: System.out.println("in ra so co 5 chu so");
		int a = random.nextInt((99999-10000+1)+10000);
		System.out.println(a);
		break;
		case 1: System.out.println("in ra so co 4 chu so");
		int b = random.nextInt((9999-1000+1)+1000);
		String c="0";
		System.out.println(c+b);
		}
//	q3
//		c2
		System.out.println("in ra so co 5 chu so");
		int a = random.nextInt((99999-10000+1)+10000);
		System.out.println(a);
		int d = a%100;
		System.out.println(d);
		
//		c1
		String s=String.valueOf(a);
		String e=s.substring(3);
		System.out.println(e);
		
//	q4
		thuongab();
		
		
		
		
		
	
	}

	private static void thuongab() {
		Scanner scanner =new Scanner(System.in);
		Scanner close;
		System.out.println("nhap so a");
		int a=scanner.nextInt();
		System.out.println("nhap so b");
		int b=scanner.nextInt();
		float c= (float) a/b;
		System.out.println(c);
	}
	
}
