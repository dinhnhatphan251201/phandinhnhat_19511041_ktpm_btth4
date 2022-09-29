package vn.edu.iuh.fit.se.chueynbayapis.service;

import java.util.List;

import org.springframework.stereotype.Service;

import vn.edu.iuh.fit.se.chueynbayapis.entity.ChuyenBay;

@Service
public interface IChuyenBayService {
	ChuyenBay getChuyenBayByID(String maCB);
	List<ChuyenBay> getListChuyenBayByGaDen(String gaDen);
	List<ChuyenBay> findAllChuyenBayByGaDiAndGaDen(String gaDi,String gaDen);
}
