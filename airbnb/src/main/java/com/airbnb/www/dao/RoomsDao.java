package com.airbnb.www.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.airbnb.www.vo.Rooms;

@Repository
public class RoomsDao {
	@Autowired
	SqlSessionTemplate tpl;
	public int create() {
		return tpl.insert("roomsMapper.create", null);
	}
	
	public String read() {
		return tpl.selectOne("roomsMapper.read");
	}
	
	public int update() {
		return tpl.update("roomsMapper.update",null);
	}
	
	public int delete() {
		return tpl.delete("roomsMapper.delete",null);
	}
}
