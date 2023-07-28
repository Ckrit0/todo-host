package com.ckrit.todo.service;

import java.util.HashMap;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class MbService {

	public HashMap<String, Object> getJoinMapByReqBody(String reqBody) {
		JSONObject reqObject = new JSONObject(reqBody);
		String mbId = reqObject.getString("mbId");
		String mbEmail = reqObject.getString("mbEmail");
		String mbPw = reqObject.getString("mbPw");
		// 패스워드 암호화 필요
		HashMap<String, Object> joinMap = new HashMap<>();
		joinMap.put("mbId", mbId);
		joinMap.put("mbEmail", mbEmail);
		joinMap.put("mbPw", mbPw);

		return joinMap;
	}

	public HashMap<String, Object> getChangePwMapByReqBody(String reqBody) {
		JSONObject reqObject = new JSONObject(reqBody);
		Integer mbNo = reqObject.getInt("mbNo");
		String mbPw = reqObject.getString("mbPw");
		// 패스워드 암호화 필요
		HashMap<String, Object> changePwMap = new HashMap<>();
		changePwMap.put("mbNo", mbNo);
		changePwMap.put("mbPw", mbPw);
		return changePwMap;
	}

	public Integer getMbNo(String reqBody) {
		JSONObject reqObject = new JSONObject(reqBody);
		Integer mbNo = reqObject.getInt("mbNo");
		return mbNo;
	}

	public HashMap<String, Object> getLoginMapByReqBody(String reqBody) {
		JSONObject reqObject = new JSONObject(reqBody);
		String mbId = reqObject.getString("mbId");
		String mbEmail = reqObject.getString("mbEmail");
		String mbPw = reqObject.getString("mbPw");
		// 패스워드 암호화 필요
		HashMap<String, Object> loginMap = new HashMap<>();
		loginMap.put("mbId", mbId);
		loginMap.put("mbEmail", mbEmail);
		loginMap.put("mbPw", mbPw);
		return loginMap;
	}

}
