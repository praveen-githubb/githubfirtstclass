package org.allvehicle;

import org.fourwheeler.FourWheeler;
import org.threewheeler.ThreeWheeler;
import org.twowheeler.TwoWheeler;

public class Vehicle {
	private void vehicleNecessery() {
		System.out.println("vehicle is necessery for travel from one place to another");	
	}
	public static void main(String[] args) {
		Vehicle a=new Vehicle();
		a.vehicleNecessery();
		
		TwoWheeler b=new TwoWheeler();
		b.bike();
		b.Cycle();
		
		ThreeWheeler c=new ThreeWheeler();
		c.auto();
		
		
		FourWheeler d=new FourWheeler();
		d.car();
		d.bus();
		d.lorry();
	
	}

}
