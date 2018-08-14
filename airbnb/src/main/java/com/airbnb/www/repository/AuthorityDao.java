package com.airbnb.www.repository;

import java.util.*;

import org.mybatis.spring.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import com.airbnb.www.entity.*;

@Repository
public class AuthorityDao {
	@Autowired
	private SqlSessionTemplate sql;
	
	public int insertAuthority(Authorities authority) {
		return sql.insert("authorityMapper.insertAuthority", authority);
	}
	
	public int deleteAuthority(Authorities authority) {
		return sql.delete("authorityMapper.deleteAuthority", authority);
	}
	
	public List selectAuthority(String email) {
		return sql.selectList("authorityMapper.selectAuthority", email);
	}
}