package com.main.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class SeasonFinderServiceManagementImp implements ISeasonFinderServiceManagement {

	@Override
	public String findSeason() {
		 
		    	LocalDateTime ldt = LocalDateTime.now();
		    	 int month = ldt.getMonthValue();
		    	 String season = null;
		    	 if(month==12 ||month==1 || month==2)
		    	 {
		    		 season = "Winter Season";
		    	 }
		    	 else if(month==3 || month==4 || month==5)
		    	 {
		    		 season = "Spring Season";
		    	 }
		    	 else if(month==6 || month==7 || month==8)
		    	 {
		    		 season = "Summer Season";
		    	 }
		    	 else
		    		 season = "Autumn Season";
		    	 
		    	 return season;
		 
	}

}
