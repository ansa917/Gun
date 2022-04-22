package com.mycompany.gun;

public class CarrierCase extends GunDecorator {
	Gun weaponary;

	public CarrierCase(Gun weaponary) {
		this.weaponary = weaponary;
	}

	public String getDescription() {
		return weaponary.getDescription() + ", Carrier Case";
	}

	public double weight() {
		return .2 + weaponary.weight();
	}
}