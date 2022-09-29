package vn.edu.iuh.fit.se.chueynbayapis.service;

import java.util.List;

import org.springframework.stereotype.Service;

import vn.edu.iuh.fit.se.chueynbayapis.entity.ChuyenBay;
import vn.edu.iuh.fit.se.chueynbayapis.entity.MayBay;

@Service
public interface IMayBayService {
	List<MayBay> findAllMayBayByTamBayGreaterThanEqual(int TamBay);
}
