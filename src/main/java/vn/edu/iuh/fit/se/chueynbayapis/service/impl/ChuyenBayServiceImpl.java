package vn.edu.iuh.fit.se.chueynbayapis.service.impl;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.edu.iuh.fit.se.chueynbayapis.entity.ChuyenBay;
import vn.edu.iuh.fit.se.chueynbayapis.repository.ChuyenBayRepository;
import vn.edu.iuh.fit.se.chueynbayapis.service.IChuyenBayService;

@Service
public class ChuyenBayServiceImpl implements IChuyenBayService{
	
	
	@Autowired
	private ChuyenBayRepository chuyenBayRepository;

	@Override
	public ChuyenBay getChuyenBayByID(String maCB) {
		ChuyenBay chuyenBay = chuyenBayRepository.findById(maCB).orElse(null);
		if (Objects.isNull(chuyenBay)) {
            return null;
        }
		return chuyenBay;
	}

}
