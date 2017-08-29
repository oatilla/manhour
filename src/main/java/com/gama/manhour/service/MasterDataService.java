package com.gama.manhour.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gama.manhour.model.MD_Company;

@Service
public class MasterDataService {
	@Autowired
	private DataRepository dataRepository;
	
	public void addCompany(MD_Company company) {
		dataRepository.save(company);
	}
	
	public List<MD_Company> getAllCompanies() {
		
		List<MD_Company> companies = new ArrayList<>();
		dataRepository.findAll()
		.forEach(companies::add);
		return companies;
		
		// TODO Auto-generated method stub

	}
	
	
	
}
