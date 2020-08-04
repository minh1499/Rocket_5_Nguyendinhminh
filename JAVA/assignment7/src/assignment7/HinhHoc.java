package assignment7;



public class HinhHoc {
	static int count=0;
	public HinhHoc() throws HinhHocException{
		count++;
		if(count>=5) {
			throw new HinhHocException("so luong hinh toi da la  "+ Configs.so_luong_hinh_hoc );
		}
	}
}
