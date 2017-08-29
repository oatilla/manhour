package com.gama.manhour.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MD_Company {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long companyId;
	private String company;
	
	public MD_Company() {
	}	
	
	
	public MD_Company(long companyId, String company) {
		super();
		this.companyId = companyId;
		this.company = company;
	}
	
	public long getCompanyId() {
		return companyId;
	}
	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}

	
	

	
}
