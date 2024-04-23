package com.main.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.main.service.ISeasonFinderServiceManagement;

@Controller
public class SeasonFinderController 
{
	  @Autowired
	  private ISeasonFinderServiceManagement service;
	  
	  @RequestMapping("/home")
	  public String displayHome()
	  {
		  return "home";
	  }
     @RequestMapping("/season_finder")
	 public String findSeason(Map<String, Object> map)
	 {
		   String season = service.findSeason();
		   map.put("season_result", season);
		   
		 return "season_page";
	 }
}
