package com.myapp.vehicle.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myapp.vehicle.dao.CarDao;
import com.myapp.vehicle.entity.Car;

@Service
public class CarService {
	@Autowired
	CarDao carDao;

	public String addlist(List<Car> car) {
		return carDao.addlist(car);
	}

	public List<Car> getvalues() {
		return carDao.getvalues();
	}

	public String updatevalues(Car car) {
		return carDao.updatevalues(car);
	}

	public String deletelist() {
		return carDao.deletelist();
	}

	public List<String> getBrands() {
		List<Car> allBrands = carDao.getBrands();
		return allBrands.stream().map(x -> x.getBrand()).collect(Collectors.toList());
	}

	public List<Car> getByBrand(String brand) {
		List<Car> allCars = carDao.getBrands();
		return allCars.stream().filter(x -> x.getBrand().equalsIgnoreCase(brand)).collect(Collectors.toList());
	}
}
