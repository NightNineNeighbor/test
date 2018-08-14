package com.airbnb.www.repository;

import java.util.*;

import org.mybatis.spring.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import com.airbnb.www.dto.*;
import com.airbnb.www.entity.*;

@Repository
public class UserDao {
	@Autowired
	private SqlSessionTemplate sql;
	
	public String emailCheck(String email) {
		return sql.selectOne("userMapper.emailCheck", email);
	}
	
	public int insertUser(UserDto.InsertUser user) {
		return sql.insert("userMapper.insertUser", user);
	}
	
	public int insertTel(UserDto.InsertTel user) {
		return sql.update("userMapper.insertTel", user);
	}
	
	public UserDto.Photo selectPhoto(String email) {
		return sql.selectOne("userMapper.selectPhoto", email);
	}
	
	public int updatePhoto(UserDto.UpdatePhoto user) {
		return sql.update("userMapper.updatePhoto", user);
	}
	
	public String passwordCheck(String email) {
		return sql.selectOne("userMapper.passwordCheck", email);
	}
	
	public UserDto.Read readUser(String email) {
		return sql.selectOne("userMapper.readUser", email);
	}
	
	public int update(UserDto.Update user) {
		return sql.update("userMapper.update", user);
	}
	
	public int deleteUser(String email) {
		return sql.delete("userMapper.deleteUser", email);
	}
	
	public int deleteAuthority(String email) {
		return sql.delete("userMapper.deleteAuthority", email);
	}
	
	public int missmatch(String email) {
		return sql.update("userMapper.missmatch", email);
	}
	
	public int resetMissMatch(String email) {
		return sql.update("userMapper.resetMissMatch", email);
	}
	
	public int selectMissmatchCnt(String email) {
		return sql.selectOne("userMapper.selectMissmatchCnt", email);
	}
	
	public int report(String email) {
		return sql.update("userMapper.report", email);
	}
	
	public List<UserDto.findByReportCnt> findByReportCnt(Map<String, Object> map) {
		return sql.selectList("userMapper.findByReportCnt", map);
	}
	
	public int changeEnabled(UserDto.changeEnabled user) {
		return sql.update("userMapper.changeEnabled", user);
	}
}