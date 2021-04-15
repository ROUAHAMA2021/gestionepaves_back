package com.star.gestion_des_epaves.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository 
public class UserRepository {
	 @Autowired
	 JdbcTemplate jdbcTemplate;
	 
	
	public List<String> getAllUserNames() {
		List<String> userNameList = new ArrayList<>();
		 userNameList.addAll(jdbcTemplate.queryForList("select name from user;", String.class));
		  return userNameList;
	}

}
