package com.ckrit.todo.validate;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.ckrit.todo.dao.mapper.MbMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MbValidate {
	private final MbMapper mbMapper;

	public boolean validateJoinMap(HashMap<String, Object> joinMap) {
		boolean canJoin = false;
		if(mbMapper.findId((String)joinMap.get("mbId")) + mbMapper.findEmail((String)joinMap.get("mbEmail")) == 0) {
			canJoin = true;
		}
		return canJoin;
	}

}
