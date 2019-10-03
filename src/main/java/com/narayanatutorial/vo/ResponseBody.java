package com.narayanatutorial.vo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseBody {

	@JsonProperty("employee")
	private List<EmployeeVO> employee;

	public List<EmployeeVO> getEmployee() {
		return employee;
	}

	public void setEmployee(List<EmployeeVO> employee) {
		this.employee = employee;
	}
	
}
