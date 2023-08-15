package com.myapp.vehicle.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.myapp.vehicle.entity.Bike;

public interface BikeRepository extends JpaRepository<Bike,Integer>{
	@Query(value="SELECT * from bike_details where price>=?",nativeQuery=true)
	public List<Bike> getListByPrice(int price);
	
	@Query(value="SELECT * from bike_details where brand like ?",nativeQuery=true)
	public List<Bike> getBrandList(String brand);
	
	@Query(value="select max(price) from bike_details",nativeQuery=true)
	public Long getMax();
	
}
