package com.ckrit.todo.dao.mybatis;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ckrit.todo.dao.TdRepository;
import com.ckrit.todo.dao.mapper.TdMapper;
import com.ckrit.todo.dto.Todo;
import com.ckrit.todo.service.MbService;
import com.ckrit.todo.service.TdService;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class TdMybatisRepository implements TdRepository {
	private final TdService tdService;
	private final TdMapper tdMapper;
	private final MbService mbService;

	@Override
	public boolean tdNew(String reqBody) {
		boolean isSuccessNew = false;
		HashMap<String, Object> reqBodyJson = tdService.getNewMapByReqBody(reqBody);
		if (tdMapper.tdNew(reqBodyJson) != 0) {
			isSuccessNew = true;
		}
		return isSuccessNew;
	}

	@Override
	public boolean tdUpdate(String reqBody) {
		boolean isSuccessUpdate = false;
		HashMap<String, Object> reqBodyJson = tdService.getUpdateMapByReqBody(reqBody);
		if (tdMapper.tdUpdate(reqBodyJson) != 0) {
			isSuccessUpdate = true;
		}
		return isSuccessUpdate;
	}

	@Override
	public boolean changeTargetDate(String reqBody) {
		boolean isSuccessUpdate = false;
		HashMap<String, Object> reqBodyJson = tdService.getChangeTargetDateMapByReqBody(reqBody);
		if (tdMapper.changeTargetDate(reqBodyJson) != 0) {
			isSuccessUpdate = true;
		}
		return isSuccessUpdate;
	}

	@Override
	public boolean complete(String reqBody) {
		boolean isSuccessUpdate = false;
		Integer tdNo = tdService.getTdNo(reqBody);
		if (tdMapper.complete(tdNo) != 0) {
			isSuccessUpdate = true;
		}
		return isSuccessUpdate;
	}

	@Override
	public boolean cancelComplete(String reqBody) {
		boolean isSuccessUpdate = false;
		Integer tdNo = tdService.getTdNo(reqBody);
		if (tdMapper.cancelComplete(tdNo) != 0) {
			isSuccessUpdate = true;
		}
		return isSuccessUpdate;
	}

	@Override
	public boolean delete(String reqBody) {
		boolean isSuccessUpdate = false;
		Integer tdNo = tdService.getTdNo(reqBody);
		if (tdMapper.delete(tdNo) != 0) {
			isSuccessUpdate = true;
		}
		return isSuccessUpdate;
	}

	@Override
	public List<Todo> getAllTdOrderDate(String reqBody) {
		Integer mbNo = mbService.getMbNo(reqBody);
		List<Todo> todos = tdMapper.getAllTdOrderDate(mbNo);
		return todos;
	}

	@Override
	public List<Todo> getAllTdReverseDate(String reqBody) {
		Integer mbNo = mbService.getMbNo(reqBody);
		List<Todo> todos = tdMapper.getAllTdReverseDate(mbNo);
		return todos;
	}

	@Override
	public List<Todo> getAllTdOrderTargetdate(String reqBody) {
		Integer mbNo = mbService.getMbNo(reqBody);
		List<Todo> todos = tdMapper.getAllTdOrderTargetdate(mbNo);
		return todos;
	}

	@Override
	public List<Todo> getAllTdReverseTargetdate(String reqBody) {
		Integer mbNo = mbService.getMbNo(reqBody);
		List<Todo> todos = tdMapper.getAllTdReverseTargetdate(mbNo);
		return todos;
	}

	@Override
	public List<Todo> getProgressTdOrderDate(String reqBody) {
		Integer mbNo = mbService.getMbNo(reqBody);
		List<Todo> todos = tdMapper.getProgressTdOrderDate(mbNo);
		return todos;
	}

	@Override
	public List<Todo> getProgressTdReverseDate(String reqBody) {
		Integer mbNo = mbService.getMbNo(reqBody);
		List<Todo> todos = tdMapper.getProgressTdReverseDate(mbNo);
		return todos;
	}

	@Override
	public List<Todo> getProgressTdOrderTargetdate(String reqBody) {
		Integer mbNo = mbService.getMbNo(reqBody);
		List<Todo> todos = tdMapper.getProgressTdOrderTargetdate(mbNo);
		return todos;
	}

	@Override
	public List<Todo> getProgressTdReverseTargetdate(String reqBody) {
		Integer mbNo = mbService.getMbNo(reqBody);
		List<Todo> todos = tdMapper.getProgressTdReverseTargetdate(mbNo);
		return todos;
	}

}
