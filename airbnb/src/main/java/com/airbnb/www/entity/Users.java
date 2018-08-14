package com.airbnb.www.entity;

import java.util.*;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users {
	private String email;
	private String lastName;
	private String firstName;
	private String password;
	private Date birthDate;
	private String tel;
	private String saved_photo;
	private String original_photo;
	private String city;
	private String intro;
	private Integer reportCnt;
	private Integer missmatchCnt;
	private Character enabled;
}
