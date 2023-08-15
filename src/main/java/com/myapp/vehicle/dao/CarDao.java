package com.myapp.vehicle.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myapp.vehicle.entity.Car;
import com.myapp.vehicle.repository.CarRepository;

@Repository
public class CarDao {
	@Autowired
	CarRepository carRepo;

	public String addlist(List<Car> car) {
		carRepo.saveAll(car);
		return "Added Successfully";
	}

	public List<Car> getvalues() {
		return carRepo.findAll();
	}

	public String updatevalues(Car car) {
		carRepo.save(car);
		return "Updated Successfully";
	}

	public String deletelist() {
		carRepo.deleteAll();
		return "Deleted Successfully";
	}

	public List<Car> getBrands() {
		return carRepo.findAll();
	}

}
