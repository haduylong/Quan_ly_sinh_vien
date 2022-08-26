package model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class ThiSinh implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int maThiSinh;
	String tenThiSinh;
	TinhThanh queQuan;
	Date ngaySinh;
	boolean gioiTinh;
	double diemMon1, diemMon2, diemMon3;
	
	public ThiSinh(int maThiSinh, String tenThiSinh, TinhThanh queQuan, Date ngaySinh, boolean gioiTinh,
			double diemMon1, double diemMon2, double diemMon3) {
		super();
		this.maThiSinh = maThiSinh;
		this.tenThiSinh = tenThiSinh;
		this.queQuan = queQuan;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.diemMon1 = diemMon1;
		this.diemMon2 = diemMon2;
		this.diemMon3 = diemMon3;
	}

	public int getMaThiSinh() {
		return maThiSinh;
	}

	public void setMaThiSinh(int maThiSinh) {
		this.maThiSinh = maThiSinh;
	}

	public String getTenThiSinh() {
		return tenThiSinh;
	}

	public void setTenThiSinh(String tenThiSinh) {
		this.tenThiSinh = tenThiSinh;
	}

	public TinhThanh getQueQuan() {
		return queQuan;
	}

	public void setQueQuan(TinhThanh queQuan) {
		this.queQuan = queQuan;
	}

	public java.util.Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(java.util.Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public boolean isGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public double getDiemMon1() {
		return diemMon1;
	}

	public void setDiemMon1(double diemMon1) {
		this.diemMon1 = diemMon1;
	}

	public double getDiemMon2() {
		return diemMon2;
	}

	public void setDiemMon2(double diemMon2) {
		this.diemMon2 = diemMon2;
	}

	public double getDiemMon3() {
		return diemMon3;
	}

	public void setDiemMon3(double diemMon3) {
		this.diemMon3 = diemMon3;
	}

	@Override
	public String toString() {
		return "ThiSinh [maThiSinh=" + maThiSinh + ", tenThiSinh=" + tenThiSinh + ", queQuan=" + queQuan + ", ngaySinh="
				+ ngaySinh + ", gioiTinh=" + gioiTinh + ", diemMon1=" + diemMon1 + ", diemMon2=" + diemMon2
				+ ", diemMon3=" + diemMon3 + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(diemMon1, diemMon2, diemMon3, gioiTinh, maThiSinh, ngaySinh, queQuan, tenThiSinh);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ThiSinh other = (ThiSinh) obj;
		return Double.doubleToLongBits(diemMon1) == Double.doubleToLongBits(other.diemMon1)
				&& Double.doubleToLongBits(diemMon2) == Double.doubleToLongBits(other.diemMon2)
				&& Double.doubleToLongBits(diemMon3) == Double.doubleToLongBits(other.diemMon3)
				&& gioiTinh == other.gioiTinh && maThiSinh == other.maThiSinh
				&& Objects.equals(ngaySinh, other.ngaySinh) && Objects.equals(queQuan, other.queQuan)
				&& Objects.equals(tenThiSinh, other.tenThiSinh);
	}
	
	
}
