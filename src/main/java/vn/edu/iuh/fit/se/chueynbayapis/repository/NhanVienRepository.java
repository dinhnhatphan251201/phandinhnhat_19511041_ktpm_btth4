package vn.edu.iuh.fit.se.chueynbayapis.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.edu.iuh.fit.se.chueynbayapis.entity.NhanVien;

@Repository
public interface NhanVienRepository extends JpaRepository<NhanVien, String>{
	List<NhanVien> findAllNhanVienByLuongLessThanEqual(int luong );
}
