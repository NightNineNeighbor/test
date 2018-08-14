package com.airbnb.www.entity;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Authorities {
	private String email;
	private String authority;
}
