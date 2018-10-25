package com.cg.springmvctwo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.enterprise.inject.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cg.springmvctwo.dto.Mobile;
import com.cg.springmvctwo.service.IMobileService;

@Controller
public class MobileController {
	@Autowired
	IMobileService mobileservice;
	
	@RequestMapping(value="/home")
	public String getAllMobile(@ModelAttribute("my") Mobile mob, Map<String, Object> model){
		
		List<String> mylist=new ArrayList<>();
		mylist.add("Android");
		mylist.add("iOS");
		mylist.add("Windows");
		model.put("cato", mylist);
		return "AddMobile";
	}
	
	@RequestMapping(value="adddata", method=RequestMethod.POST)
	public String addMobileData(@ModelAttribute("my") Mobile mobile){
		mobileservice.addMobile(mobile);
		//System.out.println("Mobile ID: "+mobile.getMobId()+" Mobile Name: "+mobile.getMobName()+" Mobile Price: "+mobile.getPrice() + " Category: "+mobile.getMobCategory()+" Online Availabilty: "+mobile.getOnline());
		
		return "success";
	}
}
