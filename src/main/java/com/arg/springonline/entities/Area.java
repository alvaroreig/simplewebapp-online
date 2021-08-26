package com.arg.springonline.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Area {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String name;

	private String responsibleName;

	public Area() {}
	
	public Area(Integer id, String name, String responsibleName) {
		this.id = id;
		this.name = name;
		this.responsibleName = responsibleName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getResponsibleName() {
		return responsibleName;
	}

	public void setResponsibleName(String responsibleName) {
		this.responsibleName = responsibleName;
	}
	
	@Override
	public String toString() {
		return id.toString() + ":" + name + ":" + responsibleName;
	}

}
