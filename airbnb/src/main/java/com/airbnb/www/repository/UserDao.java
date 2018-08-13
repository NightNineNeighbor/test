package com.airbnb.www.repository;

import java.util.*;

import org.mybatis.spring.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import com.airbnb.www.dto.*;

@Repository
public class UserDao {
	@Autowired
	SqlSessionTemplate tpl;
	
	public String emailCheck(String email) {
		return tpl.selectOne("userMapper.emailCheck", email);
	}
	
	public int insertUser(UserDto.InsertUser user) {
		return tpl.insert("userMapper.insertUser", user);
	}
	
	public int insertAuthority(UserDto.InsertAuthority user) {
		return tpl.insert("userMapper.insertAuthority", user);
	}
	
	public int insertTel(UserDto.InsertTel user) {
		return tpl.update("userMapper.insertTel", user);
	}
	
	public UserDto.Photo selectPhoto(String email) {
		return tpl.selectOne("userMapper.selectPhoto", email);
	}
	
	public int updatePhoto(UserDto.UpdatePhoto user) {
		return tpl.update("userMapper.updatePhoto", user);
	}
	
	public String passwordCheck(String email) {
		return tpl.selectOne("userMapper.passwordCheck", email);
	}
	
	public UserDto.Read readUser(String email) {
		return tpl.selectOne("userMapper.readUser", email);
	}
	
	public int update(UserDto.Update user) {
		return tpl.update("userMapper.update", user);
	}
	
	public int deleteUser(String email) {
		return tpl.delete("userMapper.deleteUser", email);
	}
	
	public int deleteAuthority(String email) {
		return tpl.delete("userMapper.deleteAuthority", email);
	}
	
	public int missmatch(String email) {
		return tpl.update("userMapper.missmatch", email);
	}
	
	public int resetMissMatch(String email) {
		return tpl.update("userMapper.resetMissMatch", email);
	}
	
	public int selectMissmatchCnt(String email) {
		return tpl.selectOne("userMapper.selectMissmatchCnt", email);
	}
	
	public int report(String email) {
		return tpl.update("userMapper.report", email);
	}
	
	public List<UserDto.findByReportCnt> findByReportCnt(Map<String, Object> map) {
		return tpl.selectList("userMapper.findByReportCnt", map);
	}
	
	public int changeEnabled(UserDto.changeEnabled user) {
		return tpl.update("userMapper.changeEnabled", user);
	}
}