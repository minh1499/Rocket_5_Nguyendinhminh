package assignment7;

public class HinhTron extends HinhHoc  implements TinhToan {

	private int bankinh;
	
	public HinhTron(int bankinh) throws HinhHocException {
		super();
		this.bankinh=bankinh;
	}
	@Override
	public void tinhchuvi() {
		System.out.println(2*Math.PI*this.bankinh);
	}

	@Override
	public void tinhdientinh() {
		System.out.println(this.bankinh*this.bankinh*Math.PI);
	}

}
