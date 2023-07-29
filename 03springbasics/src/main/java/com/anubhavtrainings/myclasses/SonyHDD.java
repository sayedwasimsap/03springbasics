package com.anubhavtrainings.myclasses;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class SonyHDD implements IHardDisk {

	@Override
	public void PowerOn() {
		// TODO Auto-generated method stub
		System.out.println("Sony HDD is powered on");
	}

	@Override
	public void PowerOff() {
		// TODO Auto-generated method stub
		System.out.println("Sony HDD is powered off");
	}

	@Override
	public void ReadData() {
		// TODO Auto-generated method stub
		System.out.println("Reading from Sony HDD");
	}

}
