package assignment4;

public class KySu extends CanBo {
	

	

	public KySu(String hoTen, int tuoi, gender gioiTinh, String diaChi, String nganhDaoTao) {
		super(hoTen, tuoi, gioiTinh, diaChi);
		this.nganhDaoTao = nganhDaoTao;
	}

	public String getNganhDaoTao() {
		return nganhDaoTao;
	}

	public void setNganhDaoTao(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}
	
	@Override
	public String toString() {
		return super.toString()+ nganhDaoTao;
	}

	private String nganhDaoTao;
}
