package com.cg.schedulemanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.schedulemanagementsystem.dto.Client;
import com.cg.schedulemanagementsystem.service.ITrainingService;

@Controller
public class TrainingController {
	
	@Autowired
	ITrainingService trainingservice;
	
	@RequestMapping(value="schedule",method=RequestMethod.GET)
	public ModelAndView getAllDetail() {
		List<Client> clientData=trainingservice.getAllDetails();
		return new ModelAndView("ScheduledSessions", "data", clientData);
	}
	@RequestMapping(value="Enroll Me",method=RequestMethod.GET)
	public ModelAndView dataDisplay(@RequestParam("name") String cname) {
		
		return new ModelAndView("Success", "ename", cname);
	}
	

}
