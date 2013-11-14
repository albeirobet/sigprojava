package com.ascuntar.sigpro.bo.impl;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

import com.ascuntar.sigpro.bo.TestBO;
import com.ascuntar.sigpro.dao.TestDAO;


@Named
@Stateless
public class TestBOImpl implements TestBO{
	
	@Inject
	private TestDAO testDAO;

	public void testFunctionBO() {
		
		System.out.println("en testFunctionBO");
		testDAO.testFunctionDAO();
	}

}
