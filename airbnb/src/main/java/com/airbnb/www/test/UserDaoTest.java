package com.airbnb.www.test;

import java.util.*;

import org.junit.*;
import org.junit.runner.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.security.crypto.password.*;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.airbnb.www.dto.*;
import com.airbnb.www.entity.*;
import com.airbnb.www.repository.*;

import lombok.extern.slf4j.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Slf4j
public class UserDaoTest {
	@Autowired
	private UserDao dao;
	@Autowired
	private AuthorityDao autho;
	@Autowired
	private PasswordEncoder encoder;
	
	//@Test
	public void setupTest() {
		log.info("DAO : {} ", dao != null);
	}
	
	//@Test
	public void emailCheckTest() {
		log.info("emailCheck : {}", dao.emailCheck("summer1234@naver.com"));
	}
	
	//@Test
	public void joinTest() {
		UserDto.InsertUser user = new UserDto.InsertUser();
		
		user.setEmail("summer1234@naver.com");
		user.setBirthDate(new Date());
		user.setFirstName("Summer");
		user.setLastName("Kim");
		user.setPassword(encoder.encode("1234"));
		
		UserDto.InsertTel tel = new UserDto.InsertTel();
		tel.setEmail(user.getEmail());
		tel.setTel("010-1111-1111");
		
		log.info("insertUser : {}", dao.insertUser(user) != 0);
		log.info("inserTel : {} ", dao.insertTel(tel) != 0);
	}
	
	//@Test
	public void selectPhotoTest() {
		log.info("selectPhoto : {}", dao.selectPhoto("summer1234@naver.com"));
	}
	
	//@Test
	public void passwordCheckTest() {
		log.info("passwordCheck : {}", encoder.matches("1234", dao.passwordCheck("summer1234@naver.com")));
	}
	
	//@Test
	public void resignTest() {
		log.info("deleteUser : {}", dao.deleteUser("summer1234@naver.com") != 0);
		log.info("deleteAuthority : {}", dao.deleteAuthority("summer1234@naver.com") != 0);
	}
	
	//@Test
	public void missmatchTest() {
		log.info("missmatch : {}", dao.missmatch("summer1234@naver.com") != 0);
		log.info("missmatch : {}", dao.missmatch("summer1234@naver.com") != 0);
		log.info("missmatch : {}", dao.missmatch("summer1234@naver.com") != 0);
		log.info("missmatch : {}", dao.missmatch("summer1234@naver.com") != 0);
		log.info("missmatch : {}", dao.missmatch("summer1234@naver.com") != 0);
		log.info("missmatch : {}", dao.missmatch("summer1234@naver.com") != 0);
		log.info("missmatch : {}", dao.missmatch("summer1234@naver.com") != 0);
		log.info("missmatch : {}", dao.missmatch("summer1234@naver.com") != 0);
		log.info("missmatch : {}", dao.missmatch("summer1234@naver.com") != 0);
		log.info("missmatch : {}", dao.missmatch("summer1234@naver.com") != 0);
	}
	
	//@Test
	public void resetMissMatchTest() {
		log.info("resetMissMatch : {}", dao.resetMissMatch("summer1234@naver.com") != 0);
	}
	
	//@Test
	public void selectMissmatchCntTest() {
		log.info("selectMissmatchCnt : {}", dao.selectMissmatchCnt("summer1234@naver.com"));
	}
	
	//@Test
	public void reportTest() {
		log.info("report : {}", dao.report("summer1234@naver.com") != 0);
	}
	
	//@Test
	public void findByReportCntTest() {
		Map<String , Object> map = new HashMap<String, Object>();
		map.put("reportCnt", 0);
		map.put("maxRow", 10);
		map.put("minRow", 0);
		
		log.info("findByReportCnt : {}", dao.findByReportCnt(map));
	}
	
	//@Test
	public void changeEnabledTest() {
		UserDto.changeEnabled user = new UserDto.changeEnabled();
		user.setEmail("summer1234@naver.com");
		user.setEnabled('F');
		log.info("changeEnabled : {}", dao.changeEnabled(user) != 0);
	}
}
	