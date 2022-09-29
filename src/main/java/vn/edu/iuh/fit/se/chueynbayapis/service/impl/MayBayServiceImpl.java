package vn.edu.iuh.fit.se.chueynbayapis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.edu.iuh.fit.se.chueynbayapis.entity.MayBay;
import vn.edu.iuh.fit.se.chueynbayapis.repository.MayBayRepository;
import vn.edu.iuh.fit.se.chueynbayapis.service.IMayBayService;

@Service
public class MayBayServiceImpl implements IMayBayService{
	
	@Autowired
	private MayBayRepository mayBayRepository;

	@Override
	public List<MayBay> findAllMayBayByTamBayGreaterThanEqual(int TamBay) {
		// TODO Auto-generated method stub
		List<MayBay> dsMayBay = mayBayRepository.findAllMayBayByTamBayGreaterThanEqual(TamBay);
		return dsMayBay;
	}

}
