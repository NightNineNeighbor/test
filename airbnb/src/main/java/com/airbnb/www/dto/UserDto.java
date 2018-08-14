package com.airbnb.www.dto;

import java.util.*;

import lombok.*;

public class UserDto {
	@Data
	public static class InsertUser {
		private String email;
		private String lastName;
		private String firstName;
		private String password;
		private Date birthDate;
	}
	
	@Data
	public static class InsertTel {
		private String email;
		private String tel;
	}
	
	@Data
	public static class Photo {
		private String savedPhoto;
		private String originalPhoto;
	}
	
	@Data
	public static class UpdatePhoto {
		private String email;
		private String saved_photo;
		private String original_photo;
	}
	
	@Data
	public static class Update {
		private String email;
		private String lastName;
		private String firstName;
		private String city;
		private String intro;
	}
	
	@Data
	public static class Read {
		private String email;
		private String lastName;
		private String firstName;
		private Date birthDate;
		private String tel;
		private String city;
		private String intro;
	}
	
	@Data
	public static class findByReportCnt {
		private String email;
		private String lastName;
		private String firstName;
		private Integer reportCnt;
	}
	
	@Data
	public static class changeEnabled {
		private String email;
		private Character enabled;
	}
}
