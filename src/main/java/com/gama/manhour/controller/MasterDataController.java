package com.gama.manhour.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.gama.manhour.model.MD_Company;
import com.gama.manhour.service.MasterDataService;


@RestController
public class MasterDataController {


	@Autowired
	private MasterDataService masterData;
	
	@RequestMapping("/masterdata")	
	public ModelAndView getCompany() {
		ModelAndView model = new ModelAndView("masterdata");
		return model;
}
	@RequestMapping(method=RequestMethod.POST, value="/addCompany")
	public ModelAndView addCompany(@ModelAttribute("companyIns") MD_Company companyIns) {
			
//		long cid = company.getCompanyId();
		masterData.addCompany(companyIns);
		List<MD_Company> companies = masterData.getAllCompanies();
		
		
		ModelAndView model = new ModelAndView("ShowCompany");
		
    	model.addObject("companies",companies);
	
		
			return model;
		}
	
	

		

}
