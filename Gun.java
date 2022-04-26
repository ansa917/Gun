package com.mycompany.gun;

//updated class name 

public abstract class Gun {
	String description = "Unknown Gun";
  
	public String getDescription() {
		return description;
	}
 
	public abstract double weight();
}
