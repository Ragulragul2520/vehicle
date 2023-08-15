package com.myapp.vehicle.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myapp.vehicle.entity.Bike;
import com.myapp.vehicle.repository.BikeRepository;

@Repository
public class BikeDao {
	@Autowired
	BikeRepository bikeRepo;
	public String addvalues(List<Bike>bike) {
		bikeRepo.saveAll(bike);
		return "Added Successfully";
	}
	public String deletevalues() {
		bikeRepo.deleteAll();
		return "Deleted Successfully";
	}
	public List<Bike> getListByPrice(int price) {
		return bikeRepo.getListByPrice(price);
	}
	public List<Bike> getBrandList(String brand) {
		return bikeRepo.getBrandList(brand);
	}
	public Long getMax() {
	return bikeRepo.getMax();
	}
	public List<Bike> getByBike() {
		return bikeRepo.findAll();
	}
}
