package assignment5;

import java.util.Scanner;

public  class ThiSinh {
	@Override
	public String toString() {
		return "ThiSinh [sbd=" + sbd + ", hoTen=" + hoTen + ", diaChi=" + diaChi + ", mucUuTien=" + mucUuTien + "]";
	}
	
	public void inthongtin() {
		System.out.println(sbd+" "+ hoTen+" "+ diaChi+" " + mucUuTien);
	}
	
	
	private int sbd;
	private String hoTen;
	private String diaChi;
	private int mucUuTien;
	
	
	
//	public abstract void ThiSinh(int sbd, String hoTen, String diaChi, int mucUuTien);
	

	public int getSbd() {
		return sbd;
	}

	public void setSbd(int sbd) {
		this.sbd = sbd;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public int getMucUuTien() {
		return mucUuTien;
	}

	public void setMucUuTien(int mucUuTien) {
		this.mucUuTien = mucUuTien;
	}
	
	public  void input() {
	
		Scanner scanner= new Scanner(System.in);
		Scanner close;
		System.out.println("moi ban nhap vao sbd thi sinh");
		this.sbd=scanner.nextInt();
		scanner.nextLine();
		System.out.println("moi ban nhap vao ten thi sinh");
		this.hoTen=scanner.nextLine();
		System.out.println("moi ban nhap vao diachi thi sinh");
		this.diaChi=scanner.nextLine();
		System.out.println("moi ban nhap vao mucuutien thi sinh");
		this.mucUuTien=scanner.nextInt();
	}
	
	
	
}

