package vn.edu.iuh.fit.se.chueynbayapis.service;

import java.util.List;

import org.springframework.stereotype.Service;

import vn.edu.iuh.fit.se.chueynbayapis.entity.NhanVien;

@Service
public interface INhanVienService {
	List<NhanVien> findAllNhanVienByLuongLessThanEqual(int luong);
}
