package org.twowheeler;


public class TwoWheeler {
	public void bike() {
		System.out.println("bike need fuel to run");
	}
		public void Cycle() {
			System.out.println("no need of fuel in cycle");
		}
	
	public static void main(String[] args) {
		TwoWheeler b=new TwoWheeler();
		b.bike();
		b.Cycle();
	}
	
}
