package vn.edu.iuh.fit.se.chueynbayapis.service;

import org.springframework.stereotype.Service;

import vn.edu.iuh.fit.se.chueynbayapis.entity.ChuyenBay;

@Service
public interface IChuyenBayService {
	ChuyenBay getChuyenBayByID(String maCB);
}
