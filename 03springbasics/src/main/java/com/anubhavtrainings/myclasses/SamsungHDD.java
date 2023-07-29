package com.anubhavtrainings.myclasses;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SamsungHDD implements IHardDisk {

	@Override
	public void PowerOn() {
		// TODO Auto-generated method stub
		System.out.println("Samsung HDD is powered on");
	}

	@Override
	public void PowerOff() {
		// TODO Auto-generated method stub
		System.out.println("Samsung HDD is powered off");
	}

	@Override
	public void ReadData() {
		// TODO Auto-generated method stub
		System.out.println("Reading from Samsung HDD");
	}

}
