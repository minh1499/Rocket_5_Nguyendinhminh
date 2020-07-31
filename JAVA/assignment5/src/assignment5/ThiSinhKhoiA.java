package assignment5;

import java.util.Scanner;

public class ThiSinhKhoiA extends ThiSinh implements ITuyenSinh {


	

	public void thongtinkhoi() {
		System.out.println("thi mon toan ly hoa");
	}

	@Override
	public void input() {
	super.input();
	
	}

	@Override
	public String toString() {
		return super.toString();
	}
	public void inthongtin() {
		super.inthongtin();
		thongtinkhoi();
	}
	
}
