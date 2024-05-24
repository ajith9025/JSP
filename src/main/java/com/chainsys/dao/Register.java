package com.chainsys.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import com.chainsys.model.RegisterPojo;
public  interface Register {
	 public default  ArrayList<RegisterPojo> saveRegister(Register register) throws SQLException{
		return null ;
		
	  }

	
	
	
 }

  