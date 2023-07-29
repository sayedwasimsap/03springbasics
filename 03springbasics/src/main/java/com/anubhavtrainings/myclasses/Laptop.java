package com.anubhavtrainings.myclasses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
	private int length;
	private int width;
	private int heght;
	private String brandName;
	
	@Autowired
	private IHardDisk hdd;

	/*
	 * public Laptop(int length, int width, int heght, String brandName) { super();
	 * this.length = length; this.width = width; this.heght = heght; this.brandName
	 * = brandName; }
	 */
	@Override
	public String toString() {
		hdd.PowerOn();
		hdd.PowerOff();
		hdd.ReadData();
		return "Laptop [length=" + length + ", brandName=" + brandName + "]";
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeght() {
		return heght;
	}
	public void setHeght(int heght) {
		this.heght = heght;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
}
