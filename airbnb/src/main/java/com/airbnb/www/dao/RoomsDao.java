package com.airbnb.www.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RoomsDao {
	@Autowired
	SqlSessionTemplate tpl;
	public String read() {
		return tpl.selectOne("roomsMapper.read");
	}
}
