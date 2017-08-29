package com.gama.manhour.service;

import org.springframework.data.repository.CrudRepository;

import com.gama.manhour.model.MD_Company;

public interface DataRepository extends CrudRepository<MD_Company, String> {

}
