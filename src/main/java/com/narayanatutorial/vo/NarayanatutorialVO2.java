package com.narayanatutorial.vo;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.google.gson.annotations.SerializedName;

public class NarayanatutorialVO2 {
	private String name;
	private int age;
	private String[] position;

	@JacksonXmlProperty
	private List<String> skills;
	
	@JacksonXmlProperty
	private Map<String, Long> salary;
	
	
	//@JacksonXmlElementWrapper(localName = "getProfileHirarchy",useWrapping = true)
	@JacksonXmlElementWrapper(localName = "getProfileHirarchy")
	@JacksonXmlProperty(localName = "PId")
	private List<String> abcd;
	
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
	
	
	public List<String> getAbcd() {
		return abcd;
	}
	public void setAbcd(List<String> abcd) {
		this.abcd = abcd;
	}
	
	
//	public List<String> getEmp() {
//		return emp;
//	}
//	public void setEmp(List<String> emp) {
//		this.emp = emp;
//	}
	
	
	
//	public List<String> getAbcd() {
//		return abcd;
//	}
//	public void setAbcd(List<String> abcd) {
//		this.abcd = abcd;
//	}

	
	
	
}
