package com.ckrit.todo.dao.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ckrit.todo.dto.Todo;

@Mapper
public interface TdMapper {

	int tdNew(HashMap<String, Object> tdNewMap);

	int tdUpdate(HashMap<String, Object> tdUpdateMap);

	int changeTargetDate(HashMap<String, Object> changeTargetDateMap);

	int complete(Integer tdNo);

	int delete(Integer tdNo);

	int cancelComplete(Integer tdNo);

	List<Todo> getAllTdOrderDate(Integer mbNo);

	List<Todo> getAllTdReverseDate(Integer mbNo);

	List<Todo> getAllTdOrderTargetdate(Integer mbNo);

	List<Todo> getAllTdReverseTargetdate(Integer mbNo);

	List<Todo> getProgressTdOrderDate(Integer mbNo);

	List<Todo> getProgressTdReverseDate(Integer mbNo);

	List<Todo> getProgressTdOrderTargetdate(Integer mbNo);

	List<Todo> getProgressTdReverseTargetdate(Integer mbNo);

}
