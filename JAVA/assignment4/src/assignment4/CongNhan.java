package assignment4;

public class CongNhan extends CanBo {

	public CongNhan(String hoTen, int tuoi, gender gioiTinh, String diaChi,int bac) {
		super(hoTen, tuoi, gioiTinh, diaChi);
		this.bac=bac;
	}

	@Override
	public String toString() {
		return super.toString()+ bac;
	}

	public int getBac() {
		return bac;
	}

	public void setBac(int bac) {
		this.bac = bac;
	}

	private int bac;
	
	
}
