package com.ascuntar.sigpro.controllers;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.ascuntar.sigpro.bo.TestBO;



@Named
@RequestScoped
public class BookController {
	
	private String name;
	
	@Inject
	private TestBO testBO;

	
	public BookController() {
		// TODO Auto-generated constructor stub
	}

	public BookController(String name) {
		this.name = name;
	}

	public String getName() {
        testBO.testFunctionBO();
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
