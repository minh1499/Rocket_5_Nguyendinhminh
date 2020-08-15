package com.vti.lesson11.backend.datalayer;

import com.vti.lesson11.utils.JDBCutil;

public class GroupRepository {
	private JDBCutil jdbcutils;
	
	public GroupRepository(){
		jdbcutils=new JDBCutil();
	}
	
}
