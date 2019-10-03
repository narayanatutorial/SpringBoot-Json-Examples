package com.narayanatutorial.simplejson.operations;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.narayanatutorial.vo.EmployeeVO;
import com.narayanatutorial.vo.ResponseBody;
import com.narayanatutorial.vo.ResponseResults;

public class JavaObjectToJsonObject {
	
	public static void main(String[] args) {
		Gson gson=new Gson();
		EmployeeVO employee = new EmployeeVO();
		employee.setAddress("Bangalore");
		employee.setName("narayanaswamy");
		List<EmployeeVO> list = new ArrayList<>();
		list.add(employee);

		ResponseBody resBody = new ResponseBody();
		resBody.setEmployee(list);

		ResponseResults resEx2 = new ResponseResults();
		resEx2.setResults(resBody);

		// Java object to Json Object
		Object object = gson.toJson(resEx2);
		System.out.println("jsonStr:" +object);
	}
}
