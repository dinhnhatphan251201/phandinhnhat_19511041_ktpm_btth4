package vn.edu.iuh.fit.se.chueynbayapis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import vn.edu.iuh.fit.se.chueynbayapis.entity.ChuyenBay;
import vn.edu.iuh.fit.se.chueynbayapis.service.IChuyenBayService;

@RestController
@RequestMapping("/chuyenbay")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ChuyenBayController {
	@Autowired
	private IChuyenBayService chuyenBayService;
	
	@GetMapping(value = "/{maCB}")
	public ChuyenBay getChuyenBayById(@PathVariable String maCB) {
		return chuyenBayService.getChuyenBayByID(maCB);
	}
	
	@GetMapping(value = {
            "", "/"
    })
	public List<ChuyenBay> getListChuyenBayByGaDen(@RequestParam(name = "gaDen", required = false) String gaDen) {
		List<ChuyenBay> listChuyenBay = chuyenBayService.getListChuyenBayByGaDen(gaDen);
		return listChuyenBay;
	}
}
