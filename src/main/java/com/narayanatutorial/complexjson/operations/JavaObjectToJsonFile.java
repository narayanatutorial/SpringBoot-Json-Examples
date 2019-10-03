package com.narayanatutorial.complexjson.operations;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.narayanatutorial.vo.EmployeeVO;
import com.narayanatutorial.vo.NarayanatutorialVO;
import com.narayanatutorial.vo.ResponseBody;
import com.narayanatutorial.vo.ResponseResults;

public class JavaObjectToJsonFile {
	public static void main(String[] args) throws Exception {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		NarayanatutorialVO vo = new NarayanatutorialVO();
		vo.setAge(35);
		vo.setName("Narayanaswamy");
		String[] position = new String[] { "Founder", "CTO,", "Subscriber", "Author" };
		vo.setPosition(position);
		Map<String, Long> salary = new HashMap<>();
		salary.put("2014", new Long(12000));
		salary.put("2015", new Long(13000));
		salary.put("2016", new Long(14000));
		salary.put("2017", new Long(15000));
		salary.put("2018", new Long(16000));
		salary.put("2019", new Long(17000));
		vo.setSalary(salary);
		List<String> skills = new ArrayList<>();
		skills.add("Java");
		skills.add("Spring");
		skills.add("Hibernate");
		skills.add("Forgerock");
		skills.add("Webhosting");
		skills.add("Oracle");
		skills.add("Trainer");
		skills.add("SpringBoot");
		skills.add("SpringBatch");
		vo.setSkills(skills);
		String jsonStr = gson.toJson(vo);
		System.out.println("jsonStr:" +jsonStr);
		
		FileWriter fout=new FileWriter("complexjsonfile.json");
		gson.toJson(vo, fout);
		fout.close();
	}
}
