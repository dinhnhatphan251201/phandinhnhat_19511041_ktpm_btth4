package vn.edu.iuh.fit.se.chueynbayapis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.edu.iuh.fit.se.chueynbayapis.entity.NhanVien;
import vn.edu.iuh.fit.se.chueynbayapis.repository.NhanVienRepository;
import vn.edu.iuh.fit.se.chueynbayapis.service.INhanVienService;

@Service
public class NhanVienServiceImpl implements INhanVienService{
	
	@Autowired
	private NhanVienRepository nhanVienRepository;

	@Override
	public List<NhanVien> findAllNhanVienByLuongLessThanEqual(int luong) {
		List<NhanVien> dsNhanVien = nhanVienRepository.findAllNhanVienByLuongLessThanEqual(luong);
		return dsNhanVien;
	}

}
