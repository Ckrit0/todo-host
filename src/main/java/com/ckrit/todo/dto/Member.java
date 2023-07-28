package com.ckrit.todo.dto;

import java.sql.Date;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Member {
	private Integer mbNo;
	private String mbId;
	private String mbEmail;
	private String mbPw;
	private Date mbJoindate;
	private Integer mbIsleave;
	private Date mbLeavedate;
	private Integer mbAuth;
}
