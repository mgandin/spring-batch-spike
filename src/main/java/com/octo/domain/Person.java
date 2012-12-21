package com.octo.domain;

public class Person {

	private Integer id;
	private String name;
	
	public Person(int id, String name) {
		this.setId(id);
		this.setName(name);
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

	@Override
	public String toString() {
		return "Person:id=" + this.getId() + ",name=" + this.getName();
	}

	
}
