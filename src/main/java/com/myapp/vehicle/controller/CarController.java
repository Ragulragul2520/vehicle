package com.myapp.vehicle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.vehicle.entity.Car;
import com.myapp.vehicle.service.CarService;

@RestController
@RequestMapping(value = "/car")
public class CarController {
	@Autowired
	CarService carser;

	@PostMapping(value = "/addlist")
	public String addlist(@RequestBody List<Car> car) {
		return carser.addlist(car);
	}

	@GetMapping(value = "/getvalues")
	public List<Car> getvalues() {
		return carser.getvalues();
	}

	@PutMapping(value = "/update")
	public String updatevalues(@RequestBody Car car) {
		return carser.updatevalues(car);
	}

	@DeleteMapping(value = "/delete")
	public String deletelist() {
		return carser.deletelist();
	}

	@GetMapping(value = "/getBrands")
	public List<String> getBrands() {
		return carser.getBrands();
	}

	@GetMapping(value = "/getByBrand/{brand}")
	public List<Car> getByBrand(@PathVariable String brand) {
		return carser.getByBrand(brand);
	}

}
