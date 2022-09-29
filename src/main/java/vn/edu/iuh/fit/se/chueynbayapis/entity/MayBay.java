package vn.edu.iuh.fit.se.chueynbayapis.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "maybay")
public class MayBay {
	@Id
	private int MaMB;
	private String Loai;
	private int TamBay;
	@OneToMany(mappedBy = "mayBay")
	private List<ChungNhan> dsChungNhan = new ArrayList<ChungNhan>();
	public MayBay(int maMB, String loai, int tamBay) {
		super();
		MaMB = maMB;
		Loai = loai;
		TamBay = tamBay;
	}
	public MayBay() {
		super();
	}
	public MayBay(int maMB) {
		super();
		MaMB = maMB;
	}
	public int getMaMB() {
		return MaMB;
	}
	public void setMaMB(int maMB) {
		MaMB = maMB;
	}
	public String getLoai() {
		return Loai;
	}
	public void setLoai(String loai) {
		Loai = loai;
	}
	public int getTamBay() {
		return TamBay;
	}
	public void setTamBay(int tamBay) {
		TamBay = tamBay;
	}
	@Override
	public String toString() {
		return "MayBay [MaMB=" + MaMB + ", Loai=" + Loai + ", TamBay=" + TamBay + "]";
	}
	
	
}
