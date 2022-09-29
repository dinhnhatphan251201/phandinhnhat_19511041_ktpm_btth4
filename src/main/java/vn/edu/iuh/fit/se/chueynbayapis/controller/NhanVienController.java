package vn.edu.iuh.fit.se.chueynbayapis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import vn.edu.iuh.fit.se.chueynbayapis.entity.NhanVien;
import vn.edu.iuh.fit.se.chueynbayapis.service.INhanVienService;

@RestController
@RequestMapping("/nhanvien")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class NhanVienController {
	
	@Autowired
	private INhanVienService nhanVienService;
	
	@GetMapping(value = {"/", ""})
	public List<NhanVien> findAllNhanVienByLuongLessThanEqual(@RequestParam(name = "luong", required = false) int luong) {
		List<NhanVien> dsNhanVien = nhanVienService.findAllNhanVienByLuongLessThanEqual(luong);
		return dsNhanVien;
	}

}
