package assignment5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		TuyenSinh tuyensinh=new TuyenSinh();
		
		Scanner scanner=new Scanner(System.in);
		Scanner close;
		int a;
		do {
			System.out.println("moi ban nhap vao chuong trinh muon thuc hien ");
			System.out.println("bam phim 1 de them thi sinh");
			System.out.println("bam phim 2 de in thong tin thi sinh");
			System.out.println("bam phim 3 de tiem kiem theo so bao danh");
			System.out.println( "bam phim 4 de thoat");
			a=scanner.nextInt();
			switch (a) {
			case 1 :
				tuyensinh.themthisinh();
				break;
			case 2:
				tuyensinh.inthongtinthisinh();
				break;
			case 3:
				tuyensinh.timkiemtheosobaodanh();
				break;
			case 4:
				break;
				default:
					System.out.println("nhap sai roi");
					break;
						}
	}while (a!=4) ;
}
}
