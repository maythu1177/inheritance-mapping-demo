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
@DiscriminatorValue("ex_house")
public class ExHouseVet extends Vet {

	

	private String country;

	private double visitingFees;

	public ExHouseVet(String name, String qualification, String country, double visitingFees) {
		super(name, qualification);
		this.country = country;
		this.visitingFees = visitingFees;
	}
}
