package com.ascuntar.sigpro.dao.impl;

import javax.ejb.Stateless;
import javax.inject.Named;

import com.ascuntar.sigpro.dao.TestDAO;

@Named
@Stateless
public class TestDAOImpl implements TestDAO {

	@Override
	public void testFunctionDAO() {
		System.out.println("En TestDAOImpl");
	}
	
   
}
