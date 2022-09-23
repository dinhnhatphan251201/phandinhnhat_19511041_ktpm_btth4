package vn.edu.iuh.fit.se.chueynbayapis.repository;

import org.springframework.stereotype.Repository;

import vn.edu.iuh.fit.se.chueynbayapis.entity.ChuyenBay;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ChuyenBayRepository extends JpaRepository<ChuyenBay, String>{
	
}
