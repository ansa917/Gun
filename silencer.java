package com.mycompany.gun;
/// updated class from beverage to silences

public class silencer extends GunDecorator {
	Gun weaponary;

	public silencer(Gun weaponary) {
		this.weaponary = weaponary;
	}

	public String getDescription() {
		return weaponary.getDescription() + ", Silencer";
	}

	public double weight() {
		return 0.1 + weaponary.weight();
	}
}
