package vn.edu.iuh.fit.se.chueynbayapis.repository;

import org.springframework.stereotype.Repository;

import vn.edu.iuh.fit.se.chueynbayapis.entity.ChuyenBay;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface ChuyenBayRepository extends JpaRepository<ChuyenBay, String>{
	@Query(value = "select * from chuyenbay where GaDen=?1", nativeQuery = true)
	List<ChuyenBay> findAllChuyenBayByGaDen(String gaDen);
	
	@Query(value = "select * from chuyenbay where GaDi=?1 and Gaden=?2", nativeQuery = true)
	List<ChuyenBay> findAllChuyenBayByGaDiAndGaDen(String gaDi,String gaDen);
}
