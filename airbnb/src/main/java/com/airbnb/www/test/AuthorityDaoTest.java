package com.airbnb.www.test;

import org.junit.*;
import org.junit.runner.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.test.context.*;
import org.springframework.test.context.junit4.*;

import com.airbnb.www.entity.*;
import com.airbnb.www.repository.*;

import lombok.extern.slf4j.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Slf4j
public class AuthorityDaoTest {
	@Autowired
	private AuthorityDao dao;
	
	//@Test
	public void setupTest() {
		log.info("DAO : {}", dao != null);
	}
	
	//@Test
	public void insertAuthority() {
		Authorities authority = new Authorities();
		authority.setEmail("summer1234@naver.com");
		authority.setAuthority("ROLE_ADMIN");
		
		log.info("insertAuthority : {}", dao.insertAuthority(authority) != 0);
	}
	
	//@Test
	public void deleteAuthority() {
		Authorities authority = new Authorities();
		authority.setEmail("summer1234@naver.com");
		authority.setAuthority("ROLE_USER");
		
		log.info("deleteAuthority : {}", dao.deleteAuthority(authority) != 0);
	}
	
	//@Test
	public void selectAuthority() {
		log.info("selectAuthority : {}", dao.selectAuthority("summer1234@naver.com"));
	}
}
