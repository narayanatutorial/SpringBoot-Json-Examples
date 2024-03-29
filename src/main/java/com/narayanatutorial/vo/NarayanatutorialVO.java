package com.narayanatutorial.vo;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class NarayanatutorialVO {
	private String name;
	private int age;
	private String[] position;

	@SerializedName("skill")
	private List<String> skills;
	
	private Map<String, Long> salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String[] getPosition() {
		return position;
	}
	public void setPosition(String[] position) {
		this.position = position;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public Map<String, Long> getSalary() {
		return salary;
	}
	public void setSalary(Map<String, Long> salary) {
		this.salary = salary;
	}
	
}
