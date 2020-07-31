package assignment5;

import java.util.Scanner;

public class ThiSinhKhoiB extends ThiSinh implements ITuyenSinh {

	

	public void thongtinkhoi() {
		System.out.println("thi mon toan hoa sinh");
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
