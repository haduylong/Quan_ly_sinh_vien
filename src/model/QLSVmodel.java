package model;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;

public class QLSVmodel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ArrayList<ThiSinh> dsThiSinh;
	String luaChon = "";
	File file;
	String tenFile;
	
	public String getTenFile() {
		return tenFile;
	}

	public void setTenFile(String tenFile) {
		this.tenFile = tenFile;
	}

	public String getLuaChon() {
		return luaChon;
	}

	public void setLuaChon(String luaChon) {
		this.luaChon = luaChon;
	}

	public QLSVmodel() {
		super();
		this.dsThiSinh = new ArrayList<ThiSinh>();
		this.luaChon = "";
		this.tenFile ="";
	}

	public ArrayList<ThiSinh> getDsThiSinh() {
		return dsThiSinh;
	}

	public void setDsThiSinh(ArrayList<ThiSinh> dsThiSinh) {
		this.dsThiSinh = dsThiSinh;
	}

	@Override
	public String toString() {
		return "QLSVmodel [dsThiSinh=" + dsThiSinh + "]";
	};
	
	public void themThiSinh(ThiSinh thiSinh) {
		this.dsThiSinh.add(thiSinh);
	}
	
	public void xoaThiSinh(ThiSinh thiSinh) {
		this.dsThiSinh.remove(thiSinh);
	}

}
