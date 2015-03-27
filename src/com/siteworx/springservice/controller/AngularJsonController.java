package com.siteworx.springservice.controller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/angularJson")
public class AngularJsonController 
{
	@RequestMapping(value="/allAccounts", method=RequestMethod.GET, headers="Accept=application/json")
	public String getAllAccounts()
	{
		FileReader fr = null;
		String jsonFile = null;
		try {
			fr = new FileReader("C:/Users/wshelton/Documents/GitHub/all accounts widget 2/all accounts widget/app/services/AllAccounts.json");
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObject = (JSONObject) jsonParser.parse(fr);
			jsonFile = jsonObject.toJSONString();
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jsonFile;
	}
}