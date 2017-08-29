package com.gama.manhour.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



@Entity
public class MD_Organization {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long organizationId;
	private String organizationName;
	@ManyToOne
	private MD_Company company;
    @ManyToOne
	private MD_Location location;
	
	
	public MD_Organization() {

	}
	
	public MD_Organization(long organizationId, String organizationName, MD_Company company, MD_Location location) {
		super();
		this.organizationId = organizationId;
		this.organizationName = organizationName;
		this.company = company;
		this.location = location;
	}
	public long getOrganizationId() {
		return organizationId;
	}
	public void setOrganizationId(long organizationId) {
		this.organizationId = organizationId;
	}
	public String getOrganizationName() {
		return organizationName;
	}
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}
	public MD_Company getCompany() {
		return company;
	}
	public void setCompany(MD_Company company) {
		this.company = company;
	}
	public MD_Location getLocation() {
		return location;
	}
	public void setLocation(MD_Location location) {
		this.location = location;
	}
	
	
}
