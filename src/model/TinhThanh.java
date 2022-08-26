package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class TinhThanh implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int maTinh;
	String tenTinh;
	
	public TinhThanh(int maTinh, String tenTinh) {
		super();
		this.maTinh = maTinh;
		this.tenTinh = tenTinh;
	}

	public int getMaTinh() {
		return maTinh;
	}

	public void setMaTinh(int maTinh) {
		this.maTinh = maTinh;
	}

	public String getTenTinh() {
		return tenTinh;
	}

	public void setTenTinh(String tenTinh) {
		this.tenTinh = tenTinh;
	}

	@Override
	public String toString() {
		return "TinhThanh [maTinh=" + maTinh + ", tenTinh=" + tenTinh + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(maTinh, tenTinh);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TinhThanh other = (TinhThanh) obj;
		return maTinh == other.maTinh && Objects.equals(tenTinh, other.tenTinh);
	}
	
	public static ArrayList<TinhThanh> dsTinh(){
		String[] dsTenTinh = {"An Giang",
								"Bà Rịa – Vũng Tàu",
								"Bạc Liêu",
								"Bắc Giang",
								"Bắc Kạn",
								"Bắc Ninh",
								"Bến Tre",
								"Bình Dương",
								"Bình Định",
								"Bình Phước",
								"Bình Thuận",
								"Cà Mau",
								"Cao Bằng",
								"Cần Thơ",
								"Đà Nẵng",
								"Đắk Lắk",
								"Đắk Nông",
								"Điện Biên",
								"Đồng Nai",
								"Đồng Tháp",
								"Gia Lai",
								"Hà Giang",
								"Hà Nam",
								"Hà Nội",
								"Hà Tĩnh",
								"Hải Dương",
								"Hải Phòng",
								"Hậu Giang",
								"Hòa Bình",
								"Thành phố Hồ Chí Minh",
								"Hưng Yên",
								"Khánh Hòa",
								"Kiên Giang",
								"Kon Tum",
								"Lai Châu",
								"Lạng Sơn",
								"Lào Cai",
								"Lâm Đồng",
								"Long An",
								"Nam Định",
								"Nghệ An",
								"Ninh Bình",
								"Ninh Thuận",
								"Phú Thọ",
								"Phú Yên",
								"Quảng Bình",
								"Quảng Nam",
								"Quảng Ngãi",
								"Quảng Ninh",
								"Quảng Trị",
								"Sóc Trăng",
								"Sơn La",
								"Tây Ninh",
								"Thái Bình",
								"Thái Nguyên",
								"Thanh Hóa",
								"Thừa Thiên Huế",
								"Tiền Giang",
								"Trà Vinh",
								"Tuyên Quang",
								"Vĩnh Long",
								"Vĩnh Phúc",
								"Yên Bái"};
		ArrayList<TinhThanh> dsTinh = new ArrayList<TinhThanh>();
		for(int i=0;i<63;i++) {
			TinhThanh th = new TinhThanh(i, dsTenTinh[i]);
			dsTinh.add(th);
		}
		
		return dsTinh;
	}
}
