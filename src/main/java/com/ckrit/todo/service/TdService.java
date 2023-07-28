package com.ckrit.todo.service;

import java.util.HashMap;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TdService {

	public HashMap<String, Object> getNewMapByReqBody(String reqBody) {
		JSONObject reqObject = new JSONObject(reqBody);
		Integer mbNo = reqObject.getInt("mbNo");
		String tdContent = reqObject.getString("tdContent");
		String dateString = reqObject.getString("tdTargetdate");
		HashMap<String, Object> tdNewMap = new HashMap<>();
		tdNewMap.put("mbNo", mbNo);
		tdNewMap.put("tdContent", tdContent);
		tdNewMap.put("tdTargetdate", dateString);
		return tdNewMap;
	}

	public HashMap<String, Object> getUpdateMapByReqBody(String reqBody) {
		JSONObject reqObject = new JSONObject(reqBody);
		Integer tdNo = reqObject.getInt("tdNo");
		String tdContent = reqObject.getString("tdContent");
		HashMap<String, Object> tdUpdateMap = new HashMap<>();
		tdUpdateMap.put("tdNo", tdNo);
		tdUpdateMap.put("tdContent", tdContent);
		return tdUpdateMap;
	}

	public HashMap<String, Object> getChangeTargetDateMapByReqBody(String reqBody) {
		JSONObject reqObject = new JSONObject(reqBody);
		Integer tdNo = reqObject.getInt("tdNo");
		String dateString = reqObject.getString("tdTargetdate");
		HashMap<String, Object> changeTargetDateMap = new HashMap<>();
		changeTargetDateMap.put("tdNo", tdNo);
		changeTargetDateMap.put("tdTargetdate", dateString);
		return changeTargetDateMap;
	}

	public Integer getTdNo(String reqBody) {
		JSONObject reqObject = new JSONObject(reqBody);
		Integer tdNo = reqObject.getInt("tdNo");
		return tdNo;
	}

}
