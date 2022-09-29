package vn.edu.iuh.fit.se.chueynbayapis.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.edu.iuh.fit.se.chueynbayapis.entity.MayBay;

@Repository
public interface MayBayRepository extends JpaRepository<MayBay, Integer>{
	List<MayBay> findAllMayBayByTamBayGreaterThanEqual(int TamBay);
}
