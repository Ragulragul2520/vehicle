package com.myapp.vehicle.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myapp.vehicle.dao.BikeDao;
import com.myapp.vehicle.entity.Bike;

@Service
public class BikeService {
	@Autowired
	BikeDao bikeDao;
	public String addvalues(List<Bike>bike) {
		return bikeDao.addvalues(bike);
	}
	public String deletevalues() {
		return bikeDao.deletevalues();
	}
	public List<Bike> getListByPrice(int price) {
		return bikeDao.getListByPrice(price);
	}
	public List<Bike> getBrandList(String brand) {
		return bikeDao.getBrandList(brand);
	}
	public Long getMax() {
	return bikeDao.getMax();
	}
	/*public List<Bike> reduceprice(int price) {
		List<Bike> byprice=bikeDao.getByBike();
		return byprice.stream().filter(x->x.getPrice()<=price).map(y->y.setPrice(getPrice()+getPrice()*5/100)).collect(Collectors.toList());
	}*/
	public List<Integer> getengineecc(int cc){
		List<Bike> bycc=bikeDao.getByBike();
		return bycc.stream().filter(x->x.getEnginecc()>=cc).map(y->y.getEnginecc()).collect(Collectors.toList());
	}
}
