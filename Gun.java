package com.mycompany.gun;



public abstract class Gun {
	String description = "Unknown Gun";
  
	public String getDescription() {
		return description;
	}
 
	public abstract double weight();
}
