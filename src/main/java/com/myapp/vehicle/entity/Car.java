package com.myapp.vehicle.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//import jakarta.persistence.sNO;
@Entity
@Table(name="car_details")
public class Car {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;
		private String brand;
		private int model;
		private int price;
		private String color;
		private int tax;
		public int getId() {
			return id;
		}
		public void setsNo(int sNo) {
			this.id = id;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public int getModel() {
			return model;
		}
		public void setModel(int model) {
			this.model = model;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public int getTax() {
			return tax;
		}
		public void setTax(int tax) {
			this.tax = tax;
		}
}
