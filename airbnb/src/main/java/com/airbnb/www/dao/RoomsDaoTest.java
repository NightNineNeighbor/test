package com.airbnb.www.dao;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

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
	public void readTest() {
		System.out.println(dao.read());
		assertThat(dao.read(),is(notNullValue()));
	}

}
