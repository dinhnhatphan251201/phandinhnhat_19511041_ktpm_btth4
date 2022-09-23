package vn.edu.iuh.fit.se.chueynbayapis.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "nhanvien")
public class NhanVien {
	@Id
	private String MaNV;
	private String Ten;
	private int Luong;
	
	@OneToMany(mappedBy = "nhanVien")
	private List<ChungNhan> dsChungNhan;
	
	@OneToMany(mappedBy = "chuyenBay")
	private List<ChuyenBay> dsChuyenBay;
	
	public NhanVien(String maNV, String ten, int luong) {
		super();
		MaNV = maNV;
		Ten = ten;
		Luong = luong;
	}
	public NhanVien() {
		super();
	}
	public NhanVien(String maNV) {
		super();
		MaNV = maNV;
	}
	public String getMaNV() {
		return MaNV;
	}
	public void setMaNV(String maNV) {
		MaNV = maNV;
	}
	public String getTen() {
		return Ten;
	}
	public void setTen(String ten) {
		Ten = ten;
	}
	public int getLuong() {
		return Luong;
	}
	public void setLuong(int luong) {
		Luong = luong;
	}
	@Override
	public String toString() {
		return "NhanVien [MaNV=" + MaNV + ", Ten=" + Ten + ", Luong=" + Luong + "]";
	}
	
	
	
	
}
