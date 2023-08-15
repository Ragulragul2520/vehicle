package com.myapp.vehicle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.vehicle.entity.Bike;
import com.myapp.vehicle.service.BikeService;

@RestController
@RequestMapping(value="/bike")
public class BikeController {
	@Autowired
	BikeService bikeser;
	
	@PostMapping(value="/addvalues")
	public String addvalues(@RequestBody List<Bike> bike) {
		return bikeser.addvalues(bike);
	}
	@DeleteMapping(value="/deletevalue")
	public String deletevalues() {
		return bikeser.deletevalues();
	}
	@GetMapping(value="/getListByPrice/{price}")
	public List<Bike> getListByPrice(@PathVariable int price) {
		return bikeser.getListByPrice(price);
	}
	@GetMapping(value="/getBrandList/{brand}")
	public List<Bike> getBrandList(@PathVariable String brand) {
		return bikeser.getBrandList(brand);
	}
	@GetMapping(value="/getmax")
	public Long getMax() {
		return bikeser.getMax();
	}
	/*@GetMapping(value="/getreduceprice/{price}")
	public List<Bike>  reduceprice(@PathVariable int price){
		return bikeser.reduceprice(price);
	}*/
	@GetMapping(value="/enginecc/{cc}")
	public List<Integer> getengineecc(@PathVariable int cc) {
		return bikeser.getengineecc(cc);
	}
}
