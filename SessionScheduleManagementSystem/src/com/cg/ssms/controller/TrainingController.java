package com.cg.ssms.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.cg.ssms.dto.Client;
import com.cg.ssms.service.ITrainingService;

@Controller
public class TrainingController {
	
	@Autowired
	ITrainingService service;
	
	//------------------------ 1. Session Schedule Management System --------------------------
	/*******************************************************************************************************
	 - Function Name	:	getAllDetail()
	 - Input Parameters	:	null
	 - Return Type		:	ModelAndView
	 - Author			:	CAPGEMINI
	 - Creation Date	:	11/01/2018
	 - Description		:	Passes the retrieved list to the ScheduledSessions.jsp page
	 ********************************************************************************************************/
	
	@RequestMapping(value="/show", method=RequestMethod.GET)
	public ModelAndView getAllDetail(){
		List<Client> clientData= service.getAllDetail();
		return new ModelAndView("ScheduledSessions", "data", clientData);
	}
	
	//------------------------ 1. Session Schedule Management System --------------------------
	/*******************************************************************************************************
	 - Function Name	:	getAllDetail(String name)
	 - Input Parameters	:	String
	 - Return Type		:	ModelAndView
	 - Author			:	CAPGEMINI
	 - Creation Date	:	11/01/2018
	 - Description		:	Passes the parameter name to Success.jsp page
	 ********************************************************************************************************/
	
	@RequestMapping(value="/success", method=RequestMethod.GET)
	public ModelAndView dataDisplay(@RequestParam("name") String name){
		return new ModelAndView("Success","cname", name);
	}

}
