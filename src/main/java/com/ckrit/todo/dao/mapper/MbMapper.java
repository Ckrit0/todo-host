package com.ckrit.todo.dao.mapper;

import java.util.HashMap;

import org.apache.ibatis.annotations.Mapper;

import com.ckrit.todo.dto.Member;

@Mapper
public interface MbMapper {
	public int join(HashMap<String, Object> joinMap);
	public int changePw(HashMap<String, Object> changePwMap);
	public int leave(Integer mbNo);
	public int auth(Integer mbNo);
	public Member getMbByMbNo(Integer mbNo);
	public Member getMbByIdPw(HashMap<String, Object> loginMap);
	public int findId(String mbId);
	public int findEmail(String mbEmail);
	
}
