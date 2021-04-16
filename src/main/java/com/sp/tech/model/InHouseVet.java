package com.sp.tech.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@DiscriminatorValue("in_house")
public class InHouseVet extends Vet {

	
	private double salary;

	public InHouseVet(String name, String qualification, double salary) {
		super(name, qualification);
		this.salary = salary;
	}

}
