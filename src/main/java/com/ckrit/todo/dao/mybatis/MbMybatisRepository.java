package com.ckrit.todo.dao.mybatis;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.ckrit.todo.dao.MbRepository;
import com.ckrit.todo.dao.mapper.MbMapper;
import com.ckrit.todo.dto.Member;
import com.ckrit.todo.service.MbService;
import com.ckrit.todo.validate.MbValidate;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class MbMybatisRepository implements MbRepository{
	private final MbService mbService;
	private final MbMapper mbMapper;
	private final MbValidate mbValidate;

	@Override
	public boolean join(String reqBody) {
		boolean isSuccessJoin = false;
		HashMap<String, Object> reqBodyJson = mbService.getJoinMapByReqBody(reqBody);
		boolean canJoin = mbValidate.validateJoinMap(reqBodyJson);
		if(canJoin) {
			if(mbMapper.join(reqBodyJson) != 0) {
				isSuccessJoin = true;
			}			
		}
		return isSuccessJoin;
	}

	@Override
	public boolean changePw(String reqBody) {
		boolean isSuccessChangePw = false;
		HashMap<String, Object> reqBodyJson = mbService.getChangePwMapByReqBody(reqBody);
		if(mbMapper.changePw(reqBodyJson) != 0) {
			isSuccessChangePw = true;
		}
		return isSuccessChangePw;
	}

	@Override
	public boolean leave(String reqBody) {
		boolean isSuccessLeave = false;
		Integer mbNo = mbService.getMbNo(reqBody);
		if(mbMapper.leave(mbNo) != 0) {
			isSuccessLeave = true;
		}
		return isSuccessLeave;
	}

	@Override
	public boolean auth(String reqBody) {
		boolean isSuccessAuth = false;
		Integer mbNo = mbService.getMbNo(reqBody);
		if(mbMapper.auth(mbNo) != 0) {
			isSuccessAuth = true;
		}
		return isSuccessAuth;
	}

	@Override
	public Member getMbByMbNo(String reqBody) {
		Integer mbNo = mbService.getMbNo(reqBody);
		Member mb = mbMapper.getMbByMbNo(mbNo);
		return mb;
	}

	@Override
	public Member getMbByIdPw(String reqBody) {
		Member mb = new Member();
		HashMap<String, Object> reqBodyJson = mbService.getLoginMapByReqBody(reqBody);
		try {
			mb = mbMapper.getMbByIdPw(reqBodyJson);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return mb;
	}

}

