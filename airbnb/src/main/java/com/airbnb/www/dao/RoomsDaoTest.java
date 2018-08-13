package com.airbnb.www.dao;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="file:src/main/webapp/WEB-INF/spring/**/*-context.xml")
@WebAppConfiguration
public class RoomsDaoTest {
	@Autowired
	private RoomsDao dao;
	
	@Test
	public void setUpTest() {
		System.out.println("hi");
		assertThat(dao, is(notNullValue()));
	}
	
	@Test
	public void CRUDTest() {
		dao.create();
		dao.update();
		assertThat(dao.read().equals("aaa"),is(true));
		dao.delete();
		assertThat(dao.read(),is(nullValue()));
	}

}
