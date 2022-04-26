package com.mycompany.gun;

// magzine class
public class Magzine extends GunDecorator {
	Gun weaponary;
 
	public Magzine(Gun weaponary) {
		this.weaponary = weaponary;
	}
 
	public String getDescription() {
		return weaponary.getDescription() + ", Magzine";
	}
 
	public double weight() {
		return .5 + weaponary.weight();
	}
}
