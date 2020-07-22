package com.skydevilk.MyDiary.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDto {
	private long uid;
	private String email;
	private String password;
	private String nickname;
	private String kakaotalkId;
	private String naverId;
	private String googleId;
	private String facebookId;
}