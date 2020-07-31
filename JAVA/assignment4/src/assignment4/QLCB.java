package assignment4;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {

	private ArrayList<CanBo> danhsachcanbo;
	
	public QLCB() {
		danhsachcanbo = new ArrayList<CanBo>();
	}
	
	public void themcanbo(CanBo canbomoi) {
		danhsachcanbo.add(canbomoi);
	}
	
	public void timcanbotheoten(String name) {
		boolean cotimthay=false;
		for(int i=0;i<danhsachcanbo.size();i++) {
			
			if(danhsachcanbo.get(i).getHoTen()==name)
			cotimthay=true;
			System.out.println(danhsachcanbo.get(i));
		}
		if(!cotimthay) {
			System.out.println("ko tim thay");
		}
	}
	
	public void xoacanbotheoten(String name) {
		boolean cotimthay=false;
		for(int i=0;i<danhsachcanbo.size();i++) {
			
			if(danhsachcanbo.get(i).getHoTen()==name)
			cotimthay=true;
			System.out.println(danhsachcanbo.get(i));
			danhsachcanbo.remove(i);
		}
		if(!cotimthay) {
			System.out.println("ko tim thay");
		}
	}
	public void inTatCaCanBo() {
		for(int i=0;i<danhsachcanbo.size();i++) {
			System.out.println(danhsachcanbo.get(i));
		}
	
//	public static void addCanBo() {
//			
//			Scanner scanner =new Scanner(System.in);
//			Scanner close;
//			System.out.println("nhap vao so can bo muon them");
//			int n=scanner.nextInt();
//			System.out.println("nhap vao loai bo 1 la nhan vien 2 la ky su 3 la cong nhan");
//			int option=scanner.nextInt();
//			CanBo canbo=new CanBo();
//			for(int i=0;i<n;i++) {
//				switch(option) {
//				case 1:
//					CanBo canbo3= new NhanVien();
//					break;
//				case 2:
//					CanBo canbo1=new KySu();
//					break;
//				case 3:
//					CanBo canbo2=new CongNhan();
//					break;
//				default:
//					System.out.println("nhap sai");
//					i--;
//					break;
//				
//				}
//				canbo.input();
//			}
	}

}
