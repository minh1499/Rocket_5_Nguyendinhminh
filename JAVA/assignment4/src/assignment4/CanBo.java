package assignment4;

import java.util.Scanner;

public class CanBo {
	private String hoTen;
	private int tuoi;
	private gender gioiTinh;
	private String diaChi;
	


	public CanBo(String hoTen, int tuoi, gender gioiTinh, String diaChi) {
		super();
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
	}

	@Override
	public String toString() {
		return "CanBo [hoTen=" + hoTen + ", tuoi=" + tuoi + ", gioiTinh=" + gioiTinh + ", diaChi=" + diaChi + "]";
	}
	
	




	public String getHoTen() {
		return hoTen;
	}



	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}



	public int getTuoi() {
		return tuoi;
	}



	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}



	public gender getGioiTinh() {
		return gioiTinh;
	}



	public void setGioiTinh(gender gioiTinh) {
		this.gioiTinh = gioiTinh;
	}



	public String getDiaChi() {
		return diaChi;
	}



	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
}
