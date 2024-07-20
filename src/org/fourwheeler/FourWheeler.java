package org.fourwheeler;

public class FourWheeler {
	public void car() {
		System.out.println("car is a four wheeler");
	}
	public void bus() {
		System.out.println("bus as more than 4 wheels");

	}
	public void lorry() {
		System.out.println("lorry as morwe than 6 wheels");
	}
	public static void main(String[] args) {
		FourWheeler d=new FourWheeler();
		d.car();
		d.bus();
		d.lorry();
	}

}
