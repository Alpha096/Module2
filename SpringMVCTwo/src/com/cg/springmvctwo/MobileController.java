package com.cg.springmvctwo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.enterprise.inject.Model;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
	public String addMobileData(@Valid@ModelAttribute("my") Mobile mobile, BindingResult result, Map<String, Object> model){
		if(result.hasErrors()){
			List<String> mylist=new ArrayList<>();
			mylist.add("Android");
			mylist.add("iOS");
			mylist.add("Windows");
			model.put("cato", mylist);
			return "AddMobile";
		}else{
			mobileservice.addMobile(mobile);
			return "success";
		}
	}
	
	@RequestMapping(value="showall", method=RequestMethod.GET)
	public ModelAndView showAllMobileData(){
		List<Mobile> allMobile=mobileservice.showAllMobile();
		return new ModelAndView("mobileshow", "data", allMobile);
	}
	
	@RequestMapping(value="search", method=RequestMethod.GET)
	public String searchData(@ModelAttribute("yy") Mobile mob){
		return "searchMobile";
	}
	
	@RequestMapping(value="mobilesearch", method=RequestMethod.POST)
	public ModelAndView dataSearch(@ModelAttribute("yy") Mobile mob){
		Mobile mobSearch=mobileservice.searchMobile(mob.getMobId());
		return new ModelAndView("showsearch","temp",mobSearch);
	}
	
	@RequestMapping(value="delete", method=RequestMethod.GET)
	public String deletedata(@ModelAttribute("id") Mobile mob){
		return "deletedata";
	}
	@RequestMapping(value="delete1", method=RequestMethod.POST)
	public String deleteMobileData(@ModelAttribute("id") Mobile mob){
		mobileservice.deleteMobile(mob.getMobId());
		return "success";
	}
	@RequestMapping(value="update", method=RequestMethod.GET)
	public String updatedata(@ModelAttribute("idd") Mobile mob){
		return "updatedata";
	}
	@RequestMapping(value="update1", method=RequestMethod.POST)
	public String update1(@ModelAttribute("idd") Mobile mob){
		mobileservice.updateMobile(mob.getMobId(), mob.getPrice());
		return "success";
	}
	
}
