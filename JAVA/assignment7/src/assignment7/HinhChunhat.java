package assignment7;

public class HinhChunhat extends HinhHoc implements TinhToan {
	
	private int chieudai;
	private int chieurong;
	
	public HinhChunhat(int chieudai,int chieurong) throws HinhHocException {
		super();
		this.chieudai=chieudai;
		this.chieurong=chieurong;
	}

	@Override
	public void tinhchuvi() {
		System.out.println((this.chieudai+this.chieurong)*2);
	}

	@Override
	public void tinhdientinh() {
		System.out.println(this.chieudai*this.chieurong);
	}

}
