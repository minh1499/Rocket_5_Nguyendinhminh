package assignment5;

import java.util.ArrayList;
import java.util.Scanner;


public class TuyenSinh {

private ArrayList<ThiSinh> danhsachthisinh;
	
	public TuyenSinh() {
		danhsachthisinh = new ArrayList<ThiSinh>();
	}

	public void themthisinh() {
		Scanner scanner=new Scanner(System.in);
		Scanner close;
		System.out.println("nhap vao thi sinh muon them");
		int n=scanner.nextInt();
		for(int i=0;i<n;i++) {
		System.out.println("moi ban nhap vao khoi cua thi sinh (A-B-C)");
		String khoi=scanner.next();
		ThiSinh thisinh=new ThiSinh();
		
		switch(khoi) {
		case "A" :
			 thisinh=new ThiSinhKhoiA();
			break;
		case "B" :
			 thisinh=new ThiSinhKhoiB();
			break;
		case "C" :
			 thisinh=new ThiSinhKhoiC();
			break;
		}
		thisinh.input();
		danhsachthisinh.add(thisinh);
		}
		
	}
	
	
	public void inthongtinthisinh() {
		for(int i=0;i<danhsachthisinh.size();i++) {
			danhsachthisinh.get(i).inthongtin();
		}
	}
	
	public void timkiemtheosobaodanh(){
		Scanner scanner=new Scanner(System.in);
		Scanner close;
		System.out.println("moi ban nhap thi sinh muon tim kiem");
		int sbd=scanner.nextInt();
		for(int i=0;i<danhsachthisinh.size();i++) {
			if(danhsachthisinh.get(i).getSbd()==sbd) {
				danhsachthisinh.get(i).inthongtin();
			}
		}
	}
	
}
