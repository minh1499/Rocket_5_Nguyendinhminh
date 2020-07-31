package assignment5;

import java.util.Scanner;

public class ThiSinhKhoiC extends ThiSinh implements ITuyenSinh {

	
	
	

	public void thongtinkhoi() {
		System.out.println("thi mon van su dia");
	}

	@Override
	public void input() {
	super.input();
	}
	public void inthongtin() {
		super.inthongtin();
		thongtinkhoi();
	}
}
