package com.ckrit.todo.dto;

import java.sql.Date;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Todo {
	private Integer tdNo;
	private Integer mbNo;
	private Date tdDate;
	private String tdContent;
	private Date tdTargetdate;
	private Integer tdIscomplete;
	private Date tdCompletedate;
	private Integer tdIsdelete;
	private Date tdDeletedate;
}
